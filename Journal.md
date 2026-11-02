Phase 1 Journal – Manual Conditional Logic

For Phase 1, I created a SentinelGuard class using an enum to keep track of the guard's current state. I used switch statements and an if/else statement to control what happens when the guard hears a noise, sees an enemy, or loses a target.

I had to check multiple conditions across the methods to make sure the guard responded correctly depending on its current state.

If I needed to add a new state like Sleeping or Panicked, I would have to go back and modify multiple methods to add the new behavior. This could make the program harder to maintain as it gets bigger.

---------------------

Phase 2 Journal – The State Pattern

In Phase 2, I changed my program to use the State Pattern. I created a GuardState interface and separate classes for Idle, Patrolling, and Attacking.

The SentinelGuard class is the Context because it holds the current state and passes actions to the correct state object. Each state class is responsible for its own behavior and transitions.

Delegating to separate objects makes the code cleaner because I don't need multiple if/else or switch statements in SentinelGuard. It also makes adding new states easier because each state can have its own class.

---------------------

Phase 3 Journal – Open/Closed Principle

In Phase 3, I added a new SleepingState class that implements the GuardState interface. The guard can now ignore enemies while sleeping, stay asleep when losing a target, and wake up when hearing a noise.

I only had to create the SleepingState class and update the SentinelGuard constructor so the guard could start in the new state. I also updated Main.java to test the new behavior.

The existing IdleState, PatrollingState, and AttackingState classes did not need to be changed. This demonstrates the Open/Closed Principle because the program can be extended with new behavior without modifying the existing state classes.

---------------------

Phase 4 Journal – Validation and Reflection

In Phase 4, I tested the different states of my SentinelGuard program to make sure the transitions worked correctly. I started the guard in the Sleeping state and tested hearing noise, seeing an enemy, and losing a target. I also tested the Idle state to make sure the guard displayed the correct message when there was no target to lose.

Comparing Phase 1 to Phase 4, I found the State Pattern more extensible and easier to maintain. In Phase 1, I had to use multiple conditional statements to control the guard's behavior. In Phase 4, each state had its own class that handled its behavior.

The State Pattern made the program easier to organize because each class had a specific responsibility. Although it required creating more classes, I think this approach would be better for a larger professional project because adding new states does not require changing all the existing state classes.
