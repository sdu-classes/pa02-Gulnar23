public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Panda");
        System.out.println(a);
        Mammal m = new Mammal("Tom");
        System.out.println(m);
        Cat c = new Cat("Spike");
        System.out.println(c);
        c.greets();
        Dog d = new Dog("Jerry");
        System.out.println(d);
        d.greets();
        d.greets1();
    }
}