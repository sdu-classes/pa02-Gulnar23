public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gulnar","SDU");
        System.out.println(person);
        Student student = new Student("Zhuldyz", "SDU", "IR", 2022, 350000.0);
        System.out.println(student);
        Staff staff = new Staff("Aisha", "Almaty", "SDU", 500000.0);
        System.out.println(staff);
    }
}