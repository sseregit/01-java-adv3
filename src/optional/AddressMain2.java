package optional;

import java.util.Optional;

import optional.model.Address;
import optional.model.User;

public class AddressMain2 {

    public static void main(String[] args) {
        User user1 = new User("user1", null);
        User user2 = new User("user2", new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(System.out::println, () -> System.out.println("Unknown"));
    }

    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user)
            .map(User::getAddress)
            .map(Address::getStreet);
    }
}
