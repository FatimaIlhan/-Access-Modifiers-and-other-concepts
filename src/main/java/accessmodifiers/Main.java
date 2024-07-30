package accessmodifiers;

public class Main {
    public static  void  main(String[]args){
        Person person = new Person();
        System.out.println("Name:" + person.name);
        System.out.println("Age:" + person.age);
        System.out.println("Addresses:" + person.address);
        //System.out.println("SSN:" + person.ssn);

        //Static Modifier
        Counter.Increment();
        System.out.println("Count" + Counter.count);
    }
}
