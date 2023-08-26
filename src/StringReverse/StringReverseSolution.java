package StringReverse;

import java.util.Arrays;

public class StringReverseSolution {

    public static void main(String[] args) {
        String word = "Hello, world!";
        String reverseWord = null;

        reverseWord = solutionMethod1(word);
        System.out.println(reverseWord);

        reverseWord = solutionMethod2(word);
        System.out.println(reverseWord);

        reverseWord = solutionMethod3(word);
        System.out.println(reverseWord);
    }


    public static String solutionMethod1(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

    public static String solutionMethod2(String inputString) {
        char[] letters = inputString.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = letters.length - 1; i >= 0; i--) {
            builder.append(letters[i]);
        }
        return builder.toString();
    }

    public static String solutionMethod3(String inputString) {
        char[] letters = inputString.toCharArray();
        int start = 0;
        int end = letters.length - 1;
        while (start < end) {
            char temp = letters[start];
            letters[start] = letters[end];
            letters[end] = temp;
            start++;
            end--;
        }
        return new String(letters);
    }
}
