package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        System.out.println(prefix);

        String name = "John Doe";
        System.out.println(name);

        String message = prefix + name;
        System.out.println(message);

        message = message + 444;
        System.out.println(message);

        boolean b = "Hello John Doe".equals(message);
        System.out.println(b);

        boolean c = "Hello John Doe444".equals(message);
        System.out.println(c);

        String empty1 = "";
        String empty2 = "";
        String concatedString = empty1 + empty2;
        System.out.println(concatedString);
        System.out.println(concatedString.length());

        String abc = "Abcde";
        System.out.println(abc.length());
        System.out.println(abc.substring(0,1)+", " + abc.substring(2,3));
        System.out.println(abc.substring(0,3));

    }
}
