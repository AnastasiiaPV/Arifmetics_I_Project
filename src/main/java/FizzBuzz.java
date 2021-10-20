import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz.getFizzBuzz(56);
    }

    public static void getFizzBuzz(int N) {
        String[] array = new String[N];

        for (int i = 1; i < N; i++) {
            if (i % 15 == 0) {
                array[i] = "FizzBuzz";
                //System.out.print(" FizzBuzz ");
            } else if (i % 3 == 0) {
                array[i] = "Fizz";
                // System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                array[i] = "Buzz";
                //System.out.print(" Buzz ");
            } else if (i % 7 == 0) {
                array[i] = "Woof";
                //System.out.print(" Woof ");
            } else {
                array[i] = String.valueOf(i);
                //System.out.print(i);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
    //Написать алгоритм FizzBuzzWoof и тесты к нему
    ////FizzBuzzWoof
    //
    ////Print integers 1 to N, 1 < N < 100
    //// but print:
    //// “Fizz” if an integer is divisible by 3
    //// “Fizz” if an integer contains 3,
    //// “Buzz” if an integer is divisible by 5
    //// “Buzz” if an integer contains 5,
    //// “Woof” if an integer is divisible by 7
    //// “Woof” if an integer contains 7
    //
    ////Fizz Buzz Woof: одна вариация расширилась до такой степени,
    ////что получила собственное имя.
    ////В этом случае число 3 становится Fizz,
    ////5 становится Buzz,
    ////а 7 становится Woof.
    ////Основные правила в этой игре: любое число,
    ////которое содержит число или делится на это число, заменяется вхождением слова.
    ////Если число имеет 2 экземпляра этого числа (т. Е. 33 или 55) и делится на это число,
    ////то слово произносится в этом примере три раза.

