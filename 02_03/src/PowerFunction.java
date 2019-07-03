import java.util.Scanner;

public class PowerFunction {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Voer het grondgetal en exponent in");
        double number = scanner.nextDouble();
        int exp = scanner.nextInt();
        System.out.println(power(number, exp));
    }

    private static double power(double x, int n) {
        double y;
        if (n == 0) {
            return 1.0;
        }
        y = power(x, n/2);
        y = y * y;
        if (n%2 == 0) {
            return y;
        }
        return x * y;
    }
    
}
