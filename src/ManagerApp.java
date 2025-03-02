public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Nursalim");
//        manager.name = "Nursalim";
        manager.sayHello("Ana");

        var vp = new VicePresident("Nani");
//        vp.name = "Nani";
        vp.sayHello("Ana");
    }
}
