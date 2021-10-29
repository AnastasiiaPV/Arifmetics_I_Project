public class DeleteSpace_ToLoverCase {
    //Написать метод, который удалит все пробелы из входящей строки,
    // и заменит все большие буквы на маленькие.
    //

    public static String deleteSpaceToLoverCase1(String string){
        System.out.println(string.toLowerCase().replace(" ",""));
        return string.toLowerCase().replace(" ","");
    }


    public static String deleteSpaceToLoverCase(String string){
        string = string.toLowerCase();
        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if(letter!=' '){
                newString = newString.concat(String.valueOf(letter));
            }
        }
        System.out.println(newString);
        return newString;
    }
}
