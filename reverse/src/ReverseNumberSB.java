import java.util.Scanner;

public class ReverseNumberSB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        String number = input.nextLine();

        StringBuilder sb = new StringBuilder(number);
        System.out.println(sb.reverse());

    }
}
