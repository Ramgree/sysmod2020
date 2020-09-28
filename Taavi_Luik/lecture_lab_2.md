Lecture 2 notes: 
------------------------
# Systems Modeling 2020

## Lecture 2 (15.09.2020)

### Preparation

**Watch the movies.**

**Prepare 2 pro and 2 con arguments in advance for the movie topic(s). Bring one example where using this approach makes sense and one where it doesn't.**<br>

**Pros**<br>

- Object diagrams can be easy to grasp for non-technical people.

- They give a concrete example of the system; it's not too abstract.

**Cons**<br>

- ODs can become overwhelmingly complex when showing bigger systems.


While watching the movies of both parties note down in portfolio, what are main points I learned from the movie, what did I like/dislike.**<br>

Some examples of cons were of bad usages of the model. If a model is used  poorly (e.g. in a wrong environment or problem), then of course the diagram is not useful. 

There was also anecdotal arguments: "I have not seen it used, hence it's completely useless.". At the same time it's hard for students to assess diagram types without having used them or while having too little experience to appreciate them or see their value.

### Lecture tasks

#### Why do we need software architectures / system models?

- You will have some architecture whether you think about it explicitly or not.

- It's a good way of communicating the product to non-technical people (or even technical people) in a fast, easy to grasp way 

#### 2) Object diagram of news app

<img src="https://drive.google.com/file/d/1ilHuGSSMKnbOMo3e4uqud833C7ybTTj8/view?usp=sharing">

#### 3) Breakout

**Breakout E**

**Moderator**: Janna

**Note-Taker**: Rain

**Opening Notes**

This is a discussion between Rain, Cristian Noop, Sander Jenk, Taavi Luik and Huseyn Garayev. Welcome, let’s discuss the pros and cons for the object diagram. 

**First Person Pro Notes - Taavi**

Useful for prototyping. They are not too abstract. Easy to understand. Easy to scale. Easy to add/delete objects. Useful for testing.

**Second Person Con Notes - Cristian**

Only useful for small scopes. Not useful for big projects. Refactoring takes a lot of time. Needs constant updating (or there’s no point). Only most useful for object-orientated languages. Model-code gap. 

**Third Person Pro Notes - Sander**
They give a good overview and are easily understandable.

**Fourth Person Con Notes - Huseyn**

On large systems there are a lot of objects and subsystems (even in specific object diagrams). It is difficult to choose essential objects to include into the diagram.

**Moderator Summary Notes**

A lot of agreement in the pro sections, more cons overall and more distinctive cons. Both have very good points that have been discussed in the movies as well.

**Round 1 Person Challenge/Question Notes**

How is it easy to scale?

**Round 1 Person Comment/Defense/Answer Notes**

You can scale it up and down, but it can get clumsier if it gets too big. It doesn’t scale up well, but does scale down.

**Round 2 Person Challenge/Question Notes**

Refactoring takes a lot of time?

What was the model-code gap?

**Round 2 Person Comment/Defense/Answer Notes**

Refactoring isn’t easy because we are dealing with real data. 

Maintaining diagrams, code takes priority.

**Round 3 Person Challenge/Question Notes**

Choosing essential objects/properties can be done with a specific goal/client/bug in mind.

**Round 3 Person Comment/Defense/Answer Notes**

It’s always an issue to choose essential objects.

**Free discussion to find best points for and against**

Why not class diagrams instead of object diagrams? We would prefer class diagrams instead if we had to choose.

Choosing between Class and Object diagrams depends on the system we are prototyping. 

**2 Best For**

Point 1: for good prototyping

Point 2: for modelling dynamic objects

**2 Best Against**

Point 1: against effort-ly refactoring

Point 1: against difficult to choose the most essential objects

**Outcome**: there are good pro and con arguments. The Object Diagram works better in some situations and worse in others. Choosing when and how to use it is important.

### Lecure reflection:
This lecture was easier since everyone knew how to use the breakouts and are willing to talk and work together and have prepared for the lecture. Even if some people had technical difficulties and could not speak and could only write, there were enough people willing to work and the discussion was enjoyable.

### Lab reflection:
I spent a lot of time in PlantUML and the ATM assignment. It took much longer than I thought it will, but luckily we communicated this to the professor and we got an upper bound to the amount of diagrams we have to make.

We were recommended to not worry about adding too many details to user stories, which seems weird, but I guess it helps to make the stories more concrete.
