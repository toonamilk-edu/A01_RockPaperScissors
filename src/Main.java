import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String PlayerAMove;
        String PlayerBMove;
        String PlayAgain;
        boolean done;

        do {
            done = false;
            do {
                System.out.print("Player A, enter your move (R, P, or S): ");
                PlayerAMove = scanner.nextLine();

                if (PlayerAMove.equalsIgnoreCase("R")) {
                    done = true;
                } else if (PlayerAMove.equalsIgnoreCase("P")) {
                    done = true;
                } else if (PlayerAMove.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println(PlayerAMove + " is not R, P, or S. Try again.");
                }
            } while (!done);

            done = false;
            do {
                System.out.print("Player B, enter your move (R, P, or S): ");
                PlayerBMove = scanner.nextLine();

                if (PlayerBMove.equalsIgnoreCase("R")) {
                    done = true;
                } else if (PlayerBMove.equalsIgnoreCase("P")) {
                    done = true;
                } else if (PlayerBMove.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println(PlayerBMove + " is not R, P, or S. Try again.");
                }
            } while (!done);

            if (PlayerAMove.equalsIgnoreCase("R") && PlayerBMove.equalsIgnoreCase("R")) {
                System.out.println("Rock vs Rock it's a Tie!");
            } else if (PlayerAMove.equalsIgnoreCase("R") && PlayerBMove.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock. Player B wins!");
            } else if (PlayerAMove.equalsIgnoreCase("R") && PlayerBMove.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors. Player A wins!");
            } else if (PlayerAMove.equalsIgnoreCase("P") && PlayerBMove.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock. Player A wins!");
            } else if (PlayerAMove.equalsIgnoreCase("P") && PlayerBMove.equalsIgnoreCase("P")) {
                System.out.println("Paper vs Paper it's a Tie!");
            } else if (PlayerAMove.equalsIgnoreCase("P") && PlayerBMove.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts Paper. Player B wins!");
            } else if (PlayerAMove.equalsIgnoreCase("S") && PlayerBMove.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks Scissors. Player B wins!");
            } else if (PlayerAMove.equalsIgnoreCase("S") && PlayerBMove.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper. Player A wins!");
            } else if (PlayerAMove.equalsIgnoreCase("S") && PlayerBMove.equalsIgnoreCase("S")) {
                System.out.println("Scissors vs Scissors it's a Tie!");
            }

            System.out.print("Play again? [Y/N]: ");
            PlayAgain = scanner.nextLine();
            System.out.println();
        } while (PlayAgain.equalsIgnoreCase("Y"));

        System.out.println("Adios!");
    }
}