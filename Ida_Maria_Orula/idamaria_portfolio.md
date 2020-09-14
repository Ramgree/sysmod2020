# Systems Modeling 2020
## Ida Maria Orula - Portfolio
<br><br>
### Preparation task for lecture on 08.09
* **Which types of diagrams are mentioned in the talk?**<br>
This question can be approached in several ways. First of all, there are the diagrams that can actually exist in the systems modeling world, such as UML, package dependency diagram, class dependency diagrams and boxes and lines diagrams. And then there are those, that inexperienced people come up with, such as “The shopping list of technologies” that only states *what* should be done but not *why*, “Boxes and no lines”, “Functional view”, “The airline Route Map” (a complete mess!), “Generically True” (tells us nothing about the specific system being built), “Logical view”, “Homeless old C# object” and “Choose your own adventure.” <br><br>
* **What is the standard for modeling software mentioned in the movie?**<br>
UML<br><br>
* **Why is nobody using it?**<br>
Since UML requires a very concrete structure, it can be hard to get it right if you’re not used to it. Therefore, people see it as too complex, too low level and overall just not worth the effort. Another common excuse is that the team follows the agile development style, which in their opinion cannot be combined with UML. All good excuses to avoid admitting that it just takes some practice to learn to visualize the system you’re creating.<br><br>
* **What is the model-code gap and what is the problem with it?**<br>
A short definition would be that the architecture model and the source code are not doing the same thing. When you’re building a complicated system, it is hard to see the whole picture without making a considerable amount of abstractions. Abstractions remove the less significant details from the system to allow you to focus on the general workflow, but the problem is that the actual code will need those details to work properly. If we can’t map our models to our code, we are in a way just doing the same work twice: we create one system as a model and then a different system in code.<br>More technically speaking, the gap comes from the fact that programming languages such as Java or C don’t really have keywords for service, layer or component. Instead we need to work with classes, namespaces etc. We somehow need to build a bridge to connect those different sides.<br><br>
* **What do you personally think about layers for modeling software?**<br
I think that layers can make it easier to grasp the main idea of the system or to explain it to someone who is less familiar with this specific system or with software development in general. However, it is easy to get stuck in those layers also during the development stage. In code, having separate layers means that many variables have to be public (to allow access to them from all those different layers) and this makes the code easily corruptible. Therefore, if we see layers as static building blocks, we might have to change our understanding a little. Even if it is sometimes the best way to make the system understandable to human mind, it might not be the best way to make it understandable to a computer.<br><br>
* **How do you think about Systems Modeling after watching this movie?**<br>
It is important to keep in mind the representational aspect of the model, but we must also think about how it will all be implemented in the code eventually. Otherwise we’re just drawing pictures with more or less structure. The initial model can change a little during the work process as the project develops and/or becomes more specific (clients change their minds, new discoveries are made etc) but for all such changes some SOPs (standard operating procedure) should be followed to make sure those changes won’t mess anything up. The model should be like a bridge between what we abstractly imagine the system to be and how we actually implement it in code.<br><br>
* **Anything else remarkable from the movie, we should share/discuss?**<br>
I loved the analogue that was made between maps and models - sometimes we need a zoomed in view to focus on the details, but also the zoomed out view is important to keep track of where we stand in the bigger picture.<br><br><br>

### Lecture on 08.09
#### Task 1 - Who are you?
**<ins>Generic:</ins>**<br>
* **What do you expect from Systems Modeling?**<br>
I wish to get a better understanding of what “systems modeling” means and what kind of topics it covers. At this point I can only state that some keywords sound familiar to me, but I don’t really remember what exactly they refer to. I wish to learn to see the pros and cons of different approaches to systems modeling.<br><br>
* **Which sw architectures/modeling techniques have you already worked with?**<br>
I have some minimal experience with UML, and we have covered some topics in a few software classes before, but it was a while ago.<br><br>

**<ins>Personal:</ins>**<br>
* **Who are you, why are you studying in SE master?**<br>
I’m Ida Maria and I’m actually studying data science, but would like to get a wider perspective and also learn more about software development, especially since this knowledge is becoming more and more relevant for me at my workplace.<br><br>
* **What are your sw development  skills?**<br>
I can write some code and I have some experience with different stages of the software development process, such as planning, quality control, testing etc.<br><br>
* **What are your weaknesses regarding sw development?**<br>
Currently my knowledge of different software development topics are a little bit chaotic and I wish to introduce some structure into my understanding of this.<br><br><br>

