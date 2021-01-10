### Preparation task for lecture on 29.09

**1) Watch the movies.**<br>

Done! <br><br>

**2) Prepare 2 pro and 2 con arguments in advance for the movie topic(s). Bring one example where using this approach makes sense and one where it doesn't.**<br>

<ins>PRO:</ins><br>
- Component diagrams map to code very easily.<br>
- Provided/required interfaces give a good overview of what each part of the system needs and what value it brings.two<br><br>

<ins>CON:</ins><br>
- There are too many ways to express same concepts, which can make the diagrams confusing.<br>
- Since an object can represent 1 or more classes, we might end up with bad code if we don't think things through - if we just create code from th diagram we might have some
unproportionally large classes.<br><br>

It makes sense to use component diagrams to give new developers an overview of an existing system, but it might not make sense to use them while talking to non technical customers because they might be hard to understand for them.<br><br>

**3) While watching the movies of both parties note down in portfolio, what are main points I learned from the movie, what did I like/dislike.**<br>

* **Group 14: PRO** <br>
Starting with the description of UML in general might have been unnecessary, but then again, it is always good to refresh you memory. Since I had already read quite a lot about component diagrams while preparing our own video, I didn't really gain much additional knowledge from this or the other videos. Also, I don't know if it's just me, but the sound of this video seemed really quiet and it was hard to hear. The step by step guide to creating diagrams was a nice addition.<br>

* **Group 4: PRO <br>
It was a nice and clear video with many good examples.<br>

* **Group 12: CONTRA** <br>
It was a good point that in systems where new components might be added later, it can be hard to keep component diagrams up to date.<br>

* Our group also presented a video this week. I had offered to do the introduction part and the other team members just divided several arguments among themselves. 

### Tasks during the lecture on 29.09

#### 1) Domain models
- Advantage of domain modeling: they cover both behaviour and data and do it terms understandable for the customers. Therefore, the customers can express their thoughts and 
needs comfortably. These models are in a way closer to real life than some other ones.
- Disadvantage of domain modeling: their pro can also be their con! If the customer use only their own lingo, then developers might struggle to understand what they mean. They already need to work with concepts and logics that might be unfamiliar to them (eg they don't know how the logic in eg banking works) so doing it in unfamiliar terminology is even harder.<br><br>

#### 2) Do we want methods unrelated to data modeling?
I guess it depends on what we want to show... But we probably don't want to clutter our models with too many details since they can already be full on info and hard to follow. And we might not want to model too obvious things either, such as getters and setters for everything.

#### 3) Breakout
**I was the moderator again and I think it went quite well.** We reached the conclusion that we like class diagrams more than component diagrams. We did agree that component diagrams are easy to map with code so they're a good way to explain an existing system to new developers and that they're good for systems where we need to specify inputs and outputs. On the other hand, there are way too many notations for expressing the same thing and it's hard to be consistent.

#### Reflections about the lecture and lab
Since I'm really interested in how people communicate with each other, the "speaking your own language" aspect of domain modelling was a fun thing to think about. The breakout room experience was nice. **Our notetaker Hans Starkopf managed to write everything down effectively** and with short concrete sentences, even if our points were made in longer discussions. We had a laugh about the "We like class diagrams. Helen likes OOP." part that he wrote down - everyone's preferences are important!

In the lab, we just divided the tasks again and worked individually. This approach seems to suit our team the best, although it does leave room for errors if we simply forget to check everything together afterwards. I also have mixed feelings about having tasks that are always based on work that has been done previously. For example, if we missed something important in the banking system task last week, then we might have a harder time next week or we might just carry the error on and on. But on the other hand, this nicely simulates the way some actual system is developed - you take a task and have to make it bigger and more complex step by step.

The tasks from the lab can be found [here](/team/Lab_2909_tasks.md)
