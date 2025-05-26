package methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV3 {

    public static void main(String[] args) {
        BinaryOperator<Integer> add1 = MethodRefStartV3::add; // (a, b) -> add(a, b);
        BinaryOperator<Integer> add2 = MethodRefStartV3::add; // (a, b) -> add(a, b);

        System.out.println("add1.apply(1, 2) = " + add1.apply(1, 2));
        System.out.println("add2.apply(1, 2) = " + add2.apply(1, 2));
    }

    static int add(int a, int b) {
        return a + b;
    }
}
