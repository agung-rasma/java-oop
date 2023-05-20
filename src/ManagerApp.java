public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Agung");
//        manager.name = "Agung";
        manager.sayHello("Boy");

        VicePresident vicePresident = new VicePresident("Wayan Balik");
//        vicePresident.name="Wayan Balik";
        vicePresident.sayHello("Ketut Dalam Proses");
    }
}
