import java.util.ArrayList;
import java.util.List;

public class DigitsToList {
    //Написать метод, который все цифры из входящей строки вернет в виде List<Integer>.
    //
    public static List<Integer> getNumbers(String str) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char numChar = str.charAt(i);
            if (Character.isDigit(numChar)) {
                Integer numInt = Character.getNumericValue(numChar);
                numList.add(numInt);
            }
        }
        System.out.println(numList);
        return numList;
    }
}
