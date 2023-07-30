import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        String number = input.nextLine();

        System.out.println(turnDown(number));


    }

    public static String turnDown(String number){
        String[] pieces=new String[number.length()];

        for (int i = 0; i < number.length(); i++) {
            pieces[i] = number.substring(i, i + 1);
        }

        String reverse = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            reverse += pieces[i];
        }
        return reverse;
    }
}
