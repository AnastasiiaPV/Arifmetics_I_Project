package HW_19_20;

import java.util.Arrays;

public class Task_3_MinMaxLength {
    //Напишите метод, который в строке находит слова минимальной и максимальной длины,
    // и количество слов одинаковой длины (максимально одинаковой).
    //
    //“What a wonderful day!” -> [“a”, “wonderful”, “0”]
    //“I love to learn Java mava!” -> [“I”, “learn”, “3”]

    public static void main(String[] args) {
        getMinMaxLetter("I love to learn Java mava!");
    }

    public static String[] getMinMaxLetter(String str){

        String[] words = str.split("\\s+");
        String min = "";
        String max = "";
        int count=1;
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if((words[i].length())==((words[j].length()))){
                    count++;
                }
            }
            if(words[i].length()<minLength){
                minLength=words[i].length();
                min=words[i];
            }
            if(words[i].length()>maxLength){
                maxLength=words[i].length();
                max=words[i];
            }
        }
        if(count==1){
            count=0;
        }

        System.out.println(Arrays.toString(new String[]{min, max, String.valueOf(count)}));
        return new String[]{min,max,String.valueOf(count)};
    }
}
