package HW_19_20;

public class Task_1_String_n_times {
    //1.Напишите метод, который выводит строковый параметр  n раз и показывает количество символов в новой строке.
    public static int printStringNTimes1 (String str, int n){
        if (n < 1) {
            return -1;
        }

        str = str.repeat(n);

        return str.length();
    }

    public static String printStringNTimes (String stringParam, int n){
        if (n < 1) {
            return "-1";
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            stringBuilder.append(stringParam).append(" ");
        }

        String string = stringBuilder.toString();
        int amount = string.length();

        return String.valueOf(stringBuilder.append(amount));
    }
}
