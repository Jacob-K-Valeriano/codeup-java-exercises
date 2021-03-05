import java.util.stream.IntStream;
import java.util.Scanner;
import static java.lang.Float.parseFloat;
import java.lang.Math;

public class ControlFlowExercises {
    public static void main(String[] args) {

//  WHILE LOOP

//        int i = 5;
//
//        // test expression
//        while (i  <= 15) {
//            System.out.println(i);
//
//            // update expression
//            i++;

// REFACTORED USING FOR LOOP

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }


//  DO WHILE LOOP
//
//
//            int i = 0;
//            do {
//                System.out.println(i * 2);
//                i++;
//            }
//            while (i * 2 <= 100);


//  BACKWARDS BY 5'S FROM 100 TO -10
//
//        int i = 100;
//        do{
//            System.out.println( i );
//                  i = i - 5;
//        } while(i > -10);


// DO WHILE THAT STARTS AT 2 AND DISPLAYS THE NUMBER SQUARED WHILE THE NUMBER IS LESS THAN A MILL

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        } while(i <= 1000000);


//  REFACTORED USING FOR LOOP

//        for (int i = 0; i * 2 <= 100; i++) {
//            System.out.println(i * 2);
//        }


//  FIZZBUZZ TEST


//        IntStream.rangeClosed(1, 100)
//                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
//                .forEach(System.out::println);

//  DISPLAY A TABLE OF POWERS.

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to go up to");
//        int userInput = sc.nextInt();
//
//                  for(int i = 1; i <= userInput; i++){
//                System.out.printf("%-6d", i);
//                System.out.print(" | ");
//
//                System.out.printf("%-7d", i*i);
//                System.out.print(" | ");
//
//                System.out.print(i*i*i);
//
//                System.out.println();
//            }

//  CONVERT INTO GRADE


        do {
            System.out.println("Would you like to enter another grade? Y/N");
            String enterMore = sc.next();
            if (enterMore.equals("N")) {
                break;
            } else {
                System.out.println("Enter a number grade");
                int numberGrade = sc.nextInt();

                if (numberGrade <= 59) {
                    System.out.println("F");
                } else if (
                        numberGrade <= 66 && numberGrade >= 60) {
                    System.out.println("D");
                } else if (
                        numberGrade <= 79 && numberGrade >= 67) {
                    System.out.println("C");
                } else if (
                        numberGrade <= 87 && numberGrade >= 80) {
                    System.out.println("B");
                } else if (
                        numberGrade >= 88) {
                    System.out.println("A");
                }
            }
        }
        while (true);
    }
    }










