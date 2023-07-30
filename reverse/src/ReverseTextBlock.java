public class ReverseTextBlock {
    public static void main(String[] args) {
        String textBlock= """ 
                        Ağlamak Meselesi
                Nasıl etmeli de ağlayabilmeli
                farkına bile varmadan?
                Nasıl etmeli de ağlayabilmeli
                ayıpsız,
                aşikare,
                yağmur misali?
                """;

        System.out.println(turnDown(textBlock));

    }
    public static String turnDown(String textBlock){
        String reverse="";
        for (int i=textBlock.length()-1;i>=0;i--){
            reverse=reverse+textBlock.charAt(i);
        }




        return reverse;
    }
}
