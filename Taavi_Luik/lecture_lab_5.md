# Systems Modeling 2020

## Lecture 5 (06.10.2020)

### Preparation - Videos of Use Case Diagrams

#### System Modeling Use Case Diagram Pros, Group 1

Strongest points:
- Use Case diagrams allow to analyze the system from the perspective of the end user, hence focus on the functionality.
- They help us to see alternative ways how to achieve a good system.
- They are (or: can be) easy to understand by non-technical people (helps with communication).

Lessons learned:
- Personas and actors are different things

The tutorial on how to create a use case diagram was a good idea, but perhaps could have been shorter. I think that using the 'include' and 'extend' nomenclature to talk about dependent and independent events is very confusing. Can a use case diagram not use the words 'dependent' instead?
If I would be a non-technical person, I would immediately ask why the Withdraw money function 'extends' the Print receipt function. It was also unclear how use case diagrams are good for analytics.

#### System Modeling Use Case Diagram Cons and Pros, Group 11

Strongest Cons:
- They scatter features and objects
- Potential for inconsistency and confusion
- Cannot be used for testing (because requirements cannot be specified well enough)
- A good use case diagram takes time because of interviews
- They can be hard to understand for developers and lead to misunderstandings
- It's difficult to create personas - based on which property? How to make sure that big groups of users are not left out?

Strongest Pros:
- They model system requirements
- Easy to understand

Lessons learned:
- A persona is more than a user, e.g. a certain demographic stereotype that helps answer some design questions for many people at the same time.

Some parts were hard to follow due to the amount of information and speed of presentation. A point was given, but not always followed up, clarified, explained, how exactly this is a problem.

#### System Modeling User Story Diagram Pros, Group 3 

Strongest points:
- Easy to use, can be created with stakeholders
- Can help decide what aspects of a system to test (acceptance testing, high level)
- Can help list the features of a system - the main use cases are the main features.
- Can help lead to good UX - they show actual functionality that is required and UX can be tailored to that.

Lessons learned:
- User Story diagrams are like the text versions of Use Case diagrams.

Music was slightly loud during some quiet presenters. 

#### System Modeling Use Case Diagrams & Personas, Group 5

Strongest points:
- Persona modelling can sometimes overcome bad stakeholder analysis
- In-depth interviews are expensive and time-consuming; many personas are required 
- Focusing on function leaves out non-functional aspects (which are also important)
- The logic in the diagram is linear and simplified, but in reality there are loops, conditions etc.
- Hard to do well (where to draw the line regarding how many use cases to include?)
- Objects and classes are scattered over multiple use cases

Lessons learned:
- A persona might become too average. They should be based on research, not just made up.
- Personas are detailed (motivations, habits etc are specified)


----

### Discussion

**For whom are we building software architecture, or creating system models? Give an argument for each of the 3 picks.** 

1. Software architects - they are the ones who actually create/design the architecture, so they are the ones creating the models (or reading them). These high level decisions can be easily put into diagrams/models and communicated/verified in such a way.

2. Initial developers - in order to create the initial code well, some high level abstractions are useful. They can help understand which parts communicate more, are closer to one-another, which share dependencies etc. Visually we can grok such information; in text it would be difficult to find

3. Maintaining developers - when joining an existing codebase (unless it's very small), it helps to have some abstractions, some top-to-bottom descriptions in order to get familiar with it faster. 

Then again I don't really know what's the role and tasks of a software architect (plus it can vary per company and per project; some people can assume multiple roles). I would assume that architects would create and communicate via diagrams.

At the same time, if models are done and used well, then the end product will be better, so users will also benefit. As Mike said in the discussions, all software is done with users in mind, and they *will* benefit.


### Breakout rooms

**Breakouts** Room 3

**Moderator**: Richard

**Note-Taker**: Rain

**Opening Notes**

Lets start!

**First Person Pro Notes: Taavi**

Use case diagrams are easily understandable for everyone.

**Second Person Con Notes: Simo**

To describe embedded systems, where there is no user input. Use case diagrams are not good to describe non-functional requirements.

**Third Person Pro Notes: Richard**

Use case diagrams capture the requirements from the end-users perspective so the end application is accurate.

**Fourth Person Con Notes: Rasul**

Difficult to plan architectural design or release iterations because use case diagrams are not object-oriented.

**Moderator Summary Notes**

Great. Got some good pros and cons.
*We went over the pros and cons as well*

**Round 1 Person Challenge/Question Notes (First pro and con)**

What if there are no users?

**Round 1 Person Comment/Defense/Answer Notes**

We can still use services, servers etc as ‘users’.

**Round 2 Person Challenge/Question Notes (Rasul’s con)**

You can still design your system even if your system is not object-oriented or involve iterations.

**Round 2 Person Comment/Defense/Answer Notes**

OOP makes systems more understandable and easy to develop.

**Round 3 Person Challenge/Question Notes (Richard’s pro)**

You can’t put down performance requirements. It can see functional requirements but not performance requirements.

**Round 3 Person Comment/Defense/Answer Notes**

Use case diagrams still benefit the developer to make the application to work how the end user wants. There can be other diagrams to counter this problem but this does not undervalue use case diagrams. You don’t have to get all the requirements from one diagram.

**Free discussion to find best points for and against**

Actors are general, personas are precise, similar to object diagrams and class diagrams.
Getting precise personas is expensive and time-consuming. It is not worth it.

Personas help you capture real requirements. Personas can give a concrete example in a developing the requirements and therefore help the development as a whole.

**2 Best For**
- Point 1: Use case diagrams capture the requirements from the end-users perspective so the end application is accurate.
- Point 2: Personas help you capture real requirements.

**2 Best Against**
- Point 1: To describe embedded systems, where there is no user input. Use case diagrams are not good to describe non-functional requirements.
- Point 2: Getting precise personas is expensive and time-consuming. It is not worth it.

I thought that you cannot put down things like performance requirements, but actually Ulno explained that in text you can describe many things and user stories are one of the few places that have this flexibility, this ability to specify them.

### Lecture reflections

I liked the question on for whom the diagrams are for. This should always be in mind - *why am I doing this, for whom is this useful*? Otherwise we might add redundant or irrelevant information and just waste time. 

### Lab reflections

It was difficult to work this week during the lab since I was exhausted from all the homeworks. I need to manage my time better. Sometimes also to stop when results are good enough. 
