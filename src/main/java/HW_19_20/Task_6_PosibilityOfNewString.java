package HW_19_20;

public class Task_6_PosibilityOfNewString {
//    Даны две строки. Определите, можно ли из некоторых символов
//    первой строки составить вторую строку.
//
//      Пример:
//method( “QAForEveryone”, “Verona”) -> true
//method( “QAForEveryone”, “frog”) -> false
    public static boolean isNewString(String strMain, String second){
        strMain=strMain.toLowerCase();
        second=second.toLowerCase();

        for (int i = 0; i < second.length(); i++) {
            if(!strMain.contains(String.valueOf(second.charAt(i)))){

                return false;
            }
        }

        return true;
    }
}
