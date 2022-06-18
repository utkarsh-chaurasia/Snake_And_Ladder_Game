# Snake_And_Ladder_Game

# ABSTRACT
Games are fun activities that can enhance the process of
thinking, learning and problem-solving strategies. With these
criteria, games have been said one of the best learning media
for education that can improve the learning process. With the
exploding of technology, computer games are quite popular
among students. In the learning process, many ways have been
introduced to attract students. One of the basic programming
languages that should be taken by many students is a Java
programming language. A programming language is a difficult
subject for students to learn. They are having problems to
understand the concept of that subject. This study purposely to
develop a computer game for learning Java programming based
on Snake and Ladder board game.

# INTRODUCTION
Snake and ladder game have been chosen as a learning media
in this study. This game played on board with gridded squares.
Several ladders and snakes exist on the board, which connect to
specific grids. The players will navigate the board according to
the roll of dices. The navigation process on the board has been
mapped according to the course to teach and learn. The past
research shows the effectiveness of the game as a learning
media. Therefore, Java programming seems appropriate to
learn through a game because most of the programming
language is very difficult to understand, and some of the
students are giving up learning. The learning process through
the notes, reference book and guidance from the lecturers are
not enough to attract the student to understand the concept of
programming language. To make it fun, this study aims to
develop a game based on Snake and Ladder board game in Java
programming language.

# Data member and its usage of core Java
1) int[ ][ ] store = to Creat the 2D Array for the board.
2) int no_of_players = Total no of player’s who wants to play agame.
3) int game = This variable contains the main logic of the
program, in which the counters moves forward.
4) int[ ] start = use in main loop for compare and set limits.
5) int dic_show = to show the dice in game.
6) String[ ] player_name = Store player name.
7) String lastname = To hold the winning name.
8) int[ ] player_game_pos = Store player position .
9) String RESET = "\033[0m"; = Colour Reset.
10) String YELLOW = "\033[0;33m"; = Colour Code.

# FUNCTION
1) Public int snake(int game)
In this function, we holds all the snakes. If your counter lands
on the head of a snake, you must slide down to the bottom of
the snake.
2) Public int Ladder(int game)
In this function, we holds all the Ladders. If your counter lands
at the bottom of a ladder, you can move up to the top of the
ladder.

# Input Output Explanation
![image](https://user-images.githubusercontent.com/52343042/174440907-b980adef-b1ec-48cc-9456-f2cea65479fe.png)
![image](https://user-images.githubusercontent.com/52343042/174441390-e7fa9547-9db2-4a33-88c1-e9f1aee7f9b7.png)
![image](https://user-images.githubusercontent.com/52343042/174441811-a675a3d6-5a7e-4174-a009-ff15da8ce317.png)
![image](https://user-images.githubusercontent.com/52343042/174441907-e8d2a121-35e2-4632-982a-6b4a5dcfcb6f.png)
![image](https://user-images.githubusercontent.com/52343042/174441933-53c2c0ad-96d4-4ec5-80fc-e41e8cd1876b.png)



