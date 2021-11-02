package HW_17_18;

public class Task_3_Change0toO {
    //Написать метод, который принимает строку и заменяет все цифры 0
    // на букву “o”.
    //

    public static String getZeroToO(String string) {
        return string.replace('0', 'o');
    }

    public static String getZeroToO1(String string) {
        String text = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '0') {
                text += 'o';
            } else {
                text += text.charAt(i);
            }
        }
        return text;
    }
}
