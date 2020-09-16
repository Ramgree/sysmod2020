## Tasks given in the lab on 08.09.2020

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


### Task 1.6.2.3

We had to find some additional info about the game from Google. The aim of the game is to capture more pieces than the opponent. Game ends when one side of the table is empty - then both players count their pebbles.<br><br>
 
1. Mary distributes the pebbles one by one and the last pebble ends up in her own Kalah.
2. Mary distributes the pebbles one by one and the last pebble ends up in an empty pit.
3. Mary distributes the pebbles one by one and after her turn, her side of the board is empty.
4. Mary distributes the pebbles one by one and the last pebble ends up in a regular pit with other pebbles already in it.


### Task 1.6.2.6

**Examples**:

- The user wishes to take out 5€ and the ATM dispenses it.
- The user wishes to take out 5€ and the ATM declines the request since the user does not have enough money on account.
- The user wishes to see bank balance and the ATM shows it.
- The user wishes to see bank balance but the ATM does not show it because an incorrect PIN number was entered. Mary realises that she has forgotten her PIN and does not try again.
- The user wishes to deposit 5€ and the ATM accepts the money.
- The user wishes to deposit 5 USD and the ATM rejects it because only euros are  accepted.
- The user forgets the card inside the ATM after using it and the machine starts beeping.
- The user wishes to make a pre-defined payment and the payment is processed.


### Task 1.6.3.3

#### 1) Examples to scenarios:
1. Mary distributes the pebbles one by one and the last pebble ends up in her own Kalah.
* 1.1 Mary picks up 3 pebbles from the 4th pit on her side.
* 1.2 Mary starts moving counter-clockwise.
* 1.3 Mary places one pebble in the 5th pit.
* 1.4 Mary places one pebble in the 6th pit.
* 1.5 Mary places the last pebble in her Kalah.
* 1.6 Since the last pebble ended up in the Kalah, it’s Mary’s turn again.
* 1.7 Mary picks up 3 more pebbles from the 2nd pit.<br><br>
 
2. Mary distributes the pebbles one by one and the last pebble ends up in an empty pit.
* 2.1 Mary picks up 4 pebbles from the 4th pit on her side.
* 2.2.-2.4 Mary places one pebble in each consecutive pit, moving counter-clockwise.
* 2.5 Mary places the last pebble in the 1st pit on her opponent’s side, which was previously empty.
* 2.6 Mary takes the 4 pebbles from her 6th pit (the one opposite of the opponent’s first pit).
* 2.7 Mary places the 4 pebbles into her own Kalah.<br><br>

3. Mary distributes the pebbles one by one and after her turn, her side of the board is empty.
* 3.1 Mary has only two pebbles left in her 6th pit.
* 3.2 Mary takes the two pebbles from the 6th pit.
* 3.3 Mary places one pebble to her Kalah.
* 3.4 Mary places the second pebble to the first pit of her opponent.
* 3.5 Mary’s side of the board is empty so the game has ended.
* 3.6 Mary and her opponent count their pebbles.
* 3.7 Mary has more pebbles than her opponent so Mary wins.<br><br>

4. Mary distributes the pebbles one by one and the last pebble ends up in a regular pit with other pebbles already in it.
* 4.1 Mary takes 5 pebbles from her 4th pit.
* 4.2 Mary places one pebble in each consecutive pit.
* 4.3 Mary places the 5th pebble in her opponent’s 2nd pit that already had 2 pebbles in it.
* 4.4 Mary’s turn has finished and her opponent now starts his turn.<br><br>

#### 2) Come up with two scenarios for Mancala

#### 3) Invalid move scenario
1. Mary picks up 2 pebbles from her 4th pit.
2. Mary tries to place one pebble in her 3rd pit.
3. The system doesn’t allow her to place the pebble in the 3rd pit.
4. The system displays an error: “You must always move counter-clockwise”.

