final class Person {
    // Private and final fields, ensuring immutability
    private final String name;
    private final int age;

    // Constructor to initialize the fields (no setters are provided)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No setter methods provided, so the fields cannot be modified after creation
}

public class UseOfImmutable{
    public static void main(String[] args) {
        // Creating an immutable Person object
        Person person = new Person("sanjay", 25);

        // Accessing the fields through getters method
        System.out.println("Name: " + person.getName());  // Output: Name: John
        System.out.println("Age: " + person.getAge());    // Output: Age: 25

        // Trying to modify the fields is impossible (no setters provided)
        // person.name = "sachin";  // This would cause a compile-time error!
        // person.age = 30;      // This would cause a compile-time error!
    }
}
