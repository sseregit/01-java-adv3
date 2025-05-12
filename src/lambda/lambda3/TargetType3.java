package lambda.lambda3;

import java.util.function.Function;

public class TargetType3 {

    public static void main(String[] args) {
        Function<Integer, String> funcationA = i -> "value = " + i;
        System.out.println(funcationA.apply(10));

        Function<Integer, String> funcationB = funcationA;
        System.out.println(funcationB.apply(20));
    }
}
