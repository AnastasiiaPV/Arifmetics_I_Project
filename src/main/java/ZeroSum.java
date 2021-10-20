import java.util.Arrays;

public class ZeroSum {
//Написать алгоритм ZeroSum, который принимает на вход массив целых чисел и
// возвращает массив из двух чисел, сумма которых равна 0.
//

    public static int[] zeroSum(int[] array){
        int[] newArray = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i]+array[j]==0){
                    newArray[0]=array[j];
                    newArray[1]=array[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static void main(String[] args) {
        ZeroSum.zeroSum(new int[]{35, 23, 12, 89, -23, -48, 100});
    }
}
