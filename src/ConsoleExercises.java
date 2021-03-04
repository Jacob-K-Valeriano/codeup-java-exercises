import java.util.Scanner;
import static java.lang.Float.parseFloat;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.print("the value of pi = " + pi);


        Scanner sc = new Scanner(System.in);
//        System.out.print("What was one of Kobe's numbers?");
//        int kobesNumber = sc.nextInt();
//        System.out.print(kobesNumber);

//        System.out.print("Enter 3 words");
//
//            String firstWord= sc.next();
//            String secondWord = sc.next();
//            String thirdWord = sc.next();
//
//            System.out.println(firstWord);
//            System.out.println(secondWord);
//            System.out.println(thirdWord);

        // SENTENCE WILL NOT DISPLACE WITH .NEXT() METHOD

//              System.out.print("Enter your favorite quote");
//              String mySentence = sc.nextLine();
//              System.out.println(mySentence);

        System.out.println("Enter the length and width of the classroom");
        System.out.println("Length = ");
        String lengthInput = sc.nextLine();
        System.out.print("Width = ");
        String widthInput = sc.nextLine();
        float length = parseFloat(lengthInput);
        float width = parseFloat(widthInput);
        float perimeter = (2 * length) + (2 * width);
        System.out.print("The perimeter is " + perimeter);



    }
}
