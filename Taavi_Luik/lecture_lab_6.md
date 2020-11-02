# Systems Modeling 2020

## Lecture 6 (13.10.2020)

### Preparation - Videos of Sequence Diagrams

#### Sequence Diagram Cons Group 14

Strongest points:
- Can be cumbersome and big with many objects.
- Close to the code level (low-level details take time to show)
- Will be outdated (if the diagrams come after the code, merely describe code, not be a basis *for* the code)
- Depend on appropriately named classes, objects, parameters

Lessons learned:
- SD-s are mostly used by developers.

It seems that the point regarding space inefficiency is more due to bad usage and not that much a problem of the diagram itself. But maybe I am biased since I did the pro video this week, haha.
A recurring con argument is that diagrams take time. This raises some important points to always consider - what is gotten out of this diagram and how long does it take to make it (a cost-benefit analysis); is it normative, i.e. used to design a system and hence will serve a bigger purpose or is just descriptive and merely mirrors an already existing system and will be outdated as soon as the system is changed? 
A diagram before the code implementation (intended to be a basis *for* the code) might last longer than a diagram that describes the code.

#### Sequence Diagram Cons Group 9

Strongest points:
- Cannot represent every condition; can only state basic facts
- Order of messages matter, notation can be complex and cause mistakes
- Takes horizontally much space
- Cannot be used for complete sequence/process description
- Prior syntactical knowledge is required to understand SD-s

Lessons learned:
- Maybe code + user story is better and simpler than a SD?

I liked the cons from this group.

#### Sequence Diagram Pros Group 13

This was our group.

Strongest points:
- SD-s complement other diagram types
- SD-s can be made more or less complex, depending on the needs and target audience
- SD-s are good for design meetings
- SD-s can be used to coordinate between teams if each team works on their own component.
- SD-s have the ability to represent the passage of time

Should have started earlier with my contribution so I would have finished earlier, giving more time for editing. We didn't (well, I didn't) coordinate that well so some info was duplicated, but at the same time it doesn't hurt to listen some things multiple times.

#### Sequence Diagram Pros Group 10

Strongest points:
- Allows to check against class diagrams 
- SD-s show the order of operations visually

Lessons learned: 
- Drawing on the blackboard can be much faster and simpler to convey some information

I think this one was honestly a bit over the top. But it was the first time when someone used blackboard drawings, so good job there. I did laugh at the Spongebob meme, thanks for that.

The common mistakes section was also very helpful, thank you Group 10. I have had the feeling that some videos give the impression that there are only two outlooks: diagram X should always be used (or is always good) vs diagram X should (almost) never be used. A pros video that shows common mistakes makes so much sense.

----

### Discussion

**What other methods and/or artifacts could help?**

+1 for prototypes - show something to a user and interview during a demo.
Depends on the end user as well - how well do they actually know what they want? Care must be also taken to distinguish must have requirements and good to have requirements; also what they in the end need vs what is the best instrumental way of achieving that - users tend to mix these two up. 
Having an actually productive meeting with clients can be really difficult, especially if users are less technically inclined. 

**What could be the issue of software mockups?**

Perhaps that paper is faster to create, but more difficult to change (rotations, translations etc).
One analogy of placeholder movie music - if the director gets used to the temporary music, new music will be hard to introduce. Hardware mockups might create something that will also be 'locked in'.

**Have I done GUI?**

Yes, mostly via Java FXML. There's a WYSIWYG scene editor/builder, but I still often ended up going back to code because I found that more appealing.

**Did I like the tools I used?**

No. 

The only tool I have liked is the kotlin language Tornadofx framework. But mostly I liked it because it was so much better writing the same software in Java, but I'm still not sure if Tornadofx is that good in itself. 

### Breakout rooms

**Notes for Group Nr 1**

**Moderator**: Ida Maria

**Note-Taker**: Taavi

**Opening Notes**

This discussion took place between Karel Roots, Ida Maria Orula, Karina Sein, Lino Moises Mediavila, Rasul Agharzayev, Simo Jaanus and Taavi Luik
Welcome, hopefully we can have a nice discussion!

**First Person Pro Notes - Simo**

A step by step flow can be used to decide what objects and interactions are required to meet requirements.

**Second Person Con Notes - Lino**

The vertical space can go disproportionally unused - the diagram tends to grow horizontally much more than vertically.

**Third Person Pro Notes - Lino**

Expressiveness - compared to use case diagrams, sequence diagrams have a way to express loops, conditionals etc.

**Fourth Person Con Notes - Rasul**

Concurrency - e.g. if the order of messages is changed, then incorrect results are produced. 

**Moderator Summary Notes**

A step-by-step approach can reveal useful things. Expressivity supports complex processes, but they are space inefficient.

**Round 1 Person Challenge/Question Notes - Taavi**

Is the concurrency problem a problem of the diagram or concurrency in general?

**Round 1 Person Comment/Defense/Answer Notes - Rasul**

Not a problem in general, sometimes concurrency is required. 

**Round 2 Person Challenge/Question Notes - Karel**

Making these diagrams are time-dependent. A detailed sequence diagram takes time and changing it later takes a lot of time.

**Round 2 Person Comment/Defense/Answer Notes - Karina**

But details can be necessary to be shown. A diagram that does not have details might not be as useful.

**Round 3 Person Challenge/Question Notes - Ida Maria**

Expressivity leads to increased complexity, but can complexity also be negative? 

**Round 3 Person Comment/Defense/Answer Notes - Karina**

Have to know how to read diagrams. Going into this much detail, might as well go straight to programming.

**Free discussion to find best points for and against**

Complexity can be both good and bad. 

The real question is: who are the diagrams for? Might be too technical for the developer, other documentation might fit them more. We should ask who benefits from this diagram.

A general question - are these diagrams useful for testing or are they too detailed for that? Writing good tests can be hard (coverage problem), a detailed diagram can help increase test coverage (via finding scenarios).
Each use case requires a sequence diagram and might lead to many diagrams.
If you can read these diagrams, then probably you can read code as well and a readable code base is better than a diagram. And if you can’t read the diagrams, you might need simpler diagrams.

If you are basing your tests on your diagrams, then you are increasing artefacts you have to keep in sync. But it might be a one-time process and no maintenance might be required. For some people it might be easier to write a diagram before tests.

Final conclusions: people have different preferences and can make various things work for them. 

**2 Best For**
- Point 1: Expressivity - don’t have to use all the notation, but at least there is the possibility.
- Point 2: Helps to find requirements due to the amount of work put in the diagrams.

**2 Best Against**
- Point 1: Horizontal space issue - sequence diagrams take a lot of room.
- Point 2: Hard to understand who these diagrams are for (with this level of detail) - too detailed for technical people, too detailed for non-technical people.


### Lecture reflections

I realized how hard it is to be a moderator or note taker (I was the latter this lecture). Partly I avoid moderating because sometimes it's hard to understand people, especially when there is background noise or people talk quietly or with an accent that I haven't heard much before. This can create some anxiety and make understanding even more difficult and create even more anxiety etc. But I've always thanked moderators and note takers (and really meant it).

### Lab reflections

I feel like there's so much work to do and so easy to lag behind. Mistakes are costing a lot of time (e.g. if you created some model earlier that was not perfect, then you have to redo or change it). Some learning from mistakes is really important and useful, but it can be difficult to do everything.
