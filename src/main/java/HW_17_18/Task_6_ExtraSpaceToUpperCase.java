package HW_17_18;

public class Task_6_ExtraSpaceToUpperCase {
    //Написать метод, который переведет строку в upper case и уберет все
    // ЛИШНИЕ пробелы
    //
    public static String deleteExtraSpaceToUpperCase1(String str) {
        return str.toUpperCase().trim().replaceAll("\\s+", " ");
    }

    public static String deleteExtraSpaceToUpperCase(String str) {
        str = str.toUpperCase().trim();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if ((i + 1) == str.length()) {
                newStr = newStr.concat(String.valueOf(letter));
                break;
            }
            char secondLetter = str.charAt(i + 1);

            if ((letter == ' ') && (secondLetter == letter)) {
                newStr = newStr.concat(String.valueOf(secondLetter));
                i++;
            } else {
                newStr = newStr.concat(String.valueOf(letter));
            }
        }
        System.out.println(newStr);
        return newStr;
    }

}
