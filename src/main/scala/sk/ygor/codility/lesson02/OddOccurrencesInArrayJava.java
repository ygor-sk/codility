package sk.ygor.codility.lesson02;

import java.util.stream.IntStream;

public class OddOccurrencesInArrayJava {

    public int solution(int[] A) {
        return IntStream.of(A).reduce(0, (left, right) -> left ^ right);
    }
}
