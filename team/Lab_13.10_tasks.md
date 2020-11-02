## Tasks given in the lab on 13.10.2020

### 1) Mancala Sequence Diagrams

**Waiting for your turn diagram**:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab06_mancala_diagrams-WaitForTurn.png"><br>

The diagram reflects the basic parts and messages of GUI-server interaction. The server can be queried for a game by ID. From the received object, the GUI can check which player's turn it is and accordingly either wait or allow to send a move to the server. This loop takes place until the server sends a game object with a 'winner' parameter, in which case the winner is shown and no more moves will be accepted.

**Game Lobby diagram**:

<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/lab06_mancala_diagrams-GameLobby.png"><br>

The diagram shows three players (Dave, Mary and John) and the server. It was difficult to choose a layout that shows that many of these activities can happen at the same time and not sequentially, so the diagram is slightly incorrect. However, the important steps are shown: each player sends their name to the Lobby and recieves a response. The players can then challenge each other (addChallenge(my_name, target_name)). If Mary and Dave have challenged each other, then the server assigns a game for them with a specific ID. The players can query the server for games and if they see a game where they are one of the players, then they start playing.

### 2) Mancala Wireframes
Joining the server/lobby: <br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/wireframes/Welcome_screen.png"><br>
Being in the lobby: <br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/wireframes/Lobby.png"><br>
Game starts between Bob and Mary: <br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/wireframes/Game_start.png"><br>
Bob takes the first turn: <br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/wireframes/Bob_takes_turn_1.png"><br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/wireframes/Bob_takes_turn_2.png"><br>
The game ends with Bob winning: <br>
<img src="https://github.com/Ramgree/sysmod2020/blob/master/team/images/wireframes/Game_end.png"><br>

### 3) Mancala GUI

The code can be found in https://github.com/Ramgree/sysmod2020/tree/master/team/Mancala%20GUI
