public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Agung");
        employee.sayHello("Wayan Balik");

        employee = new Manager("Agung");
        employee.sayHello("Wayan Balik");

        employee = new VicePresident("Agung");
        employee.sayHello("Wayan Balik");

        System.out.println();

        sayHello(new Employee("Agung"));
        sayHello(new Manager("Wijaya"));
        sayHello(new VicePresident("Rasma"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
//        employee.sayHello(employee.name);
    }
}
