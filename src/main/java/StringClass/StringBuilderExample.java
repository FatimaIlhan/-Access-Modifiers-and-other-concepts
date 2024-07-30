package StringClass;

public class StringBuilderExample {
    public static void main(String[] args) {
    StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb1.toString().equals(sb2.toString()));
    sb1.append(sb2);
        System.out.println("" + sb1);
        System.out.println(sb1.reverse());
    }
}
