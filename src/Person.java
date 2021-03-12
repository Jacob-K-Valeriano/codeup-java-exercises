public class Person {
    private String name;
    private String age;
    private String bday;


// ======== CONSTRUCTORS ============
public Person (String personsName){
    this.name = personsName;

}

public Person (String personsName, String personsAge){
    this.name = personsName;
    this.age = personsAge;
}

public Person (String personsName, String personsAge, String personsBday){
        this.name = personsName;
        this.age = personsAge;
        this.bday = personsBday;
}





    //TODO: return the person's name
    public String getName(){
        return this.name;
    }

    //TODO: change the name property to the passed value
    public String setName(String name){
        return this.name = name;

    }

    //TODO: print a message to the console using the person's name
    public String sayHello(){
        return String.format("Why hello, my name is " + name);

    }


    public static void main(String[] args) {
    Person p1 = new Person("Jacob", "105", "Oct 3");
    Person p2 = new Person("Shrek", "856", "Nov 30");


    System.out.println(p1.getName());
    System.out.println(p2.getName());
    System.out.println(p1.sayHello());
    System.out.println(p2.sayHello());
    p2.setName("Rico Suave");
    System.out.println(p2.sayHello());



//CURRICULUM EXAMPLES

    Person person1 = new Person("John");
    Person person2 = new Person("John");
    System.out.println(person1.getName().equals(person2.getName()));
    System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }





}
