## Tasks given in the lab on 22.09.2020

### 1) Matching

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
