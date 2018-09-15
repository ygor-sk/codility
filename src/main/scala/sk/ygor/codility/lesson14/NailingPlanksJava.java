package sk.ygor.codility.lesson14;

import java.util.SortedSet;
import java.util.TreeSet;

public class NailingPlanksJava {

    public int solution(int[] A, int[] B, int[] C) {
        if (A.length > 1000) {
            throw new RuntimeException("not implemented for array of size: " + A.length);
        }
        SortedSet<Integer> remainingPlankIndexes = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            remainingPlankIndexes.add(i);
        }

        for (int j = 0; j < C.length; j++) {
            int nailPosition = C[j];
            for (int i = 0; i < A.length; i++) {
                int plankStart = A[i];
                int plankEnd = B[i];
                if (plankStart <= nailPosition && nailPosition <= plankEnd) {
                    remainingPlankIndexes.remove(i);
                }
            }
            if (remainingPlankIndexes.isEmpty()) {
                return j + 1;
            }
        }
        return -1;
    }




}
