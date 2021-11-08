package HW_19_20;

import java.util.Arrays;

public class Task_14_StringGeneration {
    public static void main(String[] args) {
        getRandomString("aabcd");
        System.out.println(getRandomString1());
        System.out.println(getRandomString2());
    }

    ////        char a = 'а';//1072
    ////        char z = 'я';//1103
    // Написать метод, который генерирует строку случайных букв русского алфавита.
    public static String getRandomString2() {
        int size = Math.toIntExact(Math.round(Math.random() * 50));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append((char)(1072+Math.toIntExact(Math.round(Math.random() * 31))));
        }
        return sb.toString();
    }

    public static String getRandomString1() {
        int size = Math.toIntExact(Math.round(Math.random() * 50));
        char[] array = new char[size];
        for (int i = 0; i < size; i++) {
            array[i]=(char)(1072+Math.toIntExact(Math.round(Math.random() * 31)));
        }
        return Arrays.toString(array);
    }

    public static String getRandomString(String dictionary) {
        StringBuilder sb = new StringBuilder();
        String result = "";

        char[] array = dictionary.toCharArray();

        for (int i = 0; i < array.length; i++) {
            int random = Math.toIntExact(Math.round(Math.random() * (array.length-1)));
            result = result.concat(String.valueOf(array[random]));
        }
        System.out.println(result);
        return result;
    }
}
