package methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {

    public static void main(String[] args) {
        Supplier<String> staticMethod1 = () -> Person.greeting();
        Supplier<String> staticMethod2 = Person::greeting;

        System.out.println("staticMethod1.get() = " + staticMethod1.get());
        System.out.println("staticMethod2.get() = " + staticMethod2.get());

        Person person = new Person("Kim");
        Supplier<String> instanceMethod1 = () -> person.introduce();
        Supplier<String> instanceMethod2 = person::introduce;

        System.out.println("instanceMethod1.get() = " + instanceMethod1.get());
        System.out.println("instanceMethod2.get() = " + instanceMethod2.get());

        Supplier<Person> newPerson1 = () -> new Person();
        Supplier<Person> newPerson2 = Person::new;

        System.out.println("newPerson1.get() = " + newPerson1.get());
        System.out.println("newPerson2.get() = " + newPerson2.get());
    }
}
