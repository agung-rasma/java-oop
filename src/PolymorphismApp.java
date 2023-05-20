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
        String jabatan = "Employee";
        String name = employee.name;
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            jabatan = "VP";
            name = vicePresident.name;
        } else if (employee instanceof Manager) {
            Manager manager= (Manager) employee;
            jabatan = "Manager";
            name = manager.name;
        }
        System.out.println("WassUpss... " + jabatan + " " + name);
    }
}
