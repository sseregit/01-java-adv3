package lambda.lambda4;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {
        Supplier<Integer> supplier1 = new Supplier<>() {
            @Override
            public Integer get() {
                return ThreadLocalRandom.current().nextInt(10);
            }
        };
        System.out.println("supplier1.get() = " + supplier1.get());

        Supplier<Integer> supplier2 = () -> ThreadLocalRandom.current().nextInt(10);
        System.out.println("supplier2.get() = " + supplier2.get());
    }
}
