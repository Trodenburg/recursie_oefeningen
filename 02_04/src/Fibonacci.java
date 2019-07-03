import java.util.Scanner;

public class Fibonacci {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hoeveel getallen moet ik uitprinten?");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
