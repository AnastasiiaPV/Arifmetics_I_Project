package HW_19_20;

public class Task_2_FirstThree_LastThree {
    //2.Напишите метод, который принимает строковый параметр и возвращает слово, которое состоит из последних
    // трех и первых трех букв слова-параметра, если длина строки больше 5. Иначе метод возвращает слово,
    // состоящее из средней/средних буквы/букв слова-параметра, повторенных столько раз, какова длина строки.
    //
    //Пример:
    //method(“QAForEveryone”) -> “oneQAF”
    //method(“Java”) -> “avavavav”
    //method(“A”) -> “A”

    public static String getFirstThreeLastThreeLetters(String str){
        StringBuilder stringBuilder = new StringBuilder();

        if(str.length()>5){
            for (int i = str.length()-3; i < str.length(); i++) {
                stringBuilder.append(str.charAt(i));
            }
            for (int i = 0; i < 3; i++) {
                stringBuilder.append(str.charAt(i));
            }
            System.out.println(stringBuilder.toString());
            return stringBuilder.toString();
        } else {
            if(str.length()%2==0){
                char firstLetter = str.charAt((str.length()/2)-1);
                char secondLetter = str.charAt((str.length()/2));

                for (int i = 1; i < str.length(); i++) {
                    stringBuilder.append(firstLetter).append(secondLetter);
                }

                return stringBuilder.append(firstLetter).append(secondLetter).toString();
            } else {
                return stringBuilder.append(str.charAt((str.length()/2))).toString();
            }
        }
    }
    //
}
