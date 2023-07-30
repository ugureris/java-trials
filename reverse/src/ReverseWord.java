import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kelime girin: ");
        String word = input.nextLine();
        System.out.println(turnDown(word));


    }

    public static String turnDown(String word){
        String[] pieces = new String[word.length()];
        String reverse = "";


        for (int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }


//        for (int i = 0; i < word.length(); i++) {
//            pieces[i] = word.substring(i, i + 1);
//        }
//
//
//
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reverse += pieces[i];
//        }

    return reverse;
    }
}
