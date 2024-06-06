package chars;

public class Words {

    public String pushWord(String word) {
        char[] chars = word.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = (char) (chars[i] + 1);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Words words = new Words();
        System.out.println(words.pushWord("alma"));
    }


}
