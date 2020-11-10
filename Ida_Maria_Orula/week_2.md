### Preparation task for lecture on 15.09

**1) Watch the movies.**<br>

Done! <br><br>

**2) Prepare 2 pro and 2 con arguments in advance for the movie topic(s). Bring one example where using this approach makes sense and one where it doesn't.**<br>

<ins>PRO:</ins><br>
* Easy to see how certain object are related.
* Understandable for people with non-technical background.<br><br>

<ins>CON:</ins><br>
* Can get messy if the system is too big.
* We can lose the bigger picture in the abundancy of details.<br><br>

It makes sense to use OD when planning how a small part of a system should work exactly. It doesn't make sense to use OD to give a general overview of a huge system.<br><br>

**3) While watching the movies of both parties note down in portfolio, what are main points I learned from the movie, what did I like/dislike.**<br>

* **Group 5: PRO** <br>
I learned that although OD-s are mostly compatible with OOP approach, they're not limited to only OOP. I also learned about the concept of reverse engineering. It seems like a good way to check if the
code actually makes sense - if you turn your Java code into a diagram and it looks like a complete mess, then maybe you should check if you have organized everything correctly.<br>The most useful explanation for me was how
object diagrams relate to class diagrams. I had previously been confused about what their differences are and this video cleared it up for me pretty well. We take a more abstract class diagram
as a base and fill in the values for attributes of certain instances from the described classes, which results in an object diagram. <br> I liked that the video included small tasks as well - it's a good way to check if people are actually
listening and thinking along, rather than just let the video run in the background. Here are my solutions for the given tasks:<br>

1) OD for the Systems Modelling course:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/Ida_Maria_Orula/images/119991626_1000598663719164_4676272935358973137_n.jpg">


2) Questions: <br>

-What is UML? <br>
The Unified Modelling Language allows you to visualize your system with diagrams.<br><br>

-What is an OD?<br>
It is a diagram that decribes what objects (instances of classes) are present in the system and how are they associated with each other.<br><br>

-Main purpose of an OD?<br>
Give a snapshot of the system at a specific time to provide a concrete example of how (a part of) it should work.<br><br>

-Advantages of OD?<br>
Easy to understand for people with different backgrounds, can be used to plan how exactly a part of the system should work. Can be mapped to an OOP code rather easily. 
You can choose how many details you want to include/how many different examples of each class to bring.<br><br><br>

* **Group 1: CONTRA** <br>
I liked that they specified the notation details, such as the object names start with lowercase letters etc. Before watching the video I had seen object diagrams both with
and without separate names for links, so I was unsure whether they should be named. In the video it was mentioned that they should. I'll try to remember that as well for the future.
One interesting point that they brought out was that object diagrams become outdated very easily and should therefore constantly be checked and changed whenever the cide changes.
<br>

* **Group 3: CONTRA** <br>
"OD are useless today" sounds like a pretty extreme statement and I don't quite agree that debuggers and programming IDEs can completely replace them. OD should be a part of the planning phase
not the development phase. Besides, if we want to discuss the system with a non-technical client, we will need plenty of visuals. Try showing the scary-looking dark theme IDE
to someone who doesn't like computers - they will not be happy about it.<br>

### Tasks during the lecture on 15.09

#### 1) Why do we need software architectures /system models?

It is always necessary to think about what needs to be done before actually doing it. If we just start mindlessly writing code without any proper planning, we might realize in the end or mid-way through,
that we have completely forgotten about some important component that now has to be connected with the rest of the system. That might require us to rewrite large parts of the code, which takes a lot of time and makes everything 
a lot more confusing. If we have a well-structured model in front of us, we can divide the coding tasks among different developers, prioritize what needs to be done first etc. In Estonian language there is a saying: “Üheksa korda mõõda, üks kord lõika” 
(“First measure nine times, then only cut once”) that summarizes that idea very well. Think before you act! 

#### 2) Object diagram image - buffer with old news items and another buffer with new ones.

<img src="https://github.com/Ramgree/sysmod2020/blob/master/Ida_Maria_Orula/images/119936527_999041077279059_4857050793279060511_n.jpg?raw=true">

#### 3) Breakout

<ins>**Breakout B**</ins><br>
* Moderator: Sergi Martinez<br>

* Note-Taker: Ida Maria Orula<br>

* **Opening Notes**<br>
We were all kindly welcomed to the breakout room by the moderator and the details of the task at hand were discussed briefly.<br>

* **First Person Pro Notes**<br>
Object diagrams are good for designing databases, since it is easy to show the connections and cardinalities. These diagrams help us to give an overview of the db structure to someone who is not familiar with it.<br>

* **Second Person Con Notes**<br>
Not good for designing very big or complex systems because connecting many different objects makes the diagram hard to read. The key word is scalability.<br>

* **Third Person Pro Notes**<br>
Object diagrams give a concrete snapshot of the system. Concrete examples help us to understand the system better.<br>

