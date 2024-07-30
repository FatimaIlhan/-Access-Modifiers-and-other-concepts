package StringClass;

public class Immutability {
    public static void main(String[] args) {
        String h1 = "Hello world";

        String uppercase = h1.toUpperCase();

        System.out.println("original string:" + h1);
        System.out.println("Modified String" + uppercase);
    }
}
