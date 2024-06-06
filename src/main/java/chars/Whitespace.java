package chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                result[i] = '*';
            } else result[i] = chars[i];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("alma barack cseresznye"));
    }
}
