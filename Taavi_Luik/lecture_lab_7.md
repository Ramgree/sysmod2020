# Systems Modeling 2020

## Lecture 7 (20.10.2020)

### Preparation - Videos of State Chart Diagrams

#### State Chart Pros, Group 9

Strongest points:
- Can be used for defining requirements and design
- Can be easily changed and also used to generate code 
- Good for finding errors, exceptions, bugs, verify requirements, especially in safety critical systems.
- 

Lessons learned:
- Statecharts have more possibilities than finite state machine (FSM) diagrams.
- Statecharts are based on FSM.
- Statecharts are used where in reactive or control-oriented systems, where reacting to external signals is more important than business logic.

This video had a nice, thorough introduction. 

#### State Chart Diagrams Pros, Group 11

Strongest points:
- State diagrams make the system behavior more visible and easier to understand
- Clustering can be used to simplify complex state behavior
- They make it easier to understand some complex processes

I loved the choice of music, but it was too loud.

#### State Chart Diagrams Cons, Group 7

Strongest points:
- There is much notation that that can create confusion.
- An object can get stuck in a state if it's modelled as such. There might not be any recovery path.
- State explosion - in bigger systems, a naive state chart diagram can lead to a messy diagram. There are solutions to deal with this, but it requires some time to familiarise with the notation.

Lessons learned:
- FSM can only be in one state at a time. This and other limitations were the reason why they were extended.

I liked the example of concurrent states in the context of taking a class. Sometimes these non-CS examples can be really good to get the idea across.

#### State Chart Diagram Cons, Group 10

Strongest points:
- Classic state chart diagrams require a lot of states and events to be shown.
- Can be easily mixed up with activity diagrams
- Useful only for states

Lessons learned:
- State charts can get very complex if you are dealing with a system with many 'interrupts' or events (e.g. calculator).

----

Martin Fowler says that state charts are not very good when describing behavior involving many objects collaborating. In such situations, other diagram types should be used as well.
One should always use a mix of techniques that work for them. Don't be a completionist and make a state diagram for every class in a system.

### Discussion

TODO

### Breakout rooms

TODO

### Lecture reflections

TODO

### Lab reflections

TODO
