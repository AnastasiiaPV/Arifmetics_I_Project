public class SpaceNumbers {
//Написать метод, который принимает строку, и возвращает количество пробелов в этой строке

    public static int getSpaceNumbers(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ' '){
               count ++;
            }
        }
        System.out.println(count);
        return count;
    }
}
