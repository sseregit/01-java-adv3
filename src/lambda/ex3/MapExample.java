package lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample {
    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> results = new ArrayList<>();

        for (String word : list) {
            results.add(func.apply(word));
        }
        // 코드 작성
        return results; // 제거하고 적절한 객체를 반환
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);
        // 1. 대문자 변환
        // 코드 작성
        List<String> uppercaseWords = map(words, word -> word.toUpperCase());
        System.out.println("대문자 변환 결과: " + uppercaseWords);
        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        // 코드 작성
        List<String> decorateWords = map(words, word -> "***" + word + "***");
        System.out.println("특수문자 데코 결과: " + decorateWords);
    }
}
