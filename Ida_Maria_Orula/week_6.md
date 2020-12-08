### Preparation task for lecture on 13.10

**1) Watch the movies.**<br>

Done! <br><br>

**2) Prepare 2 pro and 2 con arguments in advance for the sequence diagrams. Bring one example where using this approach makes sense and one where it doesn't.**<br>

<ins>PRO:</ins><br>
- Can express more complex things like loops in a very intuitive way.
- Give a clear overview of the order in which communication happens in the system. <br><br>

<ins>CON:</ins><br>
- Tend to scale disproportionally.
- Might look too complex for non technical people<br><br>

It makes sense to use sequence diagrams to discuss a system with other developers. For example if there are several teams involved in creating different parts
of one bigger system. They're detailed enough to grasp the concept of the part that another team is creating. It doesn't make sense to use them during a meeting
with the customer/end user, because the will just be bored or confused by big diagrams. <br><br>

**3) While watching the movies of both parties note down in portfolio, what are main points I learned from the movie, what did I like/dislike.**<br>

* **Group 10: PRO** <br>
Another artistic creation! I love it that people take a simple school assignment like presenting UML diagrams and turn it into an art form. From the beginning of this video, 
I'm getting serious "Creepypasta" vibes... <br>
Three minutes into the video, the word "message" was starting to lose meaning to me since it was repeated so many times!<br>
I think that using the whiteboard to explain all the elements was a really nice touch. The information was also presented in a way that was easy to follow.<br>
The most useful point they made was that sequence diagrams are useful for testing because they allow you to move through the system step by step, just like you would in a test.
The example in the end was also nice and easy to follow.<br>
"Oh great, the voice guy is back!" :D I love creative people!<br><br>

* **Group 9: CON** <br>
It was a good point that although sequence diagrams allow to show details such as loops and decisions, we can't possibly model all of them since the diagram would become too crowded.
The point about the diagram growing horizontally and it being inconvenient to follow was also good. Using the Mancala game example was a clever idea - it's something we're all familiar with.<br>

* **Group 14: CON** <br>
Nice discussion about space and time efficiency.<br>

### Tasks during the lecture on 13.10

#### 1) What other artifacts could help communicate with the user/customer? (to help figure out what customer wants from us)
In addition to personas, use cases etc, we might want to use something that shows how the actual final system might look like. Prototypes could be a nice solution, 
since they can be created rather quickly, using some free software, and they can give the client an initial feel of the system. It might be hard for them to describe
a system that they cannot imagine yet. If they have a static of partially interactive prototype in front of them, they can give more specific feedback about what they do or do not like.<br><br>


#### 2) What could be the issue if we did it this way? (paper vs tools)
For me personally, noting things down on paper is a lot easier and more intuitive. However, making corrections and changes can be a nightmare.
If you change your mind about something or simply make a mistake, you'll either have to redo the entire diagram/prototype or start erasing and crossing things out.
That might result in an unreadable image that is of no help to anyone. It might also be that your handwriting or drawing skills are really bad and no one will be able to 
understand what is written on the paper. Using specific tools can result in a clearer solution that can also be easily changed and shared with different people. Several 
people are also able to work together on the same solution without having to be in the same room and draw over each others work. However, there is one interesting issue,
that I have also encountered during a course project where we had to work with an actual client - the client might not understand that a prototype/mockup is not the actual product.
If they don't understand how programming works, it can be hard to explain to them, that this clickable interactive prototype is not the same as the actual system, even though it seems
to have all the same functionalities. They'll be confused as to why would you still need weeks or months to create a system if it is clearly already working for them 
during the interview. At this point it is really important to have a person on the team who is capable of "translating" the developers' explanation to the client so that
they understand why so much work still needs to be done. 


#### 3) Breakout room 1
I wasn't actually planning to be a moderator again, but since no one else seemed to want this role, **I volunteered and moderated the discussion**. I think it went rather smoothly
overall, even though the structure of the discussion did get a bit messy at some point, because everyone had something to say and it was hard to keep track of who was responding to who.
Luckily we managed to sort this out retrospectively and make the notetaker's life a bit easier. One of the main questions that arose from our discussion was about who actually
benefits from sequence diagrams. I personally like the expressiveness of sequence diagrams - you can show alternative scenarios, loops etc in a very clear and intuitive manner.
It was the first thing I noticed and liked about these diagrams. However, it was brought to my attention, that this level of detail might be unnecessary, since customers
don't need that many operational details when we're trying to figure out their needs and programmers might just as well just start writing code if we're already going into
that level of detail. After thinking about that, I realised that this might be a good point. If you talk to a non-tecnical customer about the system you're creating for them,
they probably don't want to hear about if-else clauses and for loops because it can sound like chinese to them. They want the system to do what it needs to do, who cares about 
loops and other programmer-nerd lingo! And the programmers are probably experienced enough to be able to make out those details from more general diagrams as well. 
You probably won't have to dictate to a programmer that he needs to use a loop if some action needs to be repeated several times or that two alternative scenarios are possible if
some action can have two possible outcomes. So putting all those details to a diagram might be a bit too much. This time and energy could just as well be used for writing code
or simply talking to the customers about their expectations. I still like sequence diagrams though...

### Reflections

I liked that I could connect today's lecture topics with things I have experienced myself. Such as the problem of the client not understanding that the tiny interactive prototype
we made on a free website is NOT their final system that has to acess a database, communicate with Facebook etc. They were genuinely confused as to why we can't just give
them the prototype and be done with it. And I kind of understand their confusion - a good prototype looks exactly like the user interface should look like and the backend logic
simply doesn't mean anything to the client. I also enjoyed the breakout room discussion. The first time I moderated a breakout session I had previously decided that I'd do it and 
I was a bit nervous about how it would go. This time I hadn't planned on moderating and the decision was very spontaneous, but everything still went smoothly. When I felt that we
had lost the clear structure we had started with, I simply admitted it to the group and we did a little recap of what everyone had said so that the notetaker could write it all down.
Luckily I had great teammates again. They had some good arguments and it was clear that they were using their own heads to think, rather than just recite what they had heard 
 in the videos. I really feel that this discussion helped me to understand sequence diagrams better and to look at them from different perspectives. <br>
 Unfortunately I couldn't be present during the lab due to a doctor's appointment. If I hadn't gone to the doctor at that time, I would've had to wait another two weeks which 
 was not something I wanted to do. Some annoying health issues have already been distracting me for long enough. So due to all that I do have some catching up to do with my part of the 
 lab tasks, but I will get back on track. Until then, I'll just make sure my teammates know that I'm not simply ignoring my obligations and that I will get my part done. Luckily
 they're all super understanding. I sometimes still find it kind of hard to follow the lab tasks, they can seem rather confusing. It's more about guessing what needs to be done. But I guess it's partly because in many cases there are no right or wrong answers and with such tasks it's necessary to use your own logic and creativity instead of just following a step-by-step guide.
