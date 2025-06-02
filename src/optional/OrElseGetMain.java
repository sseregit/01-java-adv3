package optional;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class OrElseGetMain {

    public static void main(String[] args) {
        Optional<Integer> optValue = Optional.of(100);
        Optional<Integer> optEmpty = Optional.empty();

        Integer i1 = optValue.orElse(10 + 20);
        Integer i2 = optEmpty.orElse(10 + 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("=== orElse ===");
        Integer value1 = optValue.orElse(createData());
        System.out.println("value1 = " + value1);
        Integer empty1 = optEmpty.orElse(createData());
        System.out.println("empty1 = " + empty1);

        System.out.println("=== orElseGet ===");
        Integer value2 = optValue.orElseGet(OrElseGetMain::createData);
        System.out.println("value2 = " + value2);
        Integer empty2 = optEmpty.orElseGet(OrElseGetMain::createData);
        System.out.println("empty2 = " + empty2);
    }

    static int createData() {
        System.out.println("데이터 생성중...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int createValue = ThreadLocalRandom.current().nextInt(100);
        System.out.println("createValue = " + createValue);
        return createValue;
    }
}