#### 4) Last three turns of Mancala to end in a tie - scenario
1. Mary and Toby are playing Mancala. Mary has 3 pebbles in her 4th pit, 1 pebble in 5th pit and all other pits on her side are empty. There are 14 pebbles in her Kalah. Toby has 1 pebble in her 1st pit, one in her 4th pit, 3 in her 5th pit, 2 in her 6th pit and 10 in her Kalah.
2. Mary takes the 3 pebbles from the 4th pit.
3. Mary places 1 pebbles to the 5th pit.
4. Mary places 1 pebbles to the 6th pit.
5. Mary places the last pebble in her Kalah. Since the last pebble went to her Kalah, it’s her turn again.
6. Mary takes the 2 pebbles from her 5th pit.
7. Mary places one pebble to the 6th pit.
8. Mary places one pebble to her Kalah. Since the last pebble went to her Kalah, it’s her turn again.
9. Mary takes the 2 remaining pebbles from her 6th pit.
10. Mary places one pebble to her Kalah.
11. Mary places one pebble to Toby’s first pit.
12. Mary’s side of the table is now empty so the game is over.
13. Mary has 18 pebbles in her Kalah, Toby has 10 pebbles in his Kalah and 8 pebbles on his side of the board. They both have 18 pebbles, therefore the game ended in a tie.


### Task 1.6.3.6

I define the following steps which are shared among many scenarios and refer to the user as Mary:

- (1): Mary enters their card to the ATM.
- (2a): Mary enters the correct PIN on the ATM keyboard.
- (2b): Mary enters an incorrect PIN on the ATM keyboard.
- (3): Mary clicks on "Finish"
- (4): The ATM returns the card.
- (5): Mary takes the card.

**Scenarios**:

- The user wishes to take out 5€ and the ATM dispenses it.
	- (1)
	- (2a)
	- Mary clicks on "Withdraw", then enters "5" on the keyboard and clicks on "OK"
	- The ATM checks that Mary has more than 5€ on her account, then dispenses a 5€ note.
	- Mary takes the money and puts it in her pocket.
	- (3)
	- (4)
	- (5)
- The user wishes to take out 5€ and the ATM declines the request since the user does not have enough money on account.
	- (1)
	- (2a)
	- Mary clicks on "Withdraw", then enters "5" on the keyboard and clicks on "OK"
	- The ATM checks that Mary has less than 5€ on her account and shows a corresponding message.
	- (3)
	- (4)
	- (5)
- The user wishes to see bank balance and the ATM shows it.
	- (1)
	- (2a)
	- Mary clicks on "Balance"
	- The ATM shows Mary's current balance on the screen.
	- (3)
	- (4)
	- (5)
- The user wishes to see bank balance but the ATM does not show it because an incorrect PIN number was entered. Mary realises that she has forgotten her PIN and does not try again.
	- (1)
	- (2b)
	- Mary clicks on "Balance"
	- The ATM shows a message that an incorrect PIN was entered.
	- (3)
	- (4)
	- (5)
- The user wishes to deposit 5€ and the ATM accepts the money.
	- (1)
	- (2a)
	- Mary clicks on "Deposit"
	- The ATM shows instructions on the screen and the deposit container is opened
	- Mary places a 5€ note in the container
	- After a few seconds the container closes, the ATM counts the money and shows the amount on the screen.
	- (3)
	- (4)
	- (5) 
- The user wishes to deposit 5 USD and the ATM rejects it because only euros are  accepted.
	- (1)
	- (2a)
	- Mary clicks on "Deposit"
	- The ATM shows instructions and opens the deposit container
	- Mary places a 5 USD note in the container
	- After a few seconds the container closes, the ATM counts the money and shows a message saying that no eligible bank notes were found. The container opens.
	- Mary takes back the 5 USD note.
	- (3)
	- (4)
	- (5) 
- The user forgets the card inside the ATM after using it and the machine starts beeping.
	- (1)
	- (2a)
	- Mary clicks on "Balance"
	- The ATM shows Mary's current balance on the screen.
	- (3)
	- (4)
	- Mary walks away, leaving the card inside.
	- The ATM starts to beep after a few seconds to indicate a card was left in the card-reader.
- The user wishes to make a pre-defined payment and the payment is processed.
	- (1)
	- (2a)
	- Mary clicks on "Payments"
	- The ATM shows a list of pre-defined payments on the screen.
	- Mary clicks on the payment for her ISP.
	- The ATM shows details of the payment on the screen.
	- Mary clicks on "Proceed"
	- The ATM processes the payment.
	- (3)
	- (4)
	- (5)
