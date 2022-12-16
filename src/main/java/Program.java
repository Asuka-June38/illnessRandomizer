import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program {
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

        System.out.println(ResponseProvider.Get(line));
    }
}
