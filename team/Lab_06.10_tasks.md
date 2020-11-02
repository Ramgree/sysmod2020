## Tasks given in the lab on 06.10.2020

### 1) Mancala Usecase Diagrams

### 2) Mancala Personas

### 3) ATM Money Withdrawal Usecase

**This should be an easy one as you have plenty of examples from the movie presentations.
Design two usecase diagrams for your ATM Money Withdrawal design. One very high level, showing only a customer and a technical repair person interact with the system and only the immediate use cases they are interacting with.**

First diagram:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab05-ATM-usecase-1.png"><br>

**As the second usecase diagram, design a very detailed usecase diagram that takes into account the server, the transaction list, a potential credit line and handling, a call center, and some bank admins or clerks that also have access to this system.**

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab05-ATM-usecase-2.png"><br>

**Discuss which of the two would be helpful for which part of the development of just the software for the ATM machine and why. Decide as a team if any of the two versions of diagrams would be helpful for you to design the ATM machine software or if you would rather use a component diagram or other modeling artifacts that we already covered (or even others that you know of).**

Both diagrams can be used in multiple stages of development. 

For the first, simple one - in any stage, this diagram can accompany other diagrams/documents about the most important (or these particular) use cases (allowing to exclude all less important or non-relevant use cases). In early stages, this can be as part of the MVP design documents since, again, it has the most important use cases on it. 

The second, more complex one, can be used both in early-ish stage development - when a high level overview of all use cases is desired. Additionally, later on, when individual use cases are planned out in detail, then this diagram can show what other use cases need to be developed and how they might interact or group together.

At different development stages, people have different preferences. For some, the basic version is good enough, because developers can prefer other, more detailed documents, and user stories can be thought more of as diagrams accompanying other more complex diagrams or merely as a communication device with stakeholders.

### 4) ATM Money Withdrawal Personas

**Design two potential personas for your ATM Money Withdrawal system in detail. Pick two personas representing customers that withdraw money. One completely normal person and one who has a lot of debt and always tries to overdraw their account (consider either motivating a protection for the latter person or an easy credit system with recurring payments to pay the money back). Discuss the relation of these personas in contrast with the persons you defined in your stories and vote on which artefact supports your software development more (as well as note down the main point why you think so).**

**"Normal person"**:

**Mark Brown** is a 27 year old recent graduate of Tartu University software engineering program, working in a local start-up company. He is single, has no driver's licence or car and lives together with his younger brother. As a new employee, he spends a lot of time at work and has little time for hobbies or social life. He does enjoy lunches at a local kebab truck, where he needs cash to pay. He heard from the owner of the kebab place that ATM terminals are a hassle to set up and they both are frustrated that they need to handle cash, since the closest ATM is 2.5 km away and neither has time for such walks. During the Coronavirus crisis, they are especially wary of touching money that has been in contact with an unknown amount of people. 

**In-debt person**:

**Lisa Black** is a 26 year old student of Taltech in the Cyber security program. She lives with her mom, a pensioner, in a two-room flat in Keila. She likes to walk dogs in the local dog shelter and to read science fiction. As a student, she has had to take multiple student loans to support herself and also has to also partially support her mother. Sometimes she forgets when the bank loan payments are due and since they happen automatically, it leads to an attempt to overdraw her account and difficulty to pay for grocies at the end of the month. Lisa would benefit from a monthly calendar view of upcoming known payments or a very low interest credit card.

I think it boils down to the content - if a user story is actually based on reality and shows an actual user need (e.g. a calendar with upcoming payments info), then it can be incredibly useful to find use cases that were not thought of before. This is the biggest benefit of personas based on data - they look at actual users and their needs.

### 5) Mancala Controller and Tests

**Changes in class structures**:
- Mancala
  - Added 'winnerPlayer' property to easily keep track if the game is won or not, and by which player.
  - Added Pits (numbered 0 to 11, where 0-5 are for Player 1 and 6-11 are for Player 2) and PlayerPits (numbered 0 and 1, where 0 is for Player 1 and 1 is for Player 2).
- Player
  - Added 'time' property to keep track of idle time and dropping the player from the lobby after some period of inactivity.
  - Removed the 'pebblesInKalah' and 'pebblesInHand'. These are tracked via the 'pebbles' parameter in the Pit class. 

The Server side code can be found here: https://github.com/Ramgree/sysmod2020/tree/master/team/Group-13-Mancala-Server

The first two tests are implemented in the Lab5Tests class. The third test requires the server to be running. First, the Lab5Test3Dave should be run - this makes the player Dave connect to the lobby and challenge Mary. If the challenge is sent, then Lab5Test3Mary test can be run, which connects Mary to lobby and challenges Dave. After that, the two players make random valid moves if it's their turn until a winner is found. 

To run two tests in parallel, I chose to run one through Gradle run configuration and the other with a JUnit run configuration. 
