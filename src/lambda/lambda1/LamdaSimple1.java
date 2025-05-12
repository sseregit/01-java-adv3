package lambda.lambda1;

import lambda.MyFunction;

public class LamdaSimple1 {

    public static void main(String[] args) {
        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function1.apply(1, 2) = " + function1.apply(1, 2));

        MyFunction function2 = (int a, int b) -> a + b;
        System.out.println("function2.apply(1, 2) = " + function2.apply(1, 2));

        MyFunction function3 = (int a, int b) -> {
            System.out.println("람다 실행");
            return a + b;
        };
        System.out.println("function3.apply(1, 2) = " + function3.apply(1, 2));
    }
}
