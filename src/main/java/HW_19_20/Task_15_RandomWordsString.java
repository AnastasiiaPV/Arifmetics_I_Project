package HW_19_20;

import java.util.Random;

public class Task_15_RandomWordsString {
    //Написать метод, который генерирует строку слов случайной длины, состоящую из случайных букв английского алфавита.
    public static void main(String[] args) {
        getRendomWords1();
    }

    public static void getRendomWords1() {
        Random random=new Random();

        int sizeWord = 10 + random.nextInt(100);;
        StringBuilder sbWord = new StringBuilder();

        for (int i = 0; i < sizeWord; i++) {
            sbWord.append((char)(97+Math.toIntExact(Math.round(Math.random() * 25))));
            if(Math.random()>0.8){
                sbWord.append(" ");
            }
        }

        System.out.println(sbWord.toString());
    }
}
