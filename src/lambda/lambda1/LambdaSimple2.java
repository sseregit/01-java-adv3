package lambda.lambda1;

import lambda.Procedure;

public class LambdaSimple2 {

    public static void main(String[] args) {
        Procedure procedure1 = () -> {
            System.out.println("LambdaSimple2.main");
        };
        procedure1.run();

        Procedure procedure2 = () -> System.out.println("LambdaSimple2.main");
        procedure2.run();
    }
}
