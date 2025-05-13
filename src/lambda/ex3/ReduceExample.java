package lambda.ex3;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initial, IntBinaryOperator reducer) {
        int result = initial;

        for (Integer number : list) {
            result = reducer.applyAsInt(result, number);
        }

        return result; // 적절한 값으로 변경
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);
        // 1. 합 구하기 (초깃값 0, 덧셈 로직)
        // 코드 작성
        System.out.println("합(누적 +): " + reduce(numbers, 0, (x, y) -> x + y));

        // 2. 곱 구하기 (초깃값 1, 곱셈 로직)
        // 코드 작성
        System.out.println("곱(누적 *): " + reduce(numbers, 1, (x, y) -> x * y));
    }
}
