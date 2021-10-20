public class ZeroOneOne {
    // Напишите метод, который принимает на вход 2 любых int числа, и возвращает
    //0, если числа равны
    //-1, если первое число меньше второго
    //1, если первое число больше второго
    //

    public static int getZeroOneOne(int n1, int n2){
        return n1==n2 ? 0 : n1<n2 ? -1 : 1;
        //return Integer.compare(n1, n2);
    }
}
