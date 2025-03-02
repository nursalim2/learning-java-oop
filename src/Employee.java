public class Employee {
    String name;
    String company;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, String company) {
        this(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", my name is Employee " + this.name);
    }
}
