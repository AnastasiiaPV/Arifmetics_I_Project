package HW_19_20;

public class Task_4_UniqueLetters {
    //
//Написать метод, который принимает на вход строку букв,  и  возвращает строку, в которой только уникальные буквы
//
//    Пример:
//    method(“abcaczdbdakcazdbaz”)
//    Вернуть
//“abczdk"
    public static void main(String[] args) {
        System.out.println(getUniqueLetters("abcaczdbdakcazdbaz"));
        System.out.println(getUniqueLetters1("abcaczdbdakcazdbaz"));

    }

    public static String getUniqueLetters(String str) {
        if (str.length() <= 1) {
            return str;
        }

        str=str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        String newStr=str;
        char[] arr = newStr.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(arr[i] != ' '){
                stringBuilder.append(arr[i]);
            }
            for (int j = i+1; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    arr[j]= ' ';
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String getUniqueLetters1(String str) {
        if (str.length() <= 1) {
            return str;
        }

        str=str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!stringBuilder.toString().contains(String.valueOf(str.charAt(i)))) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
