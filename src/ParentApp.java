public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Nursalim";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.name = "Monic";
        parent.doIt();
        System.out.println(parent.name);

    }
}
