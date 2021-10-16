public class SumOrSubtract {
    //Написать алгоритм, который возвращает сумму всех чисел от 1 до n,
    // если последовательность чисел возрастающая; и возвращает разницу всех чисел,
    // если последовательность чисел убывающая.
    public static int getSumOrSubtract(int n) {

        int sum = 0;
        if (n >= 0) {
            for (int i = 0; i != n; i++) {
                sum += i;
            }
        } else {
            sum=Math.abs(n);
            for (int i = n; i <= 1; i++) {
                sum +=Math.abs(i);
            }
        }
        return sum + n;
    }
}
