public class Printer {
    // A method for printing information about a person
    public void printPerson(Person person) {
        if (person != null) {
            System.out.printf("Name: %s age: %d\n", person.getName(), person.getAge());
        } else {
            System.out.println("Person not found");
        }
    }
}
