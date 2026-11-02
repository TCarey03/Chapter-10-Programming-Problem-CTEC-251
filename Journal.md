Phase 1 Journal – Manual Conditional Logic

For Phase 1, I created a SentinelGuard class using an enum to keep track of the guard's current state. I used switch statements and an if/else statement to control what happens when the guard hears a noise, sees an enemy, or loses a target.

I had to check multiple conditions across the methods to make sure the guard responded correctly depending on its current state.

If I needed to add a new state like Sleeping or Panicked, I would have to go back and modify multiple methods to add the new behavior. This could make the program harder to maintain as it gets bigger.

---------------------

Phase 2 Journal – The State Pattern

In Phase 2, I changed my program to use the State Pattern. I created a GuardState interface and separate classes for Idle, Patrolling, and Attacking.

The SentinelGuard class is the Context because it holds the current state and passes actions to the correct state object. Each state class is responsible for its own behavior and transitions.

Delegating to separate objects makes the code cleaner because I don't need multiple if/else or switch statements in SentinelGuard. It also makes adding new states easier because each state can have its own class.
