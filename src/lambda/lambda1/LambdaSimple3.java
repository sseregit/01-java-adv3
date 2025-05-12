package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        MyFunction myFunction1 = (int a, int b) -> a + b;

        MyFunction myFunction2 = (a, b) -> a + b;
        System.out.println("myFunction2.apply(1, 2) = " + myFunction2.apply(1, 2));
    }
}