#### Task 2 - What is software architecture?: 
**<ins>Definitions/examples for software architectures:</ins>**<br>
* ["Software architecture provides an explanation of how your systems behave on a structural level."](https://www.castsoftware.com/glossary/Software-Architecture-definition-examples-explanation-tools-principle)
* ["Software architecture is a platform for conversation."](http://www.codingthearchitecture.com/pages/define.html)<br>

The second one is probably my personal favourite, since it conveys the message of it being an understandable and representative fundamental base for a software. It connects different parts and people that are important in the process of developing the software.
 
Since the breakout rooms disappeared so quickly, I did not manage to write down the names of my companions there as we were supposed to. I only recall that someone was named Simo. Unfortunately, we didn’t really reach a consensus about the best definition either. A little bit more time for the task and the ability to still see our breakout room chat after turning back to the lecture would have been appreciated, but I understand that we are all still struggling to understand how all those online structures work. We’ll get there! :) <br><br><br>

#### *Task 3*
We skipped the groupwork part of this task in the lecture since we didn't have enough time left. I also had some trouble with my internet connection so I missed part of the explanation on what had to be done individually - I'm sorry!<br><br><br>

#### Task 4 - Abstract vs concrete
**<ins>Definitions:</ins>**<br>
* **concrete** - I would say that a word/phrase/concept is concrete if it can be associated with a single (or a very limited amount of) mental image. E.g if I say “this black cat that is sitting over there”, then everyone will have a very similar understanding of what I am talking about.<br><br>
* **abstract** - A word/concept is abstract, if it allows you some freedom in interpreting it. E.g if I say “comfort”, then some might envision a soft armchair with a warm blanket and a hot cup of tea, while for others it means spending time with good friends or even having financial stability.<br><br> 
* **example** - A simplified and easily graspable piece of the concept that we are trying to understand or the idea that we want to convey.<br><br>

**<ins>Examples:</ins>**<br>
**abstract**|**concrete**
------------|------------
happiness|smile
sadness|tears
comfort|blanket
dedication|Master's thesis
anger|frown

<br><br>
#### Task 5 - Stories as modeling arguments
The advantage of using stories is that they are usually easy to understand for people with different backgrounds. Writing a short story also takes less time and effort than writing the actual code or creating a well-structured and easy to follow diagram, therefore it is easier to prepare for further discussion. Stories also tend to focus on whoever will need to use the actual system once it's ready, therefore it is a good way to emphasise the main functionalities the system must have. The downside is that stories can be rather abstract and allow people to interpret things differently, especially if they work in very different fields and therefore "don't speak the same language". Furthermore, we really depend on the storytellers understanding of what is important, which can sometimes lead to only focusing on a small subset of crucial aspects or workflows that the system should cover.<br><br><br>

#### Reflection on lecture
I will start with a more general reflection on the course itself. I think it rather hard to find relevant informtion, since it is divided between so many sources: the courses page, the syllabus in Google Docs, the several chats on Discord... Especially the type of communication on Discord is annoying for me. There are several chats that in parts contain information and in parts just replications of the same info. For example in one chat it was mentioned that we were supposed to watch a video before the first lecture and in another channel it was said that we shuld also read an article. Also there are chats/channels/? called "lecture on air" and "lab on air", but the actual lectures and labs take place in BBB. Also the several small public groupchats (tmpgroup...) create a lot of noise since we are notified every time someone writes something there. Overall it is just very chaotic.<br>
I think it would be best to lose many of those different discord chats and make it clear which information goes where. For example there could be one chat where only lecture preparation tasks are given (eg "Before the first lecture on 08.09 you must answer these questions based on this video and read this article). Then another chat for general announcements (Eg "We can now meet in person in classroom xxx for our next lecture" or "Remember that the deadline is coming up").<br> 
Currently we have a "general" and "announcements" channel and I don't really understand what the difference between them should be. I think the "general resources" chat is good, it makes the necessary links and documents easier to find.<br>
Long story short: less info channels == less noise == better understanding of what needs to be done == a lot less frustration!<br><br>
Apart from the technical difficulties and confusions, my first impression of the course was rather positive. It is always lovely to see lecturers and instructors who really want to interact with the sudents and actually care about everyone's progress, rather than just present the lecture materials and then maybe answer to some emails. I must admit that such lecture format is a bit out of my comfort zone and I will probably be annoyed by it at some point in the future, but I know that it can actually be beneficial to me and I'll try to be openminded about it. I think that more of the university courses should be based on discussion and dialogue, rather than just listening, reading and presenting the exam - this is what the university exxperience should be all about! But since it usually isn't it is just a bit hard to get used to it now. It was nice to see how friendly the lecturer and the lab instructor are. I was a bit worried after reading the email where it was stated that "I take such preparation tasks very seriously", but luckily it doesn't mean we have to answer every single thing correctly and perfectly. Instead it's just learning via a friendly discussion.<br><br>
#### Reflection on lab
Again, the biggest downside was the organisational side. Dividing people into groups took a lot of time and it could have been handled a lot more efficiently. For example, there could have been a Google Spreadsheep document for each lab with an available topic and four empty slots for names on each line. This document could have been shared with the students and we could all have just written our name in an available slot and be done with it in a few minutes. Something like that:<br>

**topic**|**student1**|**student2**|**student3**|**student4**
---------|------------|------------|------------|------------
topic 1| | | |

I also wish we had solved some more tasks together in the lab to get us more on the right track with the textbook exercises. I hope my feedback on the prganisational details didn't appear too agressive, I understand how hard it is to lead a course with a large number of participants fully online when it is actually meant to be given in a classroom.



