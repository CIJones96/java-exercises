package basics;

public class StringReverser {

    public static String reverse(String string) {
        return new StringBuffer(string).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(reverse("Chris"));
        System.out.println(reverse("Python"));
    }
}
