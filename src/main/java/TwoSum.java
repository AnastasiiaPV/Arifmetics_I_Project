

public class TwoSum {
    //Написать алгоритм TwoSum, который принимает на вход массив целых чисел,
    // и возвращает массив из двух ИНДЕКСОВ значений, сумма которых равна таргетному числу.
    //
    public static int[] arrayIndex(int[] evenNumber, int targetNumber){
        int[] array =  new int[2];
        for (int i = 0; i < evenNumber.length; i++) {
            for (int j = i+1; j < evenNumber.length; j++) {
                if(evenNumber[i]+evenNumber[j]==targetNumber){
                    array[0]=i;
                    array[1]=j;
                    return array;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        TwoSum.arrayIndex(new int[]{68, 5, 2, 100, 9, 12, 8},10);
    }

}
