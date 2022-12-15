import java.util.NoSuchElementException;
import java.util.Scanner;

public class areYouIllToday {
    static String line = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Are you ill today? y/n");
            line = scanner.nextLine();
            System.out.printf("Your input was: %s%n", line);
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println("There is an error");
        }
        if (line.equals("y")) {
            System.out.println("Take rest!");
        }
        else if (line.equals("n")) {
            System.out.println("Go back to work!");
        }
        else {
            System.out.println("Your answer is unreadable. Are you ok?");
        }
    }
}
