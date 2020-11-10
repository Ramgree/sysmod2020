### Preparation task for lecture on 22.09

**1) Watch the movies.**<br>

Done! <br><br>

**2) Prepare 2 pro and 2 con arguments in advance for the movie topic(s). Bring one example where using this approach makes sense and one where it doesn't.**<br>

<ins>PRO:</ins><br>
-CDs are at a very reasonable level of abstraction - they can be used to simplify object diagrams that have become too messy, but also to discuss a very high level system
in more concrete details. <br>
-Can be mapped to code very easily - we define all necessary classes with the required attributes and how they all relate to each other.<br><br>

<ins>CON:</ins><br>
-Don't describe specific workflow well.<br>
-Inheritance hierrchy can get complicated.<br><br>

It makes sense to use CD when trying to give a general overview of the system and of the different classes it has. It doesn't make sense to use it for
understanding the detailed workflow.<br><br>

**3) While watching the movies of both parties note down in portfolio, what are main points I learned from the movie, what did I like/dislike.**<br>

* **Group 7: PRO** <br>
I loved the clear structure and calm descriptions. All given definitions where clear and the examples were easy to follow. I learned that class diagrams are used for
giving a static overview of a (part of a) system. As opposed to object diagrams, we don't draw out several specific instances but instead show relations with cardinalities.
Eg instead of adding an object for each wheel of a car we just create classes Car and Wheel and say there's a one-to-many relation between them.<br>
I also realised that I sligthly misunderstood the relation between class and object diagrams last week.
At first it made more sense to me that class diagrams come first, as they are more abstract and give the wider overview. And then based on them we can move to more specific examples
with object diagrams. But now that I think about it, it does actually make more sense for object diagrams to come first. It isn't easy to grasp the idea of the entire system
at first and it's a lot easier to bring small examples. Those examples (that can be described with ODs can then be transformed to CDs to get a more general overview of the program.
I still feel that maybe each approach could be valid, depnding on the situation...<br>
PS: The "Dance of the Sugar Plum Fairy" soundtrack was nice :) <br>


* **Group 12: PRO** <br>
Excellent explanations! Probably the most useful tip from the video was that using lower bounds in cardinalities can be tricky and might cause the program to crash if not implemented properly.
I also found the part about different types of relationships to be very useful.<br>

* **Groups 2 and 6: CONTRA** <br>
Well, this video seems to confirm the theory that I proposed above under the first video - depending on the situation object diagrams can be derived from class diagrams or vice versa...
Unless of course either of the groups misunderstood. This should probably be clarified, hopefully in the lecture. Relationships are explained well.<br>

### Tasks during the lecture on 22.09

#### 1) Curiosities

* <ins> Diagram 1 </ins><br>

There should be regular associations, not inheritance. There is an inconsistency with how cards are represented - in deck the cards are given as an array (which is bad practice in general!) and the cards in hand are shown separately. Object names should be underlined.

* <ins> Diagram 2 </ins><br>

To me it seems weird that object names and attributes just duplicate each other, but that might not actually be an issue. The values for the attributes should be given with “=” not “:”. Class names should come after the object name, not vice versa.

* <ins> Diagram 3 </ins><br>

Associations are weird - why the random inheritance? Also names are capitalized and not underlined.

* <ins> Diagram 4 </ins>

I couldn’t point anything specific out about this one. In the discussion later it was mentioned that attributes have an unnecessary id that just creates noise there.<br><br>


I learned most from diagram 2, because I hadn’t previously paid attention to whether “:” or “=” should be used to mark the values to the attributes. Now that I think of it, using “=” makes sense because we are assigning values. <br><br>

#### 4) Breakout room

