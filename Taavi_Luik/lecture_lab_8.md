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

### Discussion

TODO

### Breakout rooms

TODO

### Lecture reflections

TODO

### Lab reflections

TODO
