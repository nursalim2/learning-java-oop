class Cat {
    String name;
    String color;

    Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void sayHello() {
        this.sayHello("Bos");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}
