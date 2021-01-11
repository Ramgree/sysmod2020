### Lecture on 24.11.2020

#### Discussion - observer pattern

1. Problems/annoyances

I'm not sure but I kind of feel like synchronization might cause issues? Also what if you put a listener to some source and forget to change it when it becomes unnecessary?

2. Example in bank application

Notification about a new transaction

3. Example outside of bank application

Suppose we need to monitor the temperature of some room - if it exeeds some temperature according to some sensor then we should be notified of it.

#### Discussion - command pattern

1. Problems/annoyances

Can't think of anything.

2. Example in bank application

Can't think of anything myself, but Mike Camara had a nice point in the discussion - we could collect commands if the application is down and then execute them all once it's up and rrunning again.

3. Example outside of bank application 

Maybe gathering some input from the user that is needed to run some program in a specific case?

#### Guest talk

* What is Ncameo?

It is a startup that helps create cheaper and faster applications

* What are their services?

They offer a platform for creating custom cloud-based code-free applications 

* Expectations regarding System's Modelling? (What models/methods do you expect them to use?)

Since it's code-free then I guess they rely on diagrams or something similar to let clients communicate the ideas and needs.. Code generation and automatically generated diagrams seem relevant.

* What was most impressive, particular, insightful in Ncameo's history and current way of work?

In my opinion it is showing the results to the client right from the start. This is convenient and beneficial to everyone: the client doesn't have to worry whether the correct thing is being done and there will be less need to redo a large part of the application later on.

* One question regarding architectural or modeling elements in their practice.

My prediction at first was that automatically created diagrams are relevant here. Are they relevant?

* How could Ncameo's No-Code environment been helpful building your class project?

We could skip some of the steps in the process as the Ncameo would take care of them.

#### Lecture reflections

Command patterns are still weird to me. Some of them are new and weird and I can't think of situations where I'd use them, while others seem more like common practice that I didn't know had a separate name.

#### Lab reflections

I'm trying to find the best ways to have an overview of how everything is going. **I created a markdown file in Github where everyone could track their time. I also try to encourage everyone to speak up during the meetings and say what they have done and what they are planning to do next.** This approach seems to work so far. Most of the team is working well together and that is really nice to see. **I feel like I'm doing quite a good job at making sure everyone knows who to turn to if some questions need answers. I am also the one who communicates with the product owner Lauri on behalf of the frontend team.**
The biggest downside right now is that the communication within the frontend team is not the best. The wireframes weren't ready by the deadline so we couldn't move on to developing them in code. I ended uo creating some quick wireframes so he could at least start with developing. I will need to be more demanding about deadlines and everyone doing their part, otherwise the entire team will have difficoulties.

