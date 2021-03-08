import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(1, 0));
        System.out.println(subtraction(10, 8));
        System.out.println(multiplication(3, 1));
        System.out.println(division(12, 3));
        System.out.println(multiplyLoop(1, 5));
//        System.out.println(getInteger(1, 10));
        System.out.println(factorial(1));




    }

    public static int addition(int num1, int numb2) {
        return num1 + numb2;
    }

    public static int subtraction(int num1, int numb2) {
        return num1 - numb2;
    }

    public static int multiplication(int num1, int numb2) {
        return num1 * numb2;

    }

    //BONUS

    public static int multiplyLoop(int num1, int num2){
        int multiplied = 0;
        do {
            multiplied += num1;
                    num2--;

        } while (num2 != 0);
        return multiplied;
    }


    public static int division(int num1, int numb2) {
        return num1 / numb2;
    }

    public static int getInteger(int min, int max) {
        Scanner oneToTen = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");

        int userInput = Integer.parseInt(oneToTen.nextLine());
        if (userInput >= min && userInput <= max) {
            System.out.println("Your number is " + userInput );
            return userInput;
        } else {
            System.out.println("Sorry, bud.");
            return getInteger(min, max);
        }
    }

    public static int factorial(int number) {
        Scanner oneMoreTime = new Scanner(System.in);
        int userInput = getInteger(1,10);
        int fact = 1;
        System.out.println("Do you want to continue? Enter y/n ");
        String userContinue = oneMoreTime.nextLine();
        if (userContinue.contains("y")) {
            for (int i = 2; i <= userInput; i++) {
                fact = fact * i;
                System.out.println(i);
            }
            return fact;
        }
        return userInput;
    }

//    public static long cont(int userCont) {
//        Scanner yesOrNo = new Scanner(System.in);
//        System.out.println("Do you want to do another number?");
//        String userAnswer = yesOrNo.nextLine();
//        do {
//            return factorial(0);
//        } while(userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));
//    }




}





