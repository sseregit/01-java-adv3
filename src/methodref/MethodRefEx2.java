package methodref;

import java.util.function.Function;

public class MethodRefEx2 {

    public static void main(String[] args) {
        Function<String, String> staticMethod1 = (name) -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;

        System.out.println("staticMethod1.apply(\"Kim\") = " + staticMethod1.apply("Kim"));
        System.out.println("staticMethod2.apply(\"Kim\") = " + staticMethod2.apply("Kim"));

        Person person = new Person("Kim");
        Function<Integer, String> instanceMethod1 = (n) -> person.introduceWithNumber(n);
        Function<Integer, String> instanceMethod2 = person::introduceWithNumber;

        System.out.println("instanceMethod1.apply(1) = " + instanceMethod1.apply(1));
        System.out.println("instanceMethod2.apply(1) = " + instanceMethod2.apply(1));

        Function<String, Person> newPerson1 = name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;

        System.out.println("newPerson1.apply(\"Kim\").getName() = " + newPerson1.apply("Kim").getName());
        System.out.println("newPerson2.apply(\"Kim\").getName() = " + newPerson2.apply("Kim").getName());
    }
}
