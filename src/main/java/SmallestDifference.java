public class SmallestDifference {
//    //Написать алгоритм SmallestDifference, который принимает на вход массив целых
//    // чисел и возвращает ту пару чисел, абсолютная разница между которыми наименьшая
    public static int[] smallestDifference(int[] numbers){
        int min = Integer.MAX_VALUE;
        int[] array = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                int differences = Math.abs(numbers[i]-numbers[j]);
                if(differences <= min && differences!=0) {
                    min=differences;
                    array[0]=numbers[i];
                    array[1]=numbers[j];
                }
            }
        }
        return array;
    }
}
