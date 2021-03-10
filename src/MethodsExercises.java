import java.util.Scanner;
import java.lang.Math;
public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(1, 0));
//        System.out.println(subtraction(10, 8));
//        System.out.println(multiplication(3, 1));
//        System.out.println(division(12, 3));
//        System.out.println(multiplyLoop(1, 5));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial(1));
//
//
//
//
    }
//
//    public static int addition(int num1, int numb2) {
//        return num1 + numb2;
//    }
//
//    public static int subtraction(int num1, int numb2) {
//        return num1 - numb2;
//    }
//
//    public static int multiplication(int num1, int numb2) {
//        return num1 * numb2;
//
//    }
//
//    //BONUS
//
//    public static int multiplyLoop(int num1, int num2){
//        int multiplied = 0;
//        do {
//            multiplied += num1;
//                    num2--;
//
//        } while (num2 != 0);
//        return multiplied;
//    }
//
//
//    public static int division(int num1, int numb2) {
//        return num1 / numb2;
//    }
//
//    public static int getInteger(int min, int max) {
//        Scanner oneToTen = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 10: ");
//
//        int userInput = Integer.parseInt(oneToTen.nextLine());
//        if (userInput >= min && userInput <= max) {
//            System.out.println("Your number is " + userInput );
//            return userInput;
//        } else {
//            System.out.println("Sorry, bud.");
//            return getInteger(min, max);
//        }
//    }
//
//    public static int factorial(int number) {
//        Scanner oneMoreTime = new Scanner(System.in);
//        int userInput = getInteger(1,10);
//        int fact = 1;
//        System.out.println("Do you want to continue? Enter y/n ");
//        String userContinue = oneMoreTime.nextLine();
//        if (userContinue.contains("y")) {
//            for (int i = 2; i <= userInput; i++) {
//                fact = fact * i;
//                System.out.println(i);
//            }
//            return fact;
//        }
//        return userInput;
//    }
//
//    public static long cont(int userCont) {
//        Scanner yesOrNo = new Scanner(System.in);
//        System.out.println("Do you want to do another number?");
//        String userAnswer = yesOrNo.nextLine();
//        do {
//            return factorial(0);
//        } while(userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));
//    }
//
//    public static int getDiceInt(int min, int max) {
//        System.out.println("How many sides are on the dice?");
//        Scanner range = new Scanner(System.in);
//        int input = range.nextInt();
//        if (input > max || input < min) {
//            return getDiceInt(min, max);
//        } else {
//            return input;
//        }
//    }
//    public static void dice (){
//        int sidesNum = getDiceInt(1,24);
//        Scanner numberOnDie = new Scanner(System.in);
//        System.out.println("Roll the dice? yes/no");
//        if (numberOnDie.nextLine().equalsIgnoreCase("yes")) {
//            dice(sidesNum);
//        } else {
//            System.out.println("Better luck next time");
//        }
//    }
//    public static void dice(int num){
//        int min = 1;
//        int max = num + 1;
//        int d1 = (int) (Math.random() * (max - min + 1) + min);
//        int d2 = (int) (Math.random() * (max - min + 1) + min);
//        System.out.printf("You rolled a %d and a %d !\n", d1, d2);
//        System.out.println("Would you like to roll again? yes/no");
//        Scanner response = new Scanner(System.in);
//        if (response.nextLine().equalsIgnoreCase("yes")) {
//            dice(num);
//        } else {
//            System.out.println("Thank you , come again.");
//        }
//    }

}





