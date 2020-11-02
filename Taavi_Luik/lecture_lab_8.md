# Systems Modeling 2020

## Lecture 8 (27.10.2020)

### Preparation - Videos of Diagrams

#### Activity Diagrams Cons, Group 8

Strongest points:
- ADs are not always object oriented - this might not be that useful for programmers
- While there is support for conditional logic, then the diagram becomes more messy with more complicated conditionals.
- Sometimes ADs are redundant and simple use case table might be better (esp if no concurrency is happening etc).

Lessons learned:
- Activity diagrams are very similar to flowcharts.
- There is only a limited amount of notation that each new diagram type introduces. Old notation is reused, which makes learning every new diagram easier, which is nice. 

Since ADs are behavioral diagrams, not structural, then I guess some lack of object-orientedness is expected.

#### Activity Diagrams Pros, Groups 2 & 6

Strongest points:
- ADs can be use wherever behavior needs to be described or control flows need to be modelled.
- ADs can be good for analysts since they can be understood by both analysts and stakeholders.
- With a proper use of notation, a single AD can express the same ideas as multiple other diagrams.
- Low entry barrier for usage.

Lessons learned:
- ADs are like a zoomed in form of state charts. While state charts abstract the details away, ADs show them.
- Because ADs don't have to show *who* does the action, they can be used well in early part of designing.

I liked how clean the automatically created code was compared to code generated in earlier labs.

#### Event Storming - Alberto Brandolini

- In which contexts does Alberto use the term model or modeling during this presentation (try to at least find three - there are more)?
  - a) modelling a business line (domain modelling?) 
  - b) the need for many different models - people with different purposes need different knowledge (business modelling?)
  - c) preconditions, flow, outcomes (process modelling)
  - d) read models - i.e. information needed for a given user in order to make a certain decision

- How does Event Storming relate to the UML?
  - It's a diagram type, but it's simpler than many UML diagrams. It still has notation, but it's mostly about colors. It has structure, but it's mostly about a single axis (time). So it's simple, intended to be exploratory.

- What is the goal of Event Storming in terms of software development and understanding?
  - To make sense of the domain complexity. There is no need to write software faster, but to write better software. And understanding the domain is a big part of it. The goal is to model an entire business line.

- What does Bruce Lee have to do with all this?
  - "Bruce Lee state" is a state of a software developer of DD modelling where he feels like he could handle more requirements. When you are so comfortable with the model that you can start to anticipate complexity. I guess when you have good enough domain model, then this might actually happen. Actually when I think then this is something that I really like to do as well - to plan ahead, to think of edge cases etc - to design a system from the beginning so that it anticipates new additions in the future. But it can be easy to overanalyze, to think of problems or cases that in reality are impossible or extremely likely. So there is no replacement to knowing the domain itself.  

- optional (let's see if you can catch this): In which context does Alberto mention State Charts or State Machines (I think he mentions them only once, but pay attention)?
  - Didn't notice :(
  
#### Reflections and notes after reading Martin Fowler's chapter on Activity diagrams (from UML Distilled)

The biggest difference between flowcharts and activity diagrams is that ADs support parallel behavior. Also, there is a difference between activity and action, as an activity refers to a sequence of actions. 
Activity diagrams tell what happens, but not by whom. This can be OK, but it can also be an important limitation. Partly, this can be overcome by using partitions (swimlanes). It seems ADs might be really relevant for some parts of my thesis, if I need to show how some algorithms might work. ADs might not be the best idea for showing use cases since domain experts (non-technical, business people) might not understand them well.

----

### Breakout rooms

**Notes for Group Nr 2**

**Moderator**: Elen Tumasyan

**Note-Taker**: Taavi + Benjamin

**Opening Notes**

Let's start.

**First Person Pro Notes**

Rain : Perfect for describing complex algorithms. No other diagram does it as well as activity diagrams.

**Second Person Con Notes**

Elen : In trivial cases/systems, they can be redundant.

**Third Person Pro Notes**

Rasul: AD-s are useful in business modelling since they are understandable for both business people and end users.

**Fourth Person Con Notes**

Simo: the diagrams are so user friendly so it can cause a temptation to make them very complex where all details are put in.

**Fifth Person Pro Notes**

Jonathan: ADs are good for system validation.

**Moderator Summary Notes**

Interesting discussion.

**Round 1 Person Challenge/Question Notes**

Benjamin: disagrees with 1st pro argument. With really complex algorithms the diagram gets really messy : many branches, gets shady ...

**Round 1 Person Comment/Defense/Answer Notes**

Elen: You choose how complex it gets by highlighting core parts of the algorithm

Rain: Even if activity diagrams struggle to describe the algorithm, I would argue that no other diagram does it better.

**Round 2 Person Challenge/Question Notes**

Silver: Every diagram is redundant in some ways (in trivial cases/systems) so it is not a good point

**Round 2 Person Comment/Defense/Answer Notes**

Elen: e.g. systems in small applications can be better conveyed with use case diagrams or others as opposed to an activity diagram.

**Round 3 Person Challenge/Question Notes**

Benjamin: they are understandable for end users, but you have to understand basic logic and be able to model a problem with it.

**Round 3 Person Comment/Defense/Answer Notes**

Rasul : AD is the simplest diagram to clarify process for end users and BA

“In problem solving we need any kind of diagram for understanding the process and AD is one of the best way for clarify process for BA and end users”

**Round 4 Person Challenge/Question Notes**

Simo : (referring to fourth person con note) It depends only on the experience of the diagram maker, also picking the right information to show is entirely tied to this same person.

**Round 4 Person Comment/Defense/Answer Notes**

Elen: Becoming experienced also takes resources from the company.

**Free discussion to find best points for and against**

What are we winning or losing with activity diagram vs. imperative code? (Why?)
- We can see the branching with activity diagrams. Code can be scary for consumers. Stories are more understandable. Depends on the audience. 
- Winning with activity diagram - visual interpretation

**2 Best For**

- Point 1: Rasul: AD-s are useful in business modelling since they are understandable for both business people and end users.
- Point 2: Jonathan: ADs are good for system validation.

**2 Best Against**

- Point 1: Elen : In trivial cases/systems, they can be redundant.
- Point 2: Simo: the diagrams are so user friendly so it can cause a temptation to make them very complex where all details are put in.


### Lecture reflections

After the breakout discussion I thought that any sort of diagram for a non-trivial task is useful for finding problems with a design early on in the process, as long as the diagram doesn't take too long itself (draining time from implementing the algorithm). But design is important, diagrams can help us visualize (and double check ourselves) or communicate design to others *before* we actually implement it. 

I have seen the usefulness of diagrams as means of communication in my current internship multiple times. *Especially if* people don't share your background or know the problem in detail, then visualizations (exclusively or additionally to other methods) help a lot.

### Lab reflections

Once the basic steps of creating a diagram are known (both theoretical - what is the notation - and practical - how to draw it using the software I am using) then it becomes much more enjoyable to design and use diagrams. 
