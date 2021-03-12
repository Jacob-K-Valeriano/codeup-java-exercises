package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner.nextLine();
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo(String yesOrNo) {
        System.out.println("Answer, yes or no.");
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("yes");

    }

    public int getInt(int min, int max) {
        while(true) {
            System.out.printf("Enter a number between %d and %d.", min, max);

            String input = scanner.nextLine();
            int userInput = Integer.parseInt(input);
            if (userInput >= min && userInput<= max)
                return userInput;
        }
    }

//    public int getInt() {
//        System.out.println("Choose a number, any number");
//            int number;
//            try {
//                number = Integer.parseInt(getString());
//                return number;
//            } catch (numFormat e) {
//                System.out.println("Re do");
//
//            }
//            return getInt();
//    }
//
}
