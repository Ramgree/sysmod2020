Lecture 3 notes: 
------------------------
# Systems Modeling 2020

## Lecture 3 (22.09.2020)

### Preparation

#### Class diagrams pros video, Group 12

I wish the first video would have had examples of dependency, association, aggregation etc with actual examples, not with the College-Student pair.

Strongest points:
- Class diagrams are simple to create (with the right software)
- Class diagrams give a detailed view of the system

Lessons learned:
- relationships in a class diagram include dependencies, inheritance and associations, not merely associations.  


#### Class diagrams pros video, Group 7

Strongest points:
- Class diagrams can be used to create classes in code (with the right tools) and vice-versa.
- Class diagrams are concise and expressive.

Lessons learned:
- Class diagrams can be considered when Object diagrams have become too messy

I liked the inheritance vs composition discussion. I've learned about the usefulenss of providing interfaces in game design. E.g. in the Unity engine, components are used to provide functionality to objects. This provides much more flexibility.
I also liked that concrete tools were introduced that enable automated class diagram creation.

####  Class Diagrams cons, Group 6&2

Strongest points:
- Class diagrams might create unnecessary complexity if not done well
- Class diagrams have some difficult yet important aspects (e.g. distances between classes)

Lessons learned:
- Differences between aggregation and composition. 
- When creating diagrams, one has to think about the recipients and tailor the diagram accordingly.

It was slightly hard to find which diagram relationship was discussed since they were all on the same slide and the order of discussion was random.

----

My own pros:
- A class diagram can give a good overview for the developers themselves, if the diagram is automatically created and the domain is not too complex.

My own cons:
- A small point, but still relevant: in some complex domains (e.g genetics) a class diagram might be too abstract and not be useful enough to assess if the architecture covers all edge cases - an object diagram (with concrete data) or something else might be also required.

**During lecture:**

What is strange and why in the 4 diagrams? 

- Diagram 1: attributes. Some strings are in quotation marks, some are not. I am also not sure which association is shown - seems like the Player and Deck could have swapped places and nothing would have been lost. Ulno: Biggest problem: no lists/arrays inside the attributes.
- Diagram 2: object names - the object Player has duplicate property 'Name'. Ulno: usually it's the object name first, then the class. Object type and value should have equals sign, not colon.
- Diagram 3: associations - why is there an arrow between Bank and Account, but not elsewhere? Ulno: No underline, capitalized object names.
- Diagram 4: semantic: transcation1 has withdrawal1 associated with it, but transaction2 does not, even though it's also a withdrawal. Ulno: attributes - in OO design we don't need ID on a diagram. Equals signs instead of colons.

Reminder for self: Objects should have be underlined, classes not. Objects should be lower-case.


Con note that I added: Class diagrams might be redundant or not that useful in smaller projects. I guess my general point was that their usefulness depends. But that seems a bit of a cop-out without giving good examples. 

The discussion partly overlapped (it was hard to find many different arguments) and we had some disagreements regarding how useful these diagrams are or how useful the automation tools are. The biggest problem was that we don't yet have much experience with them and we cannot back up our intuitions with anything solid.

##### What was the most unexpected feature you saw me implementing and why?

Using a LinkedHashSet instead of a regular list - perhaps it's an implementation detail that makes sense, but I didn't notice it being addressed.

##### What was the hardest part to follow and why?

How slow implementing domain objects can be in Java compared to e.g. kotlin.  Then again, fulib and class/object diagrams might look very different in 

### Lecture reflections

I like that some videos are prerecorded and can be watched at your own pace (even if for some reason changing the speed and pausing/unpausing is glitchy). The coding part seemed to take longer than it should have, but it was good that the video was also in 1.25 speed by default.

### Lab reflections

We worked more on the video than on the exercises, but teamwork seems to work, so that's good. Some lab tasks do take a long time though - I feel that I achieve the learning objectives with a smaller amount of work already.
