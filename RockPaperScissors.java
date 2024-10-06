import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        int playerScore = 0;
        int computerScore = 0;
        int totalRounds;

        // Get the number of rounds to play
        System.out.print("Enter the number of rounds you want to play: ");
        while (true) {
            if (scanner.hasNextInt()) {
                totalRounds = scanner.nextInt();
                if (totalRounds > 0) {
                    break;
                } else {
                    System.out.print("Please enter a positive integer: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a positive integer: ");
                scanner.next(); // Clear the invalid input
            }
        }

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\nRound " + round + ":");
            System.out.println("Choose Rock, Paper, or Scissors:");
            for (int i = 0; i < choices.length; i++) {
                System.out.println((i + 1) + ". " + choices[i]);
            }

            int playerChoice;
            while (true) {
                playerChoice = scanner.nextInt();
                if (playerChoice >= 1 && playerChoice <= 3) {
                    break;
                } else {
                    System.out.print("Invalid choice. Please choose 1, 2, or 3: ");
                }
            }

            String playerSelection = choices[playerChoice - 1];

            // Generate computer's choice
            int computerChoice = random.nextInt(3);
            String computerSelection = choices[computerChoice];

            System.out.println("You chose: " + playerSelection);
            System.out.println("Computer chose: " + computerSelection);

            // Determine the winner
            if (playerChoice == computerChoice + 1) {
                System.out.println("It's a tie!");
            } else if ((playerChoice == 1 && computerChoice == 2) || 
                       (playerChoice == 2 && computerChoice == 0) || 
                       (playerChoice == 3 && computerChoice == 1)) {
                System.out.println("Computer wins this round!");
                computerScore++;
            } else {
                System.out.println("You win this round!");
                playerScore++;
            }

            System.out.println("Score -> You: " + playerScore + " | Computer: " + computerScore);
        }

        // Determine the overall winner
        System.out.println("\nFinal Score -> You: " + playerScore + " | Computer: " + computerScore);
        if (playerScore > computerScore) {
            System.out.println("Congratulations! You are the overall winner!");
        } else if (playerScore < computerScore) {
            System.out.println("Computer is the overall winner. Better luck next time!");
        } else {
            System.out.println("It's a draw overall!");
        }

        scanner.close();
    }
}
