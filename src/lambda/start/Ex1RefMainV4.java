package lambda.start;

import java.util.concurrent.ThreadLocalRandom;

import lambda.Procedure;

public class Ex1RefMainV4 {

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        hello(() -> {
            int randomValue = ThreadLocalRandom.current().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });
        hello(() -> {
            for (int i = 1; i <= 3; ++i) {
                System.out.println("i = " + i);
            }
        });
    }
}
