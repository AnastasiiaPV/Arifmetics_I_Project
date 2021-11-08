package HW_19_20;

public class Task_5_UniqueSymbols {
    //Написать метод, который проверяет строку на уникальность символов в ней.
    public static void main(String[] args) {
        System.out.println(getUniqueSymbols("pppp125++kkdleEo-=@125"));
    }

    public static String getUniqueSymbols(String str){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(!stringBuilder.toString().contains(String.valueOf(str.charAt(i)))){
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static boolean getUniqueSymbols1(String str){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(!stringBuilder.toString().contains(String.valueOf(str.charAt(i)))){
                stringBuilder.append(str.charAt(i));
            }
        }

        return stringBuilder.toString().equals(str);
    }
}
