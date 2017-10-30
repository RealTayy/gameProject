package testArea;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class U1SolutionJ7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1: Sort list by last name
        Collections.sort(people, Comparator.comparing(Person::getLastName));

        //Step 2: Create a method that prints all elements in the list
        System.out.println("\t Print all Elements");
        performConditionally(people, p -> true, p-> System.out.println(p));

        //Step 3: Create method that prints all people that have last name beginning with C
        System.out.println("\t Print all that have last name starting with C");
        performConditionally(people, (p) -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("\t Print all that have first name starting with C");
        performConditionally(people, (p) -> p.getFirstName().startsWith("C"), p -> System.out.println(p));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) consumer.accept(p);
        }

    }
}

