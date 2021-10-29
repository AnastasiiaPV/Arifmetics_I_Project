public class VowelLetters {
    //Написать метод, который посчитает количество гласных букв в строке.
    // Для нахождения гласных букв использовать метод contains()
    //{'a', 'e', 'i', 'o', 'u'};

    public static int getNumbersOfVowel1(String str){

        return str.length()-str.toLowerCase().replaceAll("[aeiou]","").length();
    }

    public static int getNumbersOfVowel(String str){
        int count = 0;
        str=str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}
