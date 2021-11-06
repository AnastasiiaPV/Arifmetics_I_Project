package HW_19_20;

public class Task_11_IsAnagram {
    //Write a method, which checks if two given strings are Anagram of each other.
    // Two String is said to be an anagram of each other,
    // if they contain exactly the same characters but in a different order.
    //
    //Пример:
    //method("O, Draconian devil!", "!Leonardo Da Vinci,")  -> true
    //method("Oh, lame saint!", "The Mona Lisa,!") -> true
    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if(!str1.toLowerCase().contains(String.valueOf(str2.toLowerCase().charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
