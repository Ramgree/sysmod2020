## Tasks given in the lab on 29.09.2020

### 1) Mancala Code Generation
The class diagram from fulib:<br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab4_mancala_class_diagram.PNG" width="250"><br>
Used the first scenario from [here](https://github.com/Ramgree/sysmod2020/blob/master/team/Lab_1509_tasks.md#1-examples-to-scenarios).<br>
The initial object state:<br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab4_mancala_code1.PNG" width="300"><br>
After step 1.5 of the scenario(Mary pick up and distributed pebbles from her 4.pit):<br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab4_mancala_code2.PNG" width="300"><br>
After step 1.7 of the scenario(Mary pick up the pebbles from her 2.pit):<br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab4_mancala_code3.PNG" width="300"><br>

### 2) ATM Money Withdrawal Code Generation
**Re-implement your class diagram from lab session 3 in umple. Implement two tests showing an object transition (for just one action) from your previous ATM money withdrawal stories. Show debug screenshots for the initial object states and the object states [after?].**

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab04-ATM-1.png"><br>

If we use associations 1-1, then Umple creates code that is impossible to run: ATM requires all other objects in its constructor, each of which in turn requires an ATM in their constructor, creating a loop that cannot be met.

We need to use associations 0..1 - 1 to introduce lazy instatiations of fields to the ATM. This results in the following diagram:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab04-ATM-2.png"><br>

Debug screenshot in the beginning of instantiation: 

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab04-ATM-3.png"><br>

Debug screenshot after inserting card:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab04-ATM-4.png"><br>

Debug screenshot after selecting ‘Withdraw’ and just before entering the amount:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab04-ATM-5.png"><br>

### 3) More Code Generation

### 4) Code Generation Discussion

### 5) Component Diagram Mancala Network Game
[1. High level view stressing the network connectivity and app running on a phone.](http://www.plantuml.com/plantuml/uml/SoWkIImgAStDuKhEpot8pqlDAr48JYqgIor24d0iA43Y1MG0QII-Rs9USc9E8XTNPbv9Qb5QOdAgWbzgINb-KJON5yGe1LrTk12K1Wg1ZGLY1JqzEwYXKAD08Z1NEAJcfG2T1m00) <br>
[2. Detail view of just the server part of the game.](http://www.plantuml.com/plantuml/uml/JOv12i9034NtEKNelZs2TEkY8dY2qFv2SPf8Z1KHxswfeyvkvl7V8-qrnECs9r8RmDK9li2h9_KsNqoXmPreBqaASapoW9TW2fequAFquCuMx7KqUXMJ0-9kVYRwoDmqkrzvrRT_xbBUSbt_Mz_71hFNGeVrz3S0) <br>
<br>
We think these diagrams would be somewhat helpful to include if they already existed as they do help to quickly understand how the system works and what is planned for it. They definitely wouldn't hurt any requirements analysis document. However if one would start from scrach and the question would be if he should make the diagrams then it probably would be a waste of time as this system is simple enough to not really need any diagrams. <br>

### 6) Component Diagrams ATM Money Withdrawal

**Here we will also go a little bit beyond what you have designed until this point.
Create two component diagrams:
High level overview of the atm machine software embedded in its relevant bank ecosystem (for example account management, transaction log, software updater, monitoring, and maintenance running in a secure cloud environment of the bank operating the ATM).
Detailed overview of the software running on the ATM also operating the hardware of the actual cash dispenser and card reader.
Re-visit and discuss the question if these diagrams would be a good base (or addition) to some requirements analysis document to get you started implementing specific parts of the Software of the ATM. If yes why, if no, why not and what is missing.
Add the discussion log and answers to your task solution.**

First diagram:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab04-ATM-user-1.png"><br>

Second diagram:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab04-ATM-user-2.png"><br>

**Would these diagrams be a good base (or addition) to some requirements analysis document to get you started implementing specific parts of the Software of the ATM. If yes why, if no, why not and what is missing.**

Answer: We would argue that these diagrams would be a good addition if they mirror the requirements document, which in turn mirrors real world requirements. If so, then they provide a quick way to grasp a document that might otherwise be tens (or hundreds) of pages long. 

Since this was a task where we had to also think of the design of the system and we did not have actual knowledge of how an ATM might/should work, then many details were omitted and others were improvised. Hence it is hard to assess how useful this could actually be. On its own, a component diagram for any non-trivial system is not usually enough to provide enough information to implement the system (unless it is very detailed, giving interface method names which are descriptive, and/or the implementer knows the domain). 

Overall, if the requirements analysis document is good enough, then component diagrams can be less detailed. If the analysis document does not give enough information, then a more detailed component diagram might be a better choice - named ports, interface implementations (in addition to interface definitions), interface method names etc.
