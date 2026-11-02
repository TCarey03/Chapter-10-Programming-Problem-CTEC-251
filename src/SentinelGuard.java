public class SentinelGuard {

    // Define the guard's possible states
    enum State {
        IDLE,
        PATROLLING,
        ATTACKING
    }

    // Default state
    private State currentState = State.IDLE;

    // Handle hearing a noise
    public void hearNoise() {
        switch (currentState) {
            case IDLE:
                currentState = State.PATROLLING;
                System.out.println("Guard heard a noise and is now investigating.");
                break;

            case PATROLLING:
                System.out.println("Guard is already on alert.");
                break;

            case ATTACKING:
                System.out.println("Guard is too busy fighting to notice the noise.");
                break;
        }
    }

    // Handle seeing an enemy
    public void seeEnemy() {
        currentState = State.ATTACKING;
        System.out.println("Guard spotted an enemy and is now attacking!");
    }

    // Handle losing a target
    public void loseTarget() {
        if (currentState == State.ATTACKING) {
            currentState = State.PATROLLING;
            System.out.println("Guard lost the enemy and is searching for them.");
        } else {
            System.out.println("No target to lose.");
        }
    }

    // Display current state
    public void displayState() {
        System.out.println("Current State: " + currentState);
    }
}
