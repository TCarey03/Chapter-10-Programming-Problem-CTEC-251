public class Main {

    public static void main(String[] args) {

        // Start the guard sleeping
        SentinelGuard guard = new SentinelGuard(true);

        System.out.println("=== Starting Simulation ===");

        guard.displayState();

        // Sleeping ignores enemy
        guard.seeEnemy();
        guard.displayState();

        // Sleeping ignores losing a target
        guard.loseTarget();
        guard.displayState();

        // Noise wakes the guard
        guard.hearNoise();
        guard.displayState();

        // Guard spots an enemy
        guard.seeEnemy();
        guard.displayState();

        // Guard loses the enemy
        guard.loseTarget();
        guard.displayState();

        // Guard hears another noise
        guard.hearNoise();
        guard.displayState();

        // Test Idle edge case with a new guard
        System.out.println("\n=== Testing Idle State ===");

        SentinelGuard idleGuard = new SentinelGuard();

        idleGuard.displayState();

        idleGuard.loseTarget();
        idleGuard.displayState();

        System.out.println("=== Simulation Complete ===");
    }
}
