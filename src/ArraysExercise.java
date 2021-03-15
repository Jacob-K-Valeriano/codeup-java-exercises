
import java.util.Arrays;

public class ArraysExercise {
   public static void main(String[] args) {
       int[] numbers = {1, 2, 3, 4, 5};
       System.out.println(Arrays.toString(numbers));

       Person[] people = new Person[1];


       people [0] = new Person ("Jacob");
       people [1] = new Person ("Edward");
       people [2] = new Person ("Patrick");


       for (int i = 0; i < people.length; i++) {
           System.out.println(people[i].getName());
       }

       people = addPerson(people, new Person("Plankton"));

       for(Person person : people) {
           System.out.println("Using enhanced for: " + person.getName());
       }

    }
        public static  Person[] addPerson(Person[] people, Person person)
        {
            Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

            newPeopleArray[newPeopleArray.length - 1] = person;

            return newPeopleArray;
        }
}
