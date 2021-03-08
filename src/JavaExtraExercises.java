//import java.util.Scanner;
//public class JavaExtraExercises {
//    public static void main(String[] args) {
//
//        System.out.println(firstChar("table"));
//        System.out.println(secondChar("table"));
//        System.out.println(lastChar("table"));
//        System.out.println(secondToLastChar("table"));
//        System.out.println(userWantsToContinue("yes"));
//        System.out.println(isEven(2));
//        System.out.println(isOdd(2));
//        countOdds(1,2,3,4,5);
//
//    }
//
//    //TO DO: Write a method named firstChar() that takes a string as an input/parameter and returns the first letter as a character data type.
//    public static char firstChar(String input) {
//        return input.charAt(0);
//    }
//
//
//    //TO DO: Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
//    public static char secondChar(String input) {
//        return input.charAt(1);
//
//
//    }
//
//
//    // TO DO: Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
//    public static char lastChar(String input) {
//        return input.charAt(input.length()-1);
//
//
//    }
//
//    // TO DO: Write a method nameD secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
//    public static char secondToLastChar(String input) {
//        return input.charAt(input.length()-2);
//
//
//    }
//
//    // TO DO: Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
//
//
//    public static boolean userWantsToContinue(Boolean input) {
//        Scanner sc = new Scanner(System.in);
//        boolean Yes = Boolean.parseBoolean(sc.next());
//        return Yes;
//    }
//
//
//    //TO DO: Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
//
//    public static boolean isEven(Integer i) {
//        return (i % 2 == 0);
//    }
//
//    //TO DO: Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
//
//    public static boolean isOdd(Integer i) {
//        return (i % 2 != 0);
//
//    }
//
//    //TO DO: Write a method named  countOdds(start, end)that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
//    public  int countOdds(int[] data) {
//
//        int countOdd = 0;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] % 2 == 1)
//                countOdd++;
//        }
//
//        return countOdd;
//    }
//
//
//    }
//
//
//
//
//
