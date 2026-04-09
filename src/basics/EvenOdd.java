package basics;

public class EvenOdd {

    public static String check(int n) {
        if (n % 2 == 0) return "Even";
        return "Odd";
    }

    public static void main(String[] args) {
        System.out.print(check(4));
        System.out.print(check(7));
        System.out.print(check(0));
    }
}
