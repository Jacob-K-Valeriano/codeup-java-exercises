import java.util.stream.IntStream;
import java.util.Scanner;
import static java.lang.Float.parseFloat;


public class ControlFlowExercises {
    public static void main(String[] args) {

//  WHILE LOOP

//        int i = 5;
//
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//
//        }
// REFACTORED USING FOR LOOP

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }


//  DO WHILE LOOP
//
//
//        int i = 0;
//        do {
//            System.out.println(i * 2);
//            i++;
//        }
//        while (i * 2 <= 100);


//  BACKWARDS BY 5'S FROM 100 TO -10

//        int i = 100;
//        do{
//            System.out.println( i );
//                  i = i - 5;
//        } while(i >= -10);


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
//                .mapToObj(i -> i % 3 == 0
//                        ? (i % 5 == 0 ? "FizzBuzz" : "Fizz")
//                        : (i % 5 == 0 ? "Buzz" : i))
//                .forEach(System.out::println);

//  DISPLAY A TABLE OF POWERS.

//        Scanner sc = new Scanner(System.in);
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


//        do {
//            System.out.println("Would you like to enter another grade? Y/N");
//            String enterMore = sc.next();
//            if (enterMore.equals("N")) {
//                break;
//            } else {
//                System.out.println("Enter a number grade");
//                int numberGrade = sc.nextInt();
//
//                if (numberGrade <= 59) {
//                    System.out.println("F");
//                } else if (
//                        numberGrade <= 66 && numberGrade >= 60) {
//                    System.out.println("D");
//                } else if (
//                        numberGrade <= 79 && numberGrade >= 67) {
//                    System.out.println("C");
//                } else if (
//                        numberGrade <= 87 && numberGrade >= 80) {
//                    System.out.println("B");
//                } else if (
//                        numberGrade >= 88) {
//                    System.out.println("A");
//                }
//            }
//        }
//        while (true);


//        # Java Control Structures and Loops Bonuses
//
//### Simple Chat Bot
//
//        Be creative in communicating with your
//        user different options and for given scenerios. Create at least three phases of the chat, for example...
//
//        "How are you?" (AI says)
//			           |                              |
//        good                        bad (user types)
//
//        "Awesome! Are you super happy?" 	    "Will cake make you better?"
//
//        yes          no                     yes             no
//
//        Keep the chat options relatively simple and plan it out clearly before coding it.


//    System.out.println("AI: Hello friend, what is your name?");
//    String myName = sc.next();
//    System.out.println("AI: " + myName + "! What an amazing name, you must be very handsome!");
//    System.out.println("AI: How are you?");
//    System.out.println("Enter (sad/happy)");
//    String myFeeling = sc.next();


//### Hangman Game
//
//        - prompt a player 1 to enter a word for player 2 to guess
//        - track the number of guesses by player 2
//                - display to the user the partially completed word as they guess letters correctly
//        - string methods from the next lesson will be helpful for this bonus
//

        }
    }










