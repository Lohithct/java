import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i += 2)
        {
            sum += i;
        }

        System.out.println("The sum of even numbers up to " + n + " is: " + sum);

        scanner.close();
    }
}

