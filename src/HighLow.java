import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.println(checkGuess(35,35));

    }

    public static void playGame(Scanner scanner) {
        System.out.println("Please guess a number between 1 and 100:");
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess = scanner.nextInt();

        if (userGuess < 1 || userGuess > 100) {
            System.out.println("Your guess is out of bounds. Please try again");
        } else {
            String response = checkGuess(userGuess, randomNumber);
            if (response.equals("You guessed the correct number!")) {
                System.out.print(response);
                return;
            } else {
                playGame(scanner);
            }

        }
    }

    public static String checkGuess(int guess, int targetNum){
        if(guess == targetNum){
            return "You guessed the correct number!";
        }else if (guess > targetNum){
            return "Lower, pls";

        }else if(guess < targetNum){
            return  "Higher, pls";
        }



        return "idk bro";

    }




}
