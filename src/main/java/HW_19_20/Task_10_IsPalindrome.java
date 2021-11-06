package HW_19_20;

public class Task_10_IsPalindrome {
    //Write a method that will take a string as an argument.
    // The method will return a palindrome.
    // A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
    //
    ////Такие варианты редко дают на интервью
    //a)
    //method(“А роза упала на лапу Азора”) -> “арозА упал ан алапу азор А”      или  “а розА упала на лапу азорА”
    //
    //
    ////Этот вариант чаще дают на интервью
    //b) Написать метод, который проверяет, является ли слово палиндромом.
    //
    //method(“Madam”) -> true    это палиндром
    //method(12321) -> true
    public static boolean isPalindrome (String str) {
        StringBuilder sb = new StringBuilder();
        if(str.contains(" ")){
            str=str.replace(" ","");
        }

        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        if (str.toLowerCase().equals(sb.toString().toLowerCase())) {
            System.out.println(sb.toString().toLowerCase());
            System.out.println(str.toLowerCase());

            return true;
        }
        System.out.println(sb.toString().toLowerCase());
        System.out.println(str.toLowerCase());
        return false;
    }
}
