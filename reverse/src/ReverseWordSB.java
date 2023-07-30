import java.util.Scanner;

public class ReverseWordSB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kelime girin: ");
        String word = input.nextLine();

        StringBuilder sb=new StringBuilder(word);
        System.out.println(sb.reverse());

    }
}
