### Preparation tasks for the lecture on 27.10

#### 1) 2 pro and 2 con of activity diagrams

**PRO:**
* Good when we need to show system's behaviour.
* If (IF!!) the notation is used correctly and reasonably, these diagrams can express as much information as several other diagrams.

**CON:**
* They might be unnecessarily complex in some cases (eg if there's no concurrency)
* They often aren't OOP friendly. They can be, but in practice they often aren't. (Then again - they're behavioural not structural so I guess it's fine if they aren't much like OOP...)

#### 2) Videos

**Group 8 CONTRA:**

It was nice to see that they had come up with the same cons that I had concluded from my Google search - gave me hope that I'm kind of understanding things correctly! :D The video seemed a bit slow maybe, but it was a nice brief introduction.

**Groups 2 and 6 PRO:**

This video again made me think about how using different diagrams is kind of like zoominng in and out on Google Maps - do I want to see the overall terrain or the exact placement of the houses? Do I want to see where the shop is or do I also need to see the exact route from my house to the shop? We choose the right diagram based on how much details we need to express and whether we need to show the what or the how.

### Lecture on 27.10

#### 1) Even Storming with Alberto Brandolini <br>
* In which contexts does Alberto use the term model or modeling during this presentation (try to at least find three - there are more)?

1. Read models
2. Many different models are needed for different people/purposes
3. Modelling a business line

* How does Event Storming relate to the UML?

It is like a simple version of a UML-like diagram. It doesn't have complex notation and just describes what events happen after each other. The use of colors is a really simple way to have all your events, questions etc together in the same place without being confused about what is what.

* What is the goal of Event Storming in terms of software development and understanding?

It helps you to have an overview of the entire domain and to make sure that your software can handle all the specific scenarios that your domain has.

* What does Bruce Lee have to do with all this?

The so called Bruce Lee state describes a situation where a developer is so confident about his model that he feels like he can easily adjust it to handle even more requirements. 

#### 2) Breakout room

**Notes for Group Nr 3**

Moderator: Sander Jenk

Note-Taker: Karel Roots

Members: Sander Jenk, Karel Roots, Martin Põhjakivi, Ida Maria Orula, Karina Sein, Vera Akinyi Onunda, yauheni

**Opening Notes:**
Welcome to breakout room 3. Our topic is Activity diagrams, let us begin. <br>

**First Person Pro Notes:**
Martin: helps with visualizing complex sequential algorithms. It has similar benefits as flowcharts.

**Second Person Con Notes:**
Ida Maria: The activity diagrams are not usually object orientated. We can’t be sure how these activities map to specific objects and it would be difficult to use them for modelling objects.

**Third Person Pro Notes:**
Karina: Parallel behaviour and multi-threaded programming can be easily depicted.

**Fourth Person Con Notes:**
Ida Maria: These diagrams can get visually a bit messy. For example conditionals can lead to a lot of different branches and if it is not well thought-through the diagram can be hard to read.

**Moderator Summary Notes:**
I think we have good points from both sides and we can move on to challenges.

**Round 1 Person Challenge/Question Notes:**
Karel: Objects can actually be modelled in Activity Diagrams by using Object nodes.

**Round 1 Person Comment/Defense/Answer Notes:**
Ida Maria: Yes, it is possible, but most of the activity diagrams do not use objects. So theoretically then can be used to represent objects, but in practice it is not used as much.

**Round 2 Person Challenge/Question Notes:**
Sander: Keeping the diagram clean is more of a responsibility of the designer of the diagram.

**Round 2 Person Comment/Defense/Answer Notes:**
Ida Maria: Visual messiness could be considered for all types of diagrams and maybe it is not specific to Activity Diagrams.

**Round 3 Person Challenge/Question Notes:**
Ulno: Step by step describing the activities is already quite close to what the code should do. Are activity diagrams then needed? Also for non-technical people it would make more sense to just write things as stories instead of modelling them as activity diagrams.

**Round 3 Person Comment/Defense/Answer Notes:**
Ida Maria: The diagram is probably more understandable for non-technical people and is better for communicating the ideas and processes. Code is scary for the customer.
For some people stories might work better, but for some people having diagrams might be a better way of structuring the use cases. It depends on the person and context.

**Free discussion to find best points for and against:**
The group was not very confident that pro points selected were the best possible options, but we agreed that they were generally acceptable.
Activity diagrams can be used to extend use case diagrams by having a more detailed representation of the different paths, for example using conditionals to show different alternative scenarios.

**2 Best For:**

* Parallel behaviour and multi-threaded programming can be easily depicted.
* Helps with visualizing complex sequential algorithms. It has similar benefits as flowcharts.

**2 Best Against:**
* The activity diagrams are not usually object orientated. We can’t be sure how these activities map to specific objects and it would be difficult to use them for modelling objects.
* These diagrams are less useful for developers, because they are already quite close to the actual code when using object nodes, conditionals and parallel paths. Developers would probably prefer to write code instead.

### Reflections about the lecture

This time the breakout session was a bit different for me. I wasn't the moderator, but **I still participated very activly in the discussion**. I'm really happy about that, because when I am a moderator, I HAVE to talk and encourage others to do so - this time I had the opportunity to just let others speak, but I chose to participate. We had an interesting discussion. We once again reached the understanding that "it looks messy" is a statement that is true about many different types of diagrams, but usually it's not the diagram that we should blame for it - it's the person behind it! Different types of diagrams are good for different things and you need to really think everything through to only include relevant information in the diagrams. Ulno also raised the interesting question of what is the point of diagrams that are already so similar to actual code. In my opinion, this strictly depends on the person. Some people prefer looking at the code and interpreting it themselves, some people need to hear or read actual human words to understand what's going on (me for example!!) and some people definitely need some visual descriptions (like diagrams) to grasp everything. Therefore it's best to be as fluent as possible in all of these ways so that you could adapt according to the people you need to describe a system to. 

**Sander Jenk moderated for the first time and did a good job at this.** He was a bit slow and there were several pauses where the moderator should have chipped in, but on the other hand, these pauses made the notetakers life easier as he had time to write everything down. Another thing Sander did very well is that he kept track of who had participated in the discussion and who had not. When there was silence, he specifically directed questions to those people who had been silent until then.

The miroboard session was a bit boring and hard to follow in my opinion. Maybe it would have been better to give a brief intro to the topic (for those who hadn't read the article..), **have us do small exercises about it in small groups (breakout rooms) and then discuss it afterwards**? 

### Reflections about the lab

We're still catching up on some of the tasks that we struggled with in the past. I still find it kind of hard to ask for advice when I get stuck on solving some task.. All my team members and the instructors are really nice and friendly, but I still feel like I should be able to understand the task on my own and then I'm embarrassed to ask for help. This is a really silly attitude that I need to work on. I guess I'm just used to having right and wrong answers in the computer science field - your code either works or it doesn't. The tasks in this course are more creative and several very different approaches can be correct. It feels strange to approach IT related tasks with the same mindset as eg writing a poem. I definitely love this approach very much, but it's still weird in this context. 

(NB! This line is added a few days later: **I finally did ask for advice about some tasks I had done and it turned out that my solutions were very much on the right track!** My teammates suggested some improvements but overall the solutions seemed fine to them. Yay!)

<br><br>
[Previous week](/Ida_Maria_Orula/week_7.md) | [Next week](/Ida_Maria_Orula/week_9.md)
