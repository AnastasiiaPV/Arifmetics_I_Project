package HW_19_20;

import java.util.Arrays;

public class Task_3_MinMaxLength {
    //Напишите метод, который в строке находит слова минимальной и максимальной длины,
    // и количество слов одинаковой длины (максимально одинаковой).
    //
    //“What a wonderful day!” -> [“a”, “wonderful”, “0”]
    //“I love to to to learn Java mava!” -> [“I”, “learn”, “3”]

    public static void main(String[] args) {
        getMinMaxLetter("I love to to to, learn Java mava!");
    }

    public static String[] getMinMaxLetter(String str) {

        String[] words = str.split("\\s+"); //[I, love, to, to, to, learn, Java, mava!]
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        System.out.println(Arrays.toString(words));
        String min = "";
        String max = "";
        int count = 0;
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;


        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() < minLength) {
                    minLength = words[i].length();
                    min = words[i];
                }
                if (words[i].length() > maxLength) {
                    maxLength = words[i].length();
                    max = words[i];
                }
            }
        }
        int matches=0;
        for (int i = 0; i < words.length; i++) {
            if (matches<count && count>1) {
                matches = count;
            }
            count = 0;
            maxLength -= i;
            for (String word : words) {
                if (maxLength == word.length()) {
                    count++;
                }
            }
        }

        System.out.println(Arrays.toString(new String[]{min, max, String.valueOf(matches)}));
        return new String[]{min, max, String.valueOf(matches)};
    }
}
