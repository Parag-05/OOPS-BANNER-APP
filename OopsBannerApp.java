import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp {

    public static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });

        map.put('S', new String[]{
                "  *****  ",
                " **   ** ",
                " **      ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        });

        map.put(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });

        return map;
    }

    public static void printMessage(String message, Map<Character, String[]> map) {

        int rows = 7;

        for (int row = 0; row < rows; row++) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = Character.toUpperCase(message.charAt(i));
                String[] pattern = map.getOrDefault(ch, map.get(' '));

                sb.append(pattern[row]);

                if (i < message.length() - 1) {
                    sb.append(" ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> charMap = createCharacterPatternMap();
        String message = "OOPS";

        printMessage(message, charMap);
    }
}