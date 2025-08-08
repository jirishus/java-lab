import java.util.*;

// COMPARABLE - Built into the class itself
class Person implements Comparable<Person> {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Natural ordering - part of the class
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name); // Sort by name
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Bob", 25),
            new Person("Alice", 30),
            new Person("Charlie", 20)
        );
        
        System.out.println("Original: " + people);
        
        // COMPARABLE - uses the natural ordering (by name)
        Collections.sort(people);
        System.out.println("Sorted by name (Comparable): " + people);
        
        // COMPARATOR - external comparison logic
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
        System.out.println("Sorted by age (Comparator): " + people);
        
        // COMPARATOR with lambda (Java 8+)
        people.sort((p1, p2) -> p2.getAge() - p1.getAge()); // Reverse age
        System.out.println("Sorted by age descending: " + people);
        
        // COMPARATOR with method references
        people.sort(Comparator.comparing(Person::getName));
        System.out.println("By name with Comparator: " + people);
        
        people.sort(Comparator.comparing(Person::getAge).reversed());
        System.out.println("By age descending (chained): " + people);
    }
}