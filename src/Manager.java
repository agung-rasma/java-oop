class Manager extends Employee {
    //    String name;
    String company;

    Manager(String name) {
        super(name);
//        this.name = name;
    }

    Manager(String name, String company) {
        super(name);
//        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + " My Name Is Manager " + this.name);
    }
}
