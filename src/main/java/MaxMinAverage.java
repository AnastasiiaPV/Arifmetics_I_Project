import java.util.Arrays;

public class MaxMinAverage {
    //Написать алгоритм, который принимает массив чисел int[] и возвращает массив,
    // который содержит максимальное число, минимальное число и среднее.
    public static int[] getMaxMinAverage(int[] numbers){

        int[] maxMinAverage = new int[3];
        int max = numbers[0];
        int min = numbers[0];
        int average = numbers[0];
//        int count = 1;

        for (int i = 1; i < numbers.length; i++) {
            average+=numbers[i];
            if(numbers[i]<max){
                min=numbers[i];
                //count++;
            } else {
                max=numbers[i];
              //  count++;
            }
        }
        //average/=count;
        maxMinAverage[0]=max;
        maxMinAverage[1]=min;
        maxMinAverage[2]=average/numbers.length;

        System.out.println(Arrays.toString(maxMinAverage));
        return maxMinAverage;
    }
}
