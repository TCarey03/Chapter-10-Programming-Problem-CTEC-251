public class IdleState implements GuardState {

    private SentinelGuard guard;

    public IdleState(SentinelGuard guard) {
        this.guard = guard;
    }

    @Override
    public void hearNoise() {
        System.out.println("Guard heard a noise and is now investigating.");
        guard.setState(new PatrollingState(guard));
    }

    @Override
    public void seeEnemy() {
        System.out.println("Guard spotted an enemy and is now attacking!");
        guard.setState(new AttackingState(guard));
    }

    @Override
    public void loseTarget() {
        System.out.println("No target to lose.");
    }
}
