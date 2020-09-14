## Tasks given in the lecture on 08.09.2020

### Task 1.6.1.1
*  **<ins>Examples</ins>** <br>

Abstract: thought, happiness, friendship, system, workflow, education, data, personality, comfort, dedication.<br>
Concrete: an apple, a dog, a paper, a person, a table, a fact, a requirement, an article, the rain, a smile.<br><br>

* **<ins>Sample pairs**</ins><br>

**concrete**|**abstract**
------------|------------ 
sentence|idea
poem|thought
article|concept
feather|weakness
a Nokia phone|strength
laughter|feeling
book|knowledge
smile|happiness
frown|anger
Master’s thesis|dedication

<br>

* **<ins>Concrete example of a car**</ins><br>

This black Audi RS7 Sportback that I am standing next to.<br><br>

* **<ins>Definitions**</ins><br>

**concrete** - A word/phrase/concept is concrete if it can be associated with a single (or a very limited amount of) mental image. E.g if I say “this black cat that is sitting over there”, then everyone will have a very similar understanding of what I am talking about.<br><br>
<ins>How it relates to modeling?</ins> When we are modeling specific parts of our system, we need to be concrete in describing the details that are crucial for the correct functioning of the system. 
If our descriptions of those details are too vague or abstract, then the model will not provide enough information for a correct implementation.
In order for our model to be considered useful, it should be possible to map everything described in the model with the actual code. If the model lacks concrete details, then such mapping cannot be done 
and we need to figure out a lot of things while already developing the product. This might lead to forgetting or overlooking something important, which would result in a faulty product.<br><br>

**abstract** - A word/concept is abstract, if it allows you some freedom in interpreting it. E.g if I say “comfort”, then some might envision a soft armchair with a warm blanket and a hot cup of tea, while for others it means spending time with good friends or even having financial stability.<br><br>
<ins>How it relates to modeling?</ins> - At least in the initial stages of modeling, it might be useful to first give everyone a more abstract overview of what the system should be.
An abstraction will have less details crowding it and it can help everyone see the system as a whole, rather than just a set of tiny separate components.
However, it is important to keep in mind, that abstractions cannot be directly translated to code so they cannot be taken as the ultimate truth in the development phase.<br><br>

**example** - A simplified and easily graspable piece of the concept that we are trying to understand or the idea that we want to convey.<br><br>
<ins>How it relates to modeling?</ins> In order to better understand the functioning of the system, we might have to explain it through examples. 
Even when we are using stories to describe the system, we are actually just bringing examples of specific situations this system might have to encounter.
If we are working on a topic that is far from our everyday life, then it might be complicated to grasp the entire concept of the system at first. Bringing specific examples of what the system
needs to be able to do helps us to at least start understanding it.<br><br><br>

### Task 1.6.2.1

1. Person 1 plays S8 and Person 2 plays D8.
2. Person 1 plays D10 and Person 2 doesn’t have any cards of diamonds suit or any tens from other suits. Therefore, he draws a card from the middle. He gets a DQ and plays it since the suit matches.
3. Person 1 plays DQ and Person 2 doesn’t have any cards of diamonds suit or any queens from other suits. Therefore, he draws a card from the middle. He gets a SQ but decides to keep it and pass on his turn. Player 3 now plays HQ.
4. Person 1 plays S9 and Player 2 has no cards he could play. He should take a card from the middle, but the drawing stack is empty. Therefore, all cards except for the topmost one in the playing stack are shuffled and turned over. Player 2 now draws a DQ, which cannot be played on S9 so he passes on his turn to Player 3.
5. Player 1 plays D7. Player 2 therefore needs to draw 2 cards from the drawing stack before the game can continue regularly.
6. Player 1 plays C8, so Player 2 has to skip his turn. Player 3 plays C10 on top of C8.
7. Player 1 plays D7. Player 2 only has C8, SJ and S10. He plays SJ, since a Jack can be played on any card.
8. Player 1 plays CJ and states that the next card played must be of diamonds suit. Player 2 wanted to play C10, but will now have to play a card of the diamonds suit. Player 2 plays DJ.



