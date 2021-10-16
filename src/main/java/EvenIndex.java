import java.util.Arrays;

public class EvenIndex {
    //Написать алгоритм, который принимает массив чисел,  и возвращает массив значений нечетных индексов

    public static int[] getEvenIndexes(int[] numbers){
        int[] evenIndexNumbers = new int[0];
        for (int i = 0; i < numbers.length; i++) {
            if(i % 2 != 0){
                evenIndexNumbers= Arrays.copyOf(evenIndexNumbers,evenIndexNumbers.length+1);
                evenIndexNumbers[evenIndexNumbers.length-1] = numbers[i];
            }
        }
        return evenIndexNumbers;
    }
}
