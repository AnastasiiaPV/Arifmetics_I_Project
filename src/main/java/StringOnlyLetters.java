public class StringOnlyLetters {
    //Написать метод, который принимает строку и возвращает строку,
    // которая состоит только из букв на нечетных индексах
    // (для построения новой строки использовать метод concat() или просто +):
    //

    public static String getOnlyOddLetters1 (String str){
        String newString ="";
        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                char letter = str.charAt(i);
                newString = newString.concat(String.valueOf(letter));
            }
        }
        System.out.println(newString);
        return newString;
    }

    public static String getOnlyOddLetters (String str){
        String newString ="";
        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                char letter = str.charAt(i);
                newString +=letter;
            }
        }
        System.out.println(newString);
        return newString;
    }

}
