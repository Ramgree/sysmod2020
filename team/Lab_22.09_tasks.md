## Tasks given in the lab on 22.09.2020

### 1) Matching

**(1) List the letters or mark the checkboxes of the object diagrams that are allowed.**

Answer: a, b, c

**(2) For the forbidden object diagrams, mark (or describe) the invalid elements.**

Answer: d - there cannot be associations between two objects of class C. e - there cannot be associations between two objects of class C.

**(3) Add the missing link names to the object diagrams where possible.**

Answer: 

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab03-matching-3.png">

**(4) Draw an object diagram that conforms to the class diagram of Figure 3.6 and that has one B that contains four Ds where each D has one C.**

Answer: 

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab03-matching-4.png">

### 2) Table and things
* Class diagram of the things on the table<br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/class.jpg">

Here we have objects paul from class Person, table from class Furniture, pen and pencil from class Writing_tool and paper from class Office_supply. Currently there is an association
between paul and the table and between table and each object on the table. It is debatable whether there should also be associations drawn between paul and the objects on the table,
since paul owns them all. However, the owner is marked as an attribute for each object. Therefore, we've only drawn associations with the table, since the things are
physically on the table. The color of the pen and pencil and the state of the paper are given as attributes. All relationships are just regular assotiations.<br><br>

* Object diagram of the things on the table<br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/object.jpg">

Here we have class Person with an attribute "name", class Furniture with attributes "type" and "owner", class Office_supply with attributes type and owner and with two subclasses:
class Writing_tool with the additional attribute "color" and class Paper with the additional attribute "state". Person and Furniture are related with a one-to-many association, because
one person can have several pieces of furniture (or 0 pieces of furniture, therefore the 0..*). Furniture is in a directed one-to-many association with Office_supply, since 
one piece of furniture can hold several office supplies (or again - also zero). The last kind of relationship is inheritance between Writing_tool and Paper and Office_supply.<br><br>

### 3) Deriving classes from code
* Class diagram of the situation shown in code
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/bank.jpg">

We have three classes: Bank with no attributes and with method .getTotalAssets() that has no arguments; Customer with the attribute "name" (of type String) and the method .setAccount(Account) that takes and Account class object as an argument; Account with the attributes "bank" (of type Bank) and "id" (of type String) and the method .deposit(float) that takes a float as an argument. (Actually the image says int, but let's just pretend it says float, I realized my mistake too late...). We see that one bank is associated with many clients, one client can have several bank accounts and several bank accounts can form part of a bank (aggregation).

### 4) Mancala
The derived class diagram can be found [here](http://www.plantuml.com/plantuml/uml/SoWkIImgAStDuKhEIImkLl1Dp4jEp4daWj8ALWh19KMPUUaA1Jc9bQb58QL5ULnGfG5W4RXA9KCb1IrTNGKb8oMO58H2c96Nc9kA4CpCAr4eI4rAoaajzipp1XgHWKFE8p4l1MvfPWbK5S92CoMmC12ZwkHoICrB0NeD0000) <br>
As for the chosen cardinalities the Mancala - Player cardinality is 1 - 2 because as it’s a 2 player game there is always going to be 2 players. And as each player has 6 pits in the game then the cardinality of Player - Pit is 1 - 6.

### 5) ATM money withdrawal
**Derive a class diagram from the objects diagrams created in exercise 2.1.6.**

Class diagram:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab03-ATM-diagram.png">

**For each association, explain the cardinalities you have chosen.**

All cardinalities are 0-1. In the physical world and in the code (which somewhat poorly imitates the real world), each ATM has only one CardReader, one Keyboard, one Screen, one Database, one MoneyContainer. Each of them is part of only one ATM, but they do not need to have a reference for it in the code level.

Manually implement this class diagrams in Java (in for example IntelliJ) take special care to achieve bidirectional references and referential integrity (like shown in the lecture). Implement fluent-style access methods for all attributes.

Referential integrity with these 1-0 associations was achieved via having references always to single objects, not collections, so there can never be more than one. To guarantee a reference, they are created at ATM object construction time. Since classes other than ATM do not have a reference to ATM objects, they will never have an association to an ATM. Hence all 1-0 associations should hold.

Create two tests, creating the two respective different object structures taken from two different object diagrams from exercise 2.1.6 Assign meaningful object names. Take one screenshot each of the fully expanded object-structure (in the debugger) at the end of the tests.

Scenario 1: 

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab03-ATM-Scenario1.png">

Scenario 8: 

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab03-ATM-Scenario8.png">

The debugger states for the two scenarios are very similar because the ATM was treated as a state machine that resets values and goes back to the initial state (“WaitForCard”) after dispensing the card and both scenarios ended similarly. The breakpoint was immediately before the last step, so the ATM state shows “DispenseCard”.

**Extend one of your tests with commands and a respective assert statement to prove that you implemented referential integrity for one to-n-association of your choice correctly. Explain why your test proves this.**

There is no simple way to check 0-association except with Reflection - we could check all the fields of a class and assert that none of the fields has type ATM. But this is already evident from code analysis, so I will skip the use of Reflection.

To prove 1-association, we have to show that the object reference exists (i.e. it’s not null). Again, this is evident from code analysis (the references are created at ATM object construction time), but can also be done with code:
~~~
assert(atm.getKeyboard() != null);
assert(atm.getScreenKeys() != null);
assert(atm.getDatabase() != null);
assert(atm.getCardReader() != null);
assert(atm.getMoneyContainer() != null);
~~~
Since the references are to single objects, there is at most 1-association.

**Check in your class src files as well as Tests into your repository with a small readme how to add these to an IntelliJ (or other IDE you chose) project and run the tests.**

Code is at https://github.com/Ramgree/sysmod2020/tree/master/team/lab_3_src
