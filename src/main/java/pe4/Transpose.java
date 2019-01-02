package pe4;

public class Transpose {

    public static String setStringVar(String str) {
        String words[] = str.split(" ");

        String reverse_string = " ";

        String str1 = " ";

        for (int i = 0; i < words.length; i++) {
            String wd = words[i];

            String reverse_word = " ";

            for (int k = wd.length() - 1; k >= 0; k--) {
                reverse_word = reverse_word + wd.charAt(k);
            }
            reverse_string = reverse_string + reverse_word.trim() + " ";
            str1 = reverse_string.trim();
        }
        return str1;
    }
}