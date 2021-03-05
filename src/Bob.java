import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner userInput  = new Scanner(System.in);
        Boolean conversation = true;
        System.out.println("Meet bob, a lackadaisical teenager who needs a friend to talk to.");

        do {
            System.out.println("Say something to Bob:");
            String response = userInput.nextLine();

            if (response.endsWith("?")) {
                System.out.println("Uhhhhh, " + response);

            } else if (response.endsWith("!")) {
                System.out.println("Whoa, take a chill pill!");

            } else if (response.isEmpty()) {
                System.out.println("Fine. Be that way!");

            } else {
                System.out.println("Whatever duuuuude.");
            }

        } while (conversation);
    }
}