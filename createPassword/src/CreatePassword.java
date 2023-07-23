import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CreatePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Şifre uzunluğu? ");
        int passwordLength = input.nextInt();

        System.out.print("Şifrenizde büyük harf olsun mu?(e/h) ");
        boolean isUpperCase = input.next().equals("e");

        System.out.print("Şifrenizde küçük harf olsun mu?(e/h) ");
        boolean isLowerCase = input.next().equals("e");

        System.out.print("Şifrenizde sayı olsun mu?(e/h) ");
        boolean isNumber = input.next().equals("e");

        System.out.print("Şifrenizde karakter olsun mu?(e/h) ");
        boolean isSymbol = input.next().equals("e");

        String password = createPassword(passwordLength, isUpperCase, isLowerCase, isNumber, isSymbol);

        while (true) {
            System.out.print("Şifreyi beğendiniz mi?(e/h) ");
            boolean isLike = input.next().equals("e");
            if (isLike == false) {
                password = createPassword(passwordLength, isUpperCase, isLowerCase, isNumber, isSymbol);
            } else {
                break;
            }
        }
        savePassword(password);

    }

    public static String createPassword(int passwordLength, boolean isUpperCase, boolean isLowerCase, boolean isNumber, boolean isSymbol) {
        Random random = new Random();
        String upperCase = "ABCDEFGHIJKLMNOPRSTUVYZ";
        String lowerCase = "abcçdefgğhıijklmnoöprsştuüvyz";
        String number = "0123456789";
        String symbol = "!^+%&/()=?_-*}][{$#";

        String x = "";
        if (isUpperCase) {
            x += upperCase;
        }
        if (isLowerCase) {
            x += lowerCase;
        }
        if (isNumber) {
            x += number;
        }
        if (isSymbol) {
            x += symbol;
        }
        String password = "";

        for (int i = 0; i <= passwordLength; i++) {
            int randomIndex = random.nextInt(x.length());
            password += x.charAt(randomIndex);
        }
        System.out.println("Oluşturulan şifre: " + password);

        return password;
    }

    public static void savePassword(String password) {
        try {
            FileWriter writer = new FileWriter("password.txt", true);
            writer.write(password + "\n");
            writer.close();
            System.out.println("Şifre kaydedildi.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
