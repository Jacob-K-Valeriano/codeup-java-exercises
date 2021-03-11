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
    public void setName(String name){
        return this.name = name;
    }

    //TODO: print a message to the console using the person's name
    public void sayHello(){
        return String.format("Why hello, my name is " + name);

    }


    public static void main(String[] args) {

    }
}
