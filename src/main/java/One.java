import java.util.Arrays;

public class One {
    //Написать метод, который принимает на вход массив чисел 0 и 1,
    // и возвращает самую длинную последовательность единиц из входящего массива

    public static int[] zeroOne(int[] array) {
        int[] newArray = new int[0];
        int countOne = 0;
        int countSecond = 0;
        for (int i = 0; i < array.length; i++) {
            countSecond = countOne;
            countOne = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j] && array[i] == 1) {
                    countOne++;
                } else {
                    break;
                }
            }
            if (countSecond > countOne) {
                countOne = countSecond;
            }
        }

        newArray = new int[countOne];
        for (int i = 0; i < countOne; i++) {
            newArray[i] = 1;
        }
        return newArray;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(One.zeroOne(new int[]{1, 1, 1, 0, 0, 0, 1, 1})));
        System.out.println(Arrays.toString(One.zeroOne(new int[]{1, 0, 1, 1, 0, 1})));

    }
}
