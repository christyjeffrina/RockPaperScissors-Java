How to Run the Program
Set Up Your Environment:

Make sure you have Java installed on your system. You can download it from the official Java website.
Create a Java File:

Open a text editor or an IDE (like IntelliJ IDEA, Eclipse, or Visual Studio Code).
Copy the code above and paste it into a new file named RockPaperScissors.java.
Compile the Program:

Open your command line (Terminal, Command Prompt).
Navigate to the directory where you saved the file.
Run the command:
bash
Copy code
javac RockPaperScissors.java
Run the Program:

After compiling, run the program with the command:
bash
Copy code
java RockPaperScissors
Gameplay Instructions
The game will prompt you to choose Rock, Paper, or Scissors by entering the corresponding number.
The computer will randomly choose its option.
The game will determine the winner of that round and keep track of the scores.
You can continue playing rounds until you choose to stop by entering anything other than "yes" when prompted.



Key Features of This Version
Input Validation:

Validates the number of rounds to ensure it’s a positive integer.
Validates the player’s choice to ensure it's between 1 and 3.
Round Limit:

The user can set the number of rounds they want to play, making the game more flexible.
Clearer Outputs:

Displays the round number, and at the end of the game, shows who the overall winner is.


Further Enhancements
You could further enhance this game by:

Adding more options (like Lizard and Spock).
Keeping track of win/loss statistics over multiple games.
Implementing a graphical user interface using JavaFX.
