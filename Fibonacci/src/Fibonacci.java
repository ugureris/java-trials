import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaç terimini görmek istersiniz? ");
        int n = input.nextInt();

        fibonacci(n);
    }

    public static BigInteger fibonacci(int n) {
        BigInteger n1 = BigInteger.valueOf(0);
        BigInteger n2 = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        System.out.println("Fibonacci serisinin ilk " + n + " terimi: ");
        System.out.print("0 1");
        for (int i = 1; i <= n; i++) {
            sum = n1.add(n2);
            n1 = n2;
            n2 = sum;
            System.out.print(" " + sum);
        }
        return sum;
    }
}
