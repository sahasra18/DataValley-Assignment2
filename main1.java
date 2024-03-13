public class main1 {
    public static void main(String[] args) {
        String text = "type here to search";
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && i % 2 != 0) {
                System.out.print(text.charAt(i));
            }
        }
    }
}

