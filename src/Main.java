public class Main {

    public static void main(String[] args) {

        // Start the guard sleeping
        SentinelGuard guard = new SentinelGuard(true);

        guard.seeEnemy();

        guard.loseTarget();

        guard.hearNoise();

        guard.seeEnemy();

        guard.loseTarget();
    }
}
