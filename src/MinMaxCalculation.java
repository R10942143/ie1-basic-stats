import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        scanner.close();

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
