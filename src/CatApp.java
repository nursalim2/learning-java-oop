public class CatApp {
    // variable shadowing
    public static void main(String[] args) {
        var cat = new Cat("Catty", "Orange");
        System.out.println(cat.name);
        System.out.println(cat.color);

        cat.sayHello("Bunny");
        cat.sayHello();

    }
}
