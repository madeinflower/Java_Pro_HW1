public class Example02 {

    public static void main(String[] args) {
        // Person object creation
        Person person1 = new Person("John Dou", 17);

        // Creating a repository with a maximum capacity of 10 stored people
        Repository repo = new Repository(10);

        // Adding people to the repository
        repo.append("Name 1", 22);
        repo.append(person1);
        repo.append("Name 2", 23);

        // Receiving a person by ID and printing their data
        Person person = repo.getPersonById(1);

        Printer printer = new Printer();
        System.out.println("Received person:");
        printer.printPerson(person);

        // Printing all people in the repository
        System.out.println("\nAll people in the repository:");
        for (int i = 0; i < repo.size(); i++) {
            printer.printPerson(repo.getPersonById(i));
        }

        // Remove person by id
        repo.removePersonById(1);

        // Printing all people in the repository after removing
        System.out.println("\nAll people in repository after removing:");
        for (int i = 0; i < repo.size(); i++) {
            printer.printPerson(repo.getPersonById(i));
        }
    }
}
