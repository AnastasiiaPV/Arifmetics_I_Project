public class TwoArrays {
    //Напишите метод, который принимает на вход 2 массива целых положительных чисел,
    // и возвращает true, если каждый элемент первого массива равен элементу
    // второго массива с тем же индексом
    //


    public static boolean isFirstSameAsSecond(int[] array1, int[]array2){
        int count=0;
        for (int j : array1) {
            for (int k : array2) {
                if (j == k) {
                    count++;
                }
            }
        }
        return count == array1.length;
    }
}