I was the moderator of breakout room group 1. We managed to cover a rather good amount of good quality arguments (both pro and contra) and actually have a discussion about them. For example, we think that class diagrams are good for giving an overview of the system and since they also map quite well to OOP code, they are a good way of explaining the task to new developers joining the team. However, if we need to cover the exact details of some small part of the programs, then the class diagrams can't convey as much information as object diagrams and might not be precise enough. However, creating and mantaining the class diagrams can be very time-consuming and making changes to them later on can cause issues, especially when we're dealing with inheritance - we might need to alter the superclass of a large system and that could also require us to change subclasses. In addition, there is always the threat that the team starts focusing on the abstract class diagram too much and not leave themselves enough time for actual code writing.<br><br>
It was nice that most of the time there was a real dialogue where the pro and contra arguments were actually related to each other, rather than everyone just reciting something random they remembered from the video. For example, someone mentioned that class diagrams are easier to read than object diagrams because there aren't so many object there and to that someone else responded that in his opinion class diagrams can be even more complex and hard to read, because the syntax of different kinds of relationships can be very confusing.


#### 3) Coding

Unfortunately I can't really point out anything that especially surprised me or that was more difficoult to follow than the rest of the code. For quite a while now I've only written Python code in a jupyter notebook, so following a different kind of code took some getting used to. I should probably watch the video again and try to follow along - I didn't manage to do it during the lecture, because it was going way too fast for me. I'm not a fast typer and I also need more time to think about what I'm writing, otherwise I just feel like a robot and things won't make sense to me. 

#### Reflection about the lecture

I really enjoyed the breakout room experience this time. I took my own advice from last week and decided to be the moderator of our group. Luckily this task doesn't seem to be very popular and no one had any objections when I offered to take the part. I felt really confident while leading the conversation and I managed to guide everyone to follow the expected structure of the discussion. We managed to cover everyones arguments with around 10 minutes to spare so we had plenty of time for general discussion as well. After we were done, my teammates also told me that I had done a good job and that the breakout room experience had been nice and smooth for them. Of course, I can't take all the merit to myself, we just had an overall great team! Everyone listened to each other and participated actively. The notes taker also did a really good job and managed to document all the impotant details that were mentioned.<br><br>

I also liked the curiosities finding task. When learning something new, then seeing how things shout <ins>not</ins> be done is just as important as seeing how they should be done. Otherwise you might not even realise all the small details that could go wrong and you might not pay enough attention. For example, I would probably have used ":" and "=" interchangeably in my class diagrams if that detail hadnd't been brought to my attention in this task.<br><br>

I didn't like the coding part that much, since it is hard to follow any code when you see it for the first time and can only see it on a screen recording, rather than in a file where you can control when you see what. I understand that the code wasn't really complex but I felt my attention constantly shifting away from the lecture during the coding part. Maybe it would be beneficial to share the code with the students before the lecture (since that lecture part was prerecorded anyway, it should be possible). That way I could have read the code and get familiar with it and the additional explanation of it during the lecture would have been much more appreciated. But that might just be me - I don't always get along with code as well as one would expect from a CS student.

#### Reflection about the lab

I can't stress enough how happy I am to have gotten lucky with the team I'm in. We get along well and everyone is doing their part. Maybe not always exactly by the deadline, but since the deadlines are rather loose in this course and we get everything done eventually, that isn't an issue. During the lab we mostly focused on discussing how we should do the video about component diagrams next week. We didn't reach any final or clear conclusions because we hadn't had time to actually investigate what kind of information was available for component diagrams, but we did decide on who would deal with putting the video together, who would do the introduction and by what time approximately we want to be done with it.<br><br>
The lab tasks didn't go as smoothly this time. Somehow we all managed to misunderstand the diagram in the first task exactly the same way, so we were all confused about the same thing. What are the chances of 4 people understanding something the exact same wrong way?! We thought that the arrow in inheritance works the other way around and points from superclass to subclass. The funny part is that while watching the introduction movies and reading about class diagrams I had understood it the correct way but that knowledge just abandoned me when the lab started. I guess I just don't have that much brain power left by the fourth class of the day. Maybe more chocolate would help, I guess I'll try that next week. Chocolate is always a good idea!<br><br>

Lab task solutions from this week can be found  [here](/team/Lab_22.09_tasks.md)
