public class PersonApp {
    public static void main(String[] args) {
        // create an object
        var person1 = new Person();
        person1.name = "Nursalim";
        person1.address = "Jakarta";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Ana Fauziah");

        Person person2 = new Person("Nani Indriyani","Jakarta");
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        person2.sayHello("Ziah");

        Person person3;
        person3 = new Person();
    }
}
