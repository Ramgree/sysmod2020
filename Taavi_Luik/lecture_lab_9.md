# Systems Modeling 2020

## Lecture 9 (03.11.2020)

### Preparation - Videos of Diagrams

#### Deployment Diagrams Pros by group 8

Strongest points:
- Useful for making decisions related to architecture (scalability, performance, portability, maintainability).
- Gives a good overview of hardware devices, software artifacts (in addition to external systems) and their relationships in the deployment process.

Lessons learned:
- Deployment diagrams show how hardware and software work together
- This is a diagram type that is least understandable and relevant for me since I don't have that much software engineering experience (esp when it comes to deployment). But I can see its uses, it's definitely a diagarm that can be useful in many contexts where actual deployment of software is done and needs to be planned.

#### Deployment Diagrams Cons by group 4

Strongest points:
- Lack of standards for visual notation
- Lack of notation for cloud environments
- Mixed abstraction levels

Lessons learned:
- Lack of syntax rules (or lack of people following them) can cause frustration if notation is really different between diagrams. So some well-chosen and agreed upon notation can be important.

The mixed abstraction levels con argument can also be a pro argument. Flexibility allows the designer to choose whether to do something or not and sometimes this flexibility allows us to add details that are really useful to communicate something.

----

Martin Fowler (in UML Distilled) writes that there's not much to say about them, but this doesn't mean that these diagrams shouldn't be used. They are useful for any nontrivial deployment. 

So far I've always had to deal with trivial deployment (deployment only in a local machine, or a machine basically identical to mine), hence it's slightly difficult to imagine myself using these diagrams (especially if I don't plan on working in software development in the near future). But it's good to know what notation is used so the next time I see one, I am better prepared to read them.

----

### Discussion

3 things that team leaders (scrum master, product owner, architecture owner) do:

**architecture owner**: 
- makes sure that most important functionality is expressed in diagrams and the diagrams are expressive and useful
- is responsible for architectural choices
- helps others with architectural questions

**scrum master**: 
- makes sure everybody has tasks and keeps working
- notices group cohesion issues and bottlenecks in the development cycle + helps to overcome them.
- helps with project management (git, docs)

**product owner**: 
- chooses what functionality should be covered in the end (increasing or decreasing, choosing priority in the course of the development if necessary)
- talks with architecture owner to agree on architecture choices
- answers questions about functionality for devs

### Breakout rooms

## Notes for Group Nr 4

**Moderator**: Ida Maria Orula

**Note-Taker**: Benjamin CAMP

**Opening Notes**

This is a discussion about deployment diagrams. Members of the group are: Benjamin C, Ida Maria Orula, Orkhan Jamaladdinov, Rain, Simo, Taavi Luik, Karl Vaba

**First Person Pro Notes**

Okhan : A good overview of hardware devices, software artifacts, and their relationship in the development process. Additionally specifies external systems that need to be interacted with.

**Second Person Con Notes**

Taavi : Lack of standards can lead to confusions.

**Third Person Pro Notes**

Benjamin : Good to make architecture-related decisions

**Fourth Person Con Notes**

Rain : Helping only a very specific group of people (devs & software architect), very technical

**Moderator Summary Notes**

**Round 1 Person Challenge/Question Notes**

Karl : If there is model-gap, the overview is biased

**Round 1 Person Comment/Defense/Answer Notes**

Taavi: the deployment diagram gives a different aspect of the system, so there might be a gap (details are left out), but no conflict (details conflict with one another).

**Round 2 Person Challenge/Question Notes**

Karl : Lack of standard is a double-edged sword : it also allow more freedom of modelling

**Round 2 Person Comment/Defense/Answer Notes**

Ida : Depends on the scale of freedom took : the more you take, the shadier it might get. Within small groups it’s good if they can choose their own notation, but it might be a problem if they need to share their work with others.

**Round 3 Person Challenge/Question Notes**

Ida Maria : A diagram being aimed to certain people is not necessarily a cons :they sometimes have to be technical enough to help his users

**Round 3 Person Comment/Defense/Answer Notes**

Rain: I think this can be solved with a simple whiteboard communication. No diagram necessary.

Counterpoint: diagrams are made to remain and be used as references, but once you wipe the board..

**Free discussion to find best points for and against**

**Glorified class diagrams question:**

Benjamin: deployment diagrams are too far from code to be considered a “glorified class diagram”.

Rain : “ They look like they are not useful during development for software devs”

Benjamin : “They are meant to act as a bridge between sysadmins and devs, to make communication easier”

Rain: “ But it is hard to express your ideas throught it”

Benjamin : “You can still express ideas throught a whiteboard presentation, diagram can be made after ! Diagram is made to remain, and be available for anyone that needs it.”

**2 Best For**
- Point 1: A good overview of hardware devices, software artifacts, and their relationship in the development process. Additionally specifies external systems that need to be interacted with.
- Point 2: Good to make architecture-related decisions

**2 Best Against**
- Point 1: Lack of standards can lead to confusions.
- Point 2: Helping only a very specific group of people (devs & software architect), very technical

### Lecture reflections

At first I was a bit afraid - I can do some modelling now, sure. But actual development? Okay, maybe I can find something that others are not that good at and it needs to be done. But if nobody knows some topic and I'd have to learn it from scratch, then that might be difficult. I considered stepping up for architecture master, but if I'd also have to advise regarding best practices, then I would lack knowledge to perform that role well. Would've been a nice challenge, but that role was taken by someone else - I usually need more time to think.

### Lab reflections

Work on the Miro board was slow to start. Luckily Ulno stepped in and helped us see how the big steps in a single scenario can be broken down to smaller and smaller steps and possible branches. We spent ~2h on this and got a lot of work done. We agreed that for next time we'll go over what we had done and write notes and questions. This should be enough to help us also add aggregates, commands, views and users.
