class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("Woof");
    }
    public void greets1() {
        System.out.println("Wooooof");
    }
    public String toString() {
        return "Dog[Mammal[Animal[name = " + name + "]]]";
    }
}
