public class Repository {
    private int index;
    private Person[] storage;
    private int count;

    // A constructor that initializes a storage of a specific size
    public Repository(int count) {
        this.count = count;
        this.storage = new Person[this.count];
        this.index = 0;
    }

    // A method for adding a person by name and age
    public void append(String personName, int personAge) {
        if (index < count) {
            storage[index] = new Person(personName, personAge);
            index += 1;
        }
    }

    // A method for adding an existing Person object
    public void append(Person person) {
        if (index < count) {
            storage[index] = person;
            index += 1;
        }
    }

    // A method for receiving a person by id
    public Person getPersonById(int id) {
        if (id < 0 || id >= index) {
            return null;
        }
        return storage[id];
    }

    // A method for receiving the current size (number of added elements)
    public int size() {
        return index;
    }

    // A method for removing person by id
    public void removePersonById(int id) {
        if (id < 0 || id >= index) {
            return;
        }
        for (int i = id; i < index - 1; i++) {
            storage[i] = storage[i + 1];
        }
        storage[index - 1] = null;
        index -= 1;
    }

    // A method for removing a person by Person instance
    public void remove(Person person) {
        for (int i = 0; i < index; i++) {
            if (storage[i] == person) {
                removePersonById(i);
                return;
            }
        }
    }

}
