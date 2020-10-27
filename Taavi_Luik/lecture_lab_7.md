# Systems Modeling 2020

## Lecture 7 (20.10.2020)

### Preparation - Videos of State Chart Diagrams

#### State Chart Pros, Group 9

Strongest points:
- Can be used for defining requirements and design
- Can be easily changed and also used to generate code 
- Good for finding errors, exceptions, bugs, verify requirements, especially in safety critical systems.

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

**Recursion question**: Why would Ulno fire people who use recursion?

As said by Ulno himself: if the amount of states are unbounded, it can lead to performance degradation. Especially in commercial/industrial level applications. The stack can get very big. 

So an iterative approach can work better than recursion. I recall seeing this also when we were implementing Fibonacci numbers in our algorithmics class. 

### Breakout rooms

#### Notes for Group Nr 3

**Moderator**: Karel Roots

**Note-Taker**: Jazib Sawar

**Opening Notes**

Today topic is State Chart Pro

**First Person Pro Notes**

Orkhan: Model-checking is a method for checking whether a finite-state model of a system meets a given specification. This is typically associated with hardware or software systems. It can also be used for testing.

**Second Person Con Notes**

Daniel: They can get messy because there are many states involved. And It can become hard to read. 

Karel: Maintenance of diagrams is very difficult. 

**Third Person Pro Notes**

Taavi: Certain problems can become apparent before coding like dead ends. If we map states, it becomes easy to see what’s going on. 

**Fourth Person Con Notes**

Karmen: I think something was mentioned about how it is quite easy to create an incomplete state diagram if you forget to consider some transition for a certain combination of inputs. And some errors can come from there, if you're using this as a basis for code or creating code directly from that. 

Karel: You can’t take them as a basis because they can be incomplete. 

**Moderator Summary Notes**

First we had a pro that model checking is a method for checking whether a finite-state model of a system meets a given specification.  

Then we had a con that these diagrams can get messy because of so many states.

Then we had a pro, certain problems can become apparent before coding. 

Then we had a con, it can be quite easy to create incomplete diagrams. 

**Round 1 Person Challenge/Question Notes**

Taavi (Challenging 2nd Con): It is probably easier to look at diagrams than at code. As you have a full overview of the system rather than looking at code files.

**Round 1 Person Comment/Defense/Answer Notes**

Karmen: Can be agreed to some extent, probably it won't be too easy to see something missing on the diagram if it's too complex and hard to read anyway, but then it goes under the complexity problem.

Karel: It’s quite the same for code as you can miss something there as well. 

**Round 2 Person Challenge/Question Notes**

Rain (1st Con): It is the case with all the diagrams. If you put effort and design it properly and make them less they can be okay. 

**Round 2 Person Comment/Defense/Answer Notes**

Daniel: It’s true. I understand. I think that state charts have more complexity and are limited as we aren't able to model concurrent systems. 

**Round 3 Person Challenge/Question Notes**

Karel: Statecharts are too close to code. Then the question arises if we need state charts at all. What’s the need of a state chart then.

**Round 3 Person Comment/Defense/Answer Notes**

Taavi: Even though they are the same, state charts are totally different mediums and provide different perspectives. A picture can say more than code, especially for non-technical people.


**Free discussion to find best points for and against**

We had discussions inside the pro/con and challenge rounds.

**2 Best For**
- Point 1: Model-checking is a method for checking whether a finite-state model of a system meets a given specification. This is typically associated with hardware or software systems. It can also be used for testing.
- Point 2: Certain problems can become apparent before coding like dead ends. If we map states, it becomes easy to see what’s going on. This is specially important for security critical systems. If something goes wrong, it can be a disaster. 

**2 Best Against**
- Point 1: They can get messy because there are many states involved. And It can become hard to read. Maintenance of diagrams is very difficult.
- Point 2:  I think something was mentioned about how it is quite easy to create an incomplete state diagram if you forget to consider some transition for a certain combination of inputs. And some errors can come from there, if you're using this as a basis for code or creating code directly from that. 

### Lecture reflections

Sometimes it's really hard to understand what point someone is making, even if followed up by a question. Communication can be difficult to get right. 

### Lab reflections

Finally catching up with Mancala exercises. It feels good to get things to work, even if it was difficult and took way longer than at first planned. Skills and knowledge that was learned are really useful.
