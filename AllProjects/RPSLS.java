import java.util.*;

public class Pasha_RPS {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean playing = true;
        int win = 0;
        int loss = 0;
        int tie = 0;

        while (playing) {
            String[] availableMoves = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
            System.out.println("Computer has chosen its move.");
            System.out.println();
            System.out.println("Now it's your turn to choose. Good Luck!");
            System.out.println();

            String userMove = "";
            boolean validInput = false;

            while (!validInput) {
                System.out.println("Please choose your move from these available moves: 'Rock', 'Paper', 'Scissors', 'Lizard', 'Spock'");
                System.out.println("Enter the move you chose: ");
                userMove = scan.nextLine();

                if (userMove.equalsIgnoreCase("Rock") || userMove.equalsIgnoreCase("Paper") || userMove.equalsIgnoreCase("Scissors") || userMove.equalsIgnoreCase("Lizard") || userMove.equalsIgnoreCase("Spock")) {
                    validInput = true;
                } else {
                    System.out.println("Invalid Move!! Please enter a valid move from the available options.");
                }
            }

            System.out.println("Computer chose: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
                tie++;
            } else if (userMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                    loss++;
                } else {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                    win++;
                }
            } else if (userMove.equals("Paper")) {
                if (computerMove.equals("Scissors")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                    loss++;
                } else {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                    win++;
                }
            } else if (userMove.equals("Scissors")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                    loss++;
                } else {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                    win++;
                }
            } else if (userMove.equals("Lizard")) {
                if (computerMove.equals("Rock") || computerMove.equals("Scissors")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                    loss++;
                } else {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                    win++;
                }
            } else if (userMove.equals("Spock")) {
                if (computerMove.equals("Lizard") || computerMove.equals("Paper")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                    loss++;
                } else {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                    win++;
                }
            }

            System.out.println();
            String playAgain;
            System.out.println("Do you want to play again?");

            while (true) {
                System.out.println("Type 'yes' or 'no': ");
                playAgain = scan.nextLine();

                if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println("Invalid Input. Please type 'yes' or 'no'.");
            }

            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("You won: " + win + " times, You lost: " + loss + " times, You tied: " + tie + " times");
                System.out.print("Thank you for playing! Goodbye!");
                break;
            }
        }
        scan.close();
    }
}