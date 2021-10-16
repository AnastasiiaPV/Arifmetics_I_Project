public class AscendingSequence {
    //Написать алгоритм AscendingSequence, который строит возрастающую последовательность чисел от
    // a до b с шагом n.

    public static int[] testAscendingSequence(int a, int b, int n){

        int[] array = new int[((b-a)/n)+1];
        if(b-a<=0) {
             int[] array2 = new int[1];
            array2[0]=-1;
            return array2;
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = a;
                a += n;
            }
            return array;
        }
    }
}