* **Fourth Person Con Notes**<br>
It doesn’t give a good overview of the system, a lot of additional information can go missing.<br>

* **Moderator Summary Notes**<br>
In short, object diagrams are good for explaining database relations to people who are not familiar with the topic, but scalability can be the biggest issue with more complex systems.<br>

* **Round 1 Person Challenge/Question Notes**<br>
Object diagrams don’t represent the full state of the system. You need some extra steps between the diagrams and the actual code or a lot of information can go missing.<br>

* **Round 1 Person Comment/Defense/Answer Notes**<br>
Please fill<br>

* **Round 2 Person Challenge/Question Notes**<br>
Please fill<br>

* **Round 2 Person Comment/Defense/Answer Notes**<br>
Please fill<br>

* **Round 3 Person Challenge/Question Notes**<br>
Please fill<br>

* **Round 3 Person Comment/Defense/Answer Notes**<br>
Please fill<br>

* **Free discussion to find best points for and against**<br>
Please fill general notes during discussion here<br>

* **2 Best For**<br>
-- Communication between people with technical and non-technical background<br>
-- Concrete examples of specific situations are easier to grasp than a vague description of the entire system.<br>

* **2 Best Against**<br>
-- Scalability can be a nightmare<br>
-- Object diagrams do not represent the system in a whole<br><br><br>


### Reflection about the lecture:
In our breakout room I took on the role of the note-taker, since I usually enjoy writing and documenting everything I possibly can. 
However, I didn’t really take into consideration all the circumstances that can occur in a breakout room - a few members were really confused about 
the task and about what the role of the moderator should be, a few members couldn’t hear the rest of us talking or we couldn’t hear them, the audio quality was terrible at times, 
someone’s keyboard was extremely loud etc.<br>

All this resulted in a lot of time being lost. I think we managed to do the first part of the task pretty well, but unfortunately I can’t say the same about the second part. 
Instead of a well-structured challenge-defense dialogue, we had a very rushed and confusing talk, focusing mostly on one single argument, during which I was struggling to understand 
what people were saying and who was talking to whom. And when I tried to ask what exactly someone’s response to the proposed challenge/question was, time was up and the breakout room vanished.<br>

This task made me realize that I do not enjoy taking notes when several people, a loud keyboard and possibly a poor internet connection are all expressing their thoughts and feelings at the same time. 
It would have been funny if I had needed the notes just for myself, but since I had to also share them afterwards with others, it felt stressful and I’m worried I should have done a better job at it. 
I did manage to get the main ideas written down, though. I now think I should actually have taken on the job of the moderator. i’m not saying that our moderator didn’t do a good job, but I feel like I could have kept the conversation a bit more organized. 
I’ll keep this in mind for the next similar task I might encounter.<br>

A more general reflection: I think that writing to this portfolio is a great way of learning and I wish we had this in more classes. It’s always a good idea to think about the lecture/lab material afterwards, especially in the context of what I learned and why it is important. 
And even better - it also counts as part of the final grade!<br>

The discord chats are becoming more clear for me as well now, although I would love to have a separate chat just for announcing the necessary preparation tasks for each week’s lectures (in case there's more than just watching the videos). 
And it would be great if all the temporary group chats were deleted because they just crowd the chat list and it is a bit annoying to have them occupy so much space when they aren’t even necessary anymore. <br><br>


### Reflection about the lab:

Since we had had some trouble with dividing the last week’s tasks amongst ourselves, we realized we didn’t have the necessary input for drawing all the required object diagrams. 
So I focused mostly on completing the last week’s task about the Mancala game. It’s amazing how big of a difference being tired/hungry and not being tired/hungry makes! 
Last week the Mancala game seemed like a big mess that no one could possibly understand, but this week I understood the rules rather quickly and it’s not so bad at all.<br>

I felt I suddenly understood the concept of object diagrams and scenarios a lot better when it was mentioned that we should be very specific and use actual names when writing the scenarios in tasks, 
since they would otherwise lead to class diagrams rather than object diagrams. So the focus is strongly on finding the correct level of abstraction. This idea is of course rather obvious and makes sense, 
but for some reason it really helped me to hear it said out loud.<br>

I’m really happy that our small team seems to be working really well together. Everyone participates and seems to have a positive attitude towards the course. 
Hopefully we can keep up this energy throughout the course and keep our team drama-free.<br>

I enjoyed the discussion with Ulno at the end of the lab session. We got some useful tips and he was very supportive and seemed to be happy with our work so far. 
The only issue was that I had hoped to be able to leave the lab session a bit earlier, because I had an event starting at 18.15. 
That didn’t work out since our group’s discussion with Ulno was at the very end of the lab, but luckily, after the fastest bike ride of my life, I even managed to arrive at that event on time. 
All's well that ends well!<br><br>

The lab tasks from this week can be found [here](/team/Lab_1509_tasks.md)










