package StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String str_obj  = "Hello world";
        String Substring = str_obj.substring(6,11);
        String replace = str_obj.replace("world", "Java");
        System.out.println(str_obj.length());
        System.out.println(str_obj.toUpperCase());
        System.out.println(str_obj.toLowerCase());
        System.out.println(Substring);
        System.out.println(replace);

    }
}
