

public class SortedArray {
    //Написать алгоритм SortedArray, который принимает массив чисел int[],
    // и возвращает отсортированный массив
    //

    public static int[] getSortedArray (int[] numbers){
        //int[] sortedArray = new int[numbers.length];
        int temp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i]>numbers[j]){
                        temp=numbers[i];
                        numbers[i]=numbers[j];
                        numbers[j]=temp;
                }
            }
        }
        return numbers;
    }
}
