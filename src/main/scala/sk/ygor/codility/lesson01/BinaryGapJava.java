package sk.ygor.codility.lesson01;

public class BinaryGapJava {

    public int solution(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int lastOneAtIndex = -1;
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == '1') {
                if (lastOneAtIndex > -1) {
                    result = Math.max(result, i - lastOneAtIndex - 1);
                }
                lastOneAtIndex = i;
            }

        }
        return result;
    }
}
