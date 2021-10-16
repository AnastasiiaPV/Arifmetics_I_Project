public class PossitiveNegative {
//Напишите метод, который возвращает true, если численный  параметр больше или равен нулю,
// и возвращает false, если параметр меньше 0.


    public static boolean getPositiveNegative(int number) {
        if (number >= 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
