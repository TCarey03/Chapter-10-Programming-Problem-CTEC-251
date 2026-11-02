public class Main {

    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        guard.displayState();

        // Test hearing noise while Idle
        guard.hearNoise();
        guard.displayState();

        // Test hearing noise while Patrolling
        guard.hearNoise();

        // Test seeing an enemy
        guard.seeEnemy();
        guard.displayState();

        // Test hearing noise while Attacking
        guard.hearNoise();

        // Test losing a target
        guard.loseTarget();
        guard.displayState();

        // Test losing a target while Patrolling
        guard.loseTarget();
    }
}
