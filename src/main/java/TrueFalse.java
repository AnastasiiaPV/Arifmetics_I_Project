public class TrueFalse {
    //Напишите метод, который принимает массив целых положительных чисел
    // (в массиве четное количество элементов), и возвращает true, если сумма чисел в
    // первой половине массива больше суммы чисел во второй половине массива. Иначе возвращается false

    public static boolean array(int[] positiveNumbers) {
        int sumOne = 0;
        int sumSecond = 0;
        for (int i = 0; i < positiveNumbers.length/2; i++) {
            sumOne+=positiveNumbers[i];
        }
        for (int i = positiveNumbers.length/2+1; i < positiveNumbers.length; i++) {
            sumSecond+=positiveNumbers[i];
        }
        return sumOne > sumSecond;
    }
}
