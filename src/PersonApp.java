public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("Agung", "Marga");
//        person1.name="Agung";
//        person1.address="Marga";
        //person1.country="Bali";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Johan");


        Person person2 = new Person("Made");
        Person person3 = new Person();
        person3.name="Wayan";
        person3.sayHello("Mike");


    }
}
