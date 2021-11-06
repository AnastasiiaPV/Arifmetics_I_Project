package HW_19_20;

public class Task_13_SortingString {
    //Строка состоит из слов, разделенных пробелами. Переставьте слова a) по убыванию их длин
    //b) Отсортировать по алфавиту.
    public static void main(String[] args) {
        sortDescending("Yellowstone is an American drama television series created by Taylor Sheridan and John Linson");
        sortAlphabet("Yellowstone is an American drama television series created by Taylor Sheridan and John Linson");

    }
    public static String sortDescending(String str){
        String temp;
        StringBuilder sortedStr=new StringBuilder();
        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].length() <= array[j].length()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            sortedStr.append(array[i]).append(" ");
        }

        System.out.println(sortedStr.toString());
        return sortedStr.toString().trim();
    }

    public static String sortAlphabet(String str){
        String temp;
        StringBuilder sortedStr=new StringBuilder();
        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].compareToIgnoreCase(array[j])>0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            sortedStr.append(array[i]).append(" ");
        }
        System.out.println(sortedStr.toString());
        return sortedStr.toString().trim();
    }
}
