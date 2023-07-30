public class ReverseTextBlockSB {
    public static void main(String[] args) {
        String textBlock = """
                        Ağlamak Meselesi
                Nasıl etmeli de ağlayabilmeli
                farkına bile varmadan?
                Nasıl etmeli de ağlayabilmeli
                ayıpsız,
                aşikare,
                yağmur misali?
                """;

        StringBuilder sb = new StringBuilder(textBlock);
        System.out.println(sb.reverse());
    }
}
