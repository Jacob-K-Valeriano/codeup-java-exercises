import java.util.*;
public class AdditionalExercises {

    public static boolean count_nums_not_7(int num) {
        return false;
    }

    public static int convert(int n) {
        int absvalue = (n >= 0) ? n : -n;
        return absvalue;
    }

    class solution {
        int count_nums_not_7(int num) {
            if (num < 7)
                return num;
            if (num >= 7 && num < 10)
                return num - 1;

            int r = 1;
            while (num / r > 9)
                r = r * 10;

            int m = num / r;

            if (m != 7)
                return count_nums_not_7(m) * count_nums_not_7(r - 1) + count_nums_not_7(m) + count_nums_not_7(num % r);
            else
                return count_nums_not_7(m * r - 1);
        }
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int x = in.nextInt();
        System.out.printf("The absolute value of %d is: %d", x, convert(x));
        System.out.print("\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scan.nextInt();
        if (num > 0)
            System.out.println("Count the numbers without digit 7, from 1 to " + num + ": " );
        System.out.println(count_nums_not_7(num));
    }


}