package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain2 {

    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        calculate(add);
        calculate(sub);

        calculate((a, b) -> a + b);
        calculate((a, b) -> a - b);
    }

    static void calculate(MyFunction function) {
        int a = 1;
        int b = 2;
        System.out.println("계산 시작");
        int result = function.apply(a, b);
        System.out.println("result = " + result);
        System.out.println("계산 종료");
    }
}
