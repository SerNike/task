import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.next();
        String n = scanner.next();
        String o = scanner.next();
        String wu = f + n + o;
        String[] wuw = {wu};
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int g = scanner.nextInt();
        int w = d / 10 + d % 10;
        int q = m / 10 + m % 10;
        for (String input : wuw) {
            int qwer = replaceDuplicatesWithTemplate(input).length();
            int G = qwer + (w + q) * 64 + (f.charAt(0) - 'A' + 1) * 256;
            String x = Integer.toHexString(G).toUpperCase();
            if (x.length() >= 3) {
                System.out.println(x.substring(x.length() - 3));
            }
            if (x.length() < 3) {
                System.out.println(x);
            }
        }
    }
    public static String replaceDuplicatesWithTemplate(String wuw) {
        if (wuw == null || wuw.length() < 2) {
            return wuw;
        }
        int position = 1;
        char[] characters = wuw.toCharArray();
        for (int i = 1; i < wuw.length(); i++) {
            int j;
            for (j = 0; j < position; ++j) {
                if (characters[i] == characters[j]) {
                    break;
                }
            }
            if (j == position) {
                characters[position] = characters[i];
                ++position;
            } else {
                characters[position] = 0;
                ++position;
            }
        }
        return getStringWithoutDuplicates(characters);
    }
    public static String getStringWithoutDuplicates(char[] inputChars) {
        StringBuilder stringBuilder = new StringBuilder(inputChars.length);
        for (char character : inputChars) {
            if (character != 0) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
