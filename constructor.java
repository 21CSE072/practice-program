public class Main {
    public Main() {
        System.out.println("No arguments constructor");
    }
    public Main(String message) {
        System.out.println("Default constructor " + message);
    }
    public Main(int value) {
        System.out.println("Parameterized constructor " + value);
    }
    public Main(String name, int age) {
        System.out.println("Parameterized constructor with two parameters " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main("Hi, Hello");
        Main obj3 = new Main(72); 
        Main obj4 = new Main("iniya", 15);
    }
}
