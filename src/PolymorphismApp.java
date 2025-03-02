public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Nursalim");
        employee.sayHello("Doni");

        employee = new Manager("Santi");
        employee.sayHello("Doni");

        employee = new VicePresident("Ratih");
        employee.sayHello("Doni");

        sayHello(new Employee("Nani"));
        sayHello(new Manager("Nina"));
        sayHello(new VicePresident("Nano"));


    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("Welcome VP " + vp.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Welcome Manager " + manager.name);
        } else {
            System.out.println("Welcome Employee " + employee.name);
        }

    }
}
