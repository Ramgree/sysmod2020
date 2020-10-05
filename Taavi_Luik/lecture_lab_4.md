# Systems Modeling 2020

## Lecture 4 (29.09.2020)

### Preparation

#### Our own video: Component Diagrams Cons, Group 13

Strongest points:
- Component diagrams are hard to do well
- Component diagrams are in-between an abstract model and the real implementation, giving the benefits of neither. 
- It's impossible to show unmet requirements

Lessons learned:
- If you learn the meanings of elements and have a goal in mind, then component diagrams can work and be useful, even if they are hard to make.

What was hard:
- there is not that much reliable and thorough info available on the Internet and in the books we found. So we have to find our own examples, our own list of cons, but that is speculative since we don't have the experience of using them yet.

#### Component Diagrams Pros, Group 4

Strongest points:
- Can get a bird's eye view of the most important systems and how they relate to one-another
- They are not programming language specific

The examples in the video were nice.

#### Component Diagrams Pros, Group 14

Strongest points:
- Component diagrams show the main parts of the system
- Component diagrams simplify the high level view

I liked the idea of having a 5-step-program to create a component diagram.

#### Component Diagrams Cons, Group 12

Strongest points:
- Component diagrams can be hard to maintain in dynamic systems - i.e. systems where more interfaces/components/dependencies will be added in the future.

I think that a diagarm does not show all the implementations of an interface and hence the diagram does not have to get cluttered.

----

Since I was also recording for this week, I'll reiterate the points I made in the video:

- Various elements in a component diagram can be expressed in multiple ways, which might lead to confusion unless we are consistent with their usage.

- Component diagrams should not be very big and complex, which means that we might end up with many component diagrams, each of which will not be that informative.

- Component diagrams are hard to make well - one has to choose which details to omit and which to show.

#### Discussion

**What do you think is the advantage of “Domain Modeling” vs Class and Object modeling?**

It incorporates both behavior and data, does not have to be technical, can be done by anyone.

**What could be confusing here and lead to bad design?**
Our group thought: might lead to a model that developers don't understand due to not knowing terminology.

Ulno's main issues: behavior and data at the same time might lead to confusion [too much info?]. Also: “A visual dictionary of abstractions.” is very ambiguous.

**Data modelling vs functionality/business modelling**:

It depends on the details - some methods and data are good to show, but not everything at the same time in the same diagram.
Crucial data/behavior can be related to the goal of the diagram (the aspect that the diagram should capture or focus on).

Ulno: "class models are not good to model behavior." 
The last point is exactly the problem I had with the ATM scenarios to class diagrams and code assignment].

**How serious is the level of detail question - "it's too abstract or too concrete"**

I think it does not hold that well - you can scale it in either direction (show only the interface or instead their implementations or both). 

**Can component diagrams also be used to model non-object oriented systems – how well do they work for systems partly deployed to the cloud?**

For non-object oriented systems, I am unsure. Can a process be shown as a component or is that bad practice? It could be done, though. For systems deployed to the cloud, if there are still components, then their physical location should not matter - a cloud system could be shown as a separate component with subcomponents.

---
### Breakout rooms

I was in Breakout room 3,  I gave the first con point ('difficult to do well').

Notes for Group Nr 3
Moderator: Mike Camara
Note-Taker: Karmen Kink

**First Person Pro Notes**

Component diagrams simplify the high-level view of the system. They allow to hide the internal details of components and focus on the whole

**Second Person Con Notes**

Creating a component diagram includes multiple decisions, difficult to decide what to include and what to exclude

**Third Person Pro Notes**

Component diagrams can be used to model databases (can help when designing databases)

**Fourth Person Con Notes**

Component diagrams are more complicated than e.g. class diagrams, the syntax takes time to learn. Also, they can be difficult to maintain and can lead to confusion because of the complexity

**Moderator Summary Notes**

Based on the previous arguments, there seems to be a tendency to think of component diagrams negatively. That could possibly be overturned by someone’s positive experience

**Round 1 Person Challenge/Question Notes**

How are component diagrams useful exactly?

**Round 1 Person Comment/Defense/Answer Notes**

Component diagrams can help to understand how subparts interact with each other, especially useful for large systems

**Round 2 Person Challenge/Question Notes**

It is rather difficult to evaluate the decision making process, having no practical experience with component diagrams

**Round 2 Person Comment/Defense/Answer Notes**

[Added later by me] : but we can still speculate and predict.


**2 Best For**

- Point 1: The level of detail can be easily adjusted according to current needs (adaptability)
- Point 2: Component diagrams allow to hide internal details and create a cleaner high-level view

**2 Best Against**

- Point 1: Complicated to make good decisions on level of detail
- Point 2: The notation requires some effort to learn, otherwise the diagrams can lead to misunderstanding and confusion

---

**What was the hardest part to follow and why?**
The Umple notation and generated code was tricky to follow because it felt a bit bloated and messy. 

### Lecture reflections

It helps that the breakout room tasks are very similar so less time is spent on trying to quickly understand the tasks. It really helps also to have people who are up for moderating (and a good moderator is hard to find!). I like abstraction and hence I like component diagrams.

### Lab reflections

We divided tasks and worked individually. I feel that some of the tasks (e.g. ATM ones) take a long time because we have to think of the design of the system - which is hard, especially if we don't have proper knowledge of the domain. A one-time task is one thing, but if the work continues on next labs/lectures, then we have to potentially redo earlier work. Maybe there is some simpler system that we could do instead, or at least get more knowledge of the domain? Or am I overthinking and the details don't really matter?
