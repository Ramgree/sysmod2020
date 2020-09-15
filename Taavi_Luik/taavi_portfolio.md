# Systems Modeling 2020
## Taavi Luik - Portfolio
<br>

### Preparation task
* **Which types of diagrams are mentioned in the talk?**<br>
	UML, block diagram, layer diagrams. Also "the shopping list", "Boxes & no lines", "the functional view", "the airline route map", "the logical view", "HOCO", "Choose your own adventure" <br><br>
* **What is the standard for modeling software mentioned in the movie?**<br>
UML<br><br>
* **Why is nobody using it?**<br>
	He gives multiple reasons that he has heard: it's too complex, too low level, the notation is scary, agile teams or TDD don't do UML, <br><br>
* **What is the model-code gap and what is the problem with it?**<br>
The difference between architecture or high level understanding of software and the actual code. There should be correspondence between the two, but it's not always there. We think in one terms (e.g. components), but actually code in others (e.g. classes). To an extent this is inevitable, because the whole point of architecture/modelling is to create something abstract, which is easier to understand than the code, while code is always lower level than that.<br><br>
* **What do you personally think about layers for modeling software?**<br
	There are good reasons why layers should be considered - abstraction, encapsulation, they are helpful for testing. But every architecture should in the end be tailored to the domain/problem/application; there is no single best architecture. It's easy to fall into the trap of thinking you have layers with only one arrow going from each layer, whereas actually you have more arrows because methods are public etc. <br><br>
* **How do you think about Systems Modeling after watching this movie?**<br>
	I have understood the importance of modeling before watching the video, but it helped to reinforce that idea.<br><br>
* **Anything else remarkable from the movie, we should share/discuss?**<br>
	It's easy to abuse UML and it's often abused. Layers might not be a part of an architecture model, but rather an implementation detail that should be left out of high level diagrams. Multiple architecture diagrams, each with a different level of abstraction, are often better (simpler, more readable and informative) than a single huge diagram.<br><br>

### Lecture on 08.09
#### Task 1 - Who are you?
**<ins>Generic:</ins>**<br>
* **What do you expect from Systems Modeling?**<br>
I expect to learn more explicit and systematic ways of creating and thinking about software. <br><br>
* **Which SW architectures/modeling techniques have you already worked with?**<br>
I’ve used something similar to the Agile approach, not realising it at the time. Also was part of a game development project where we use Kanban (again, not realising it's Kanban).<br><br>

**<ins>Personal:</ins>**<br>
* **Who are you, why are you studying in SE master?**<br>
I'm Taavi Luik, actually studying computer science, 2nd year of Masters. I'm interested in algorithms, programming, designing systems, AI and ML. CS was the logical way to continue pursuing these interests.<br><br>
* **What are your sw development  skills?**<br>
I have designed/implemented/tested some small pieces of software in Java, but nothing big. Testing was to an extent automated, design had some diagrams, implementation was slightly done using some methodology to not fall into spaghetti code.<br><br>
* **What are your weaknesses regarding sw development?**<br>
Lack of a systematic approach where tools and methods are chosen carefully and best practices are followed (or at least acknowledged if not followed).<br><br><br>

#### Task 2 - What is software architecture?: 
**Definitions/examples for software architectures:**<br>
* Wikipedia gives the following definition: "Software architecture refers to the fundamental structures of a software system and the discipline of creating such structures and systems." (https://en.wikipedia.org/wiki/Software_architecture)

I think this basic, general definition works well as it mentions the most important - the fundamental structures. What are fundamental structures, how to create them etc, are details and more controversial.

I was travelling while attending the lecture and had to disconnect for 30 minutes, while breakout rooms were taking place.

#### Task 3 - University Solver

I would implement some objects to represent the rooms and their interactions, making them scalable (adding/removing them at will without breaking the system or requiring too much time). Then implement a brute force search algorithm since that takes the least amount of time to develop and given the small scale of the problem and the availability of computing power, it should perform well enough. Multithreading is also a possibility, would increase speeds ~4x on my laptop and would not take that much more extra work.
With more time, some input validation could be added and some optimizations (e.g. stop branches early if some condition is unmet).

#### Task 4 - Abstract and concrete
**Definitions:**<br>
* concrete: opposite to abstract; existing in physical form
* abstract: opposite to concrete; existing as an idea
* example: something characterising a rule or a member of a set

**Examples:**<br>
**abstract**|**concrete**
----------|----------
a university course | FouMath course
circle | my bicycle front wheel
noun | coffee cup
name | Taavi
OS | Windows XP

<br><br>
#### Task 5 - Stories as modeling arguments

* Pro: helps keep development relevant, i.e. a feature will have a story associated with it and it will be easier to evaluate whether the feature is necessary or not. Also they are relatively simple to think of, to begin the design process with.

* Con: might be too low level, requiring many user stories for smaller projects. As with everything, it can take time to use user stories well - e.g. do literally all aspects/features of a software require user stories or just the most important ones; can some choices be left as implementation details for the developer, if so, then which ones?


#### Reflection on lecture
I felt that some parts of the lecture were slightly too slow, but it just might take time to learn how to use the reverse classroom approach to its fullest. Also the technical difficulties will not last.

Given the shyness of most students and lack of previous contacts with many of them, teamwork always drags, but it's mostly in the beginning. I do have always preferred to work alone, though. But teamwork experience will be useful.

#### Reflection on lab
It took time to organize and to understand what is required from us. Some tasks (e.g. Mancala) seemed too complex for teaching something that is in essence quite simple. The setup (learning the rules) and process (playing the game) take longer than listing examples of situations. I do appreciate, however, applying  methods outside the domain of software engineering, as that can often simplify the task and teach the fundamentals, which can be independent of the domain.

### Lecture 2

#### Preparation task

Task: watch the 3 videos shared in Discord.

#### Object Diagrams Pros

Object diagrams show a complete or partial view of a modeled system at a specific time. 

**How would I make an object diagram for our course?**

I would create an object for each instructor (id, name, email, role), student (id, name, email, discord username) and group (student1, student2, student3, student4). Maybe also add an object also for lectures and labs (id, time, topic, classroom).

**Pros**:
- useful for prototyping
- useful for small portions in a bigger system
- they are not too abstract
- it's easy to change size/scope
- can be used in different test cases
- easy to understand

**Knowledge Checklist**: 
- What is the UML? It's a language designed to help model software architecture.
- What is an Object Diagram? It's a diagram with parts of a system (instatiations, not classes).
- What are the main purposes of an Object Diagram? To show an abstract, simplified view of a bigger system.
- What are the advantages of an Object Diagram? It's useful for prototyping and testing, it's easy to understand.

#### Object Diagrams Cons

The object has a name, attribute and links (arrows).

**Cons**: 
- it's relatively low level, hence a high level, abstract model of a while system is not possible
- they are object-oriented, so they are harder to use with functional languages
- they can be outdated when code changes, so need maintenance
- these diagrams may become excessive and unreadable

#### Object Diagrams Cons, Team 3

- It's not as useful nowadays (debuggers give the same info automatically)
- Hard to read in large systems
- Refactoring objects costs money and time
- Increases the chance of a model-code gap
- Confusion between objects and actors
