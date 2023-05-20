class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }

    //atau
//    VicePresident(String name){
//        super(name, null);
//    }
//    method overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + " My Name Is VP " + this.name);
    }
}
