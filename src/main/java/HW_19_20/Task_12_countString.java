package HW_19_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_12_countString {
    //Написать метод, который принимает на вход строку и производит вычисления в этой строке в порядке математических действий.
    //Входные данные:
    //"5*3-9/3"
    //
    //Выходные данные:
    //“12"
//    public static void main(String[] args) {
//        System.out.println(getResult("15*3-9/3"));
//        System.out.println(getResult("2*3/2+7-5"));
//
//    }

    public static int getResult(String str){
        List<String> operations = new ArrayList<>();
        List<String> result = new ArrayList<>();
        List<String> midResult = new ArrayList<>();

        String[] numbers = str.split("[/*+-]");
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '-' || str.charAt(i) == '+') {
                operations.add(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(operations);

        for (int i = 0; i < operations.size(); i++) {
            midResult.add(numbers[i]);
            midResult.add(operations.get(i));
        }
        midResult.add(numbers[numbers.length-1]);
        System.out.println(midResult);

        int size=midResult.size();
        for (int i = 1; i < size; i+=2) {
            if(midResult.get(i).equals("*")){
                int temp = Integer.parseInt(midResult.get(i-1)) * Integer.parseInt(midResult.get(i+1));
                midResult.set(i-1,String.valueOf(temp));
                midResult.remove(i+1);
                midResult.remove(i);
                i=-1;
                size=midResult.size();
                System.out.println(midResult);
            } else if(midResult.get(i).equals("/")){
                int temp = Integer.parseInt(midResult.get(i-1)) / Integer.parseInt(midResult.get(i+1));
                midResult.set(i-1,String.valueOf(temp));
                midResult.remove(i+1);
                midResult.remove(i);
                i=-1;
                size=midResult.size();
                System.out.println(midResult);
            }
        }
        for (int i = 1; i < size; i+=2) {
            if(midResult.get(i).equals("+")){
                int temp = Integer.parseInt(midResult.get(i-1)) + Integer.parseInt(midResult.get(i+1));
                midResult.set(i-1,String.valueOf(temp));
                midResult.remove(i+1);
                midResult.remove(i);
                i=-1;
                size=midResult.size();
                System.out.println(midResult);

            } else if(midResult.get(i).equals("-")){
                int temp = Integer.parseInt(midResult.get(i-1)) - Integer.parseInt(midResult.get(i+1));
                midResult.set(i-1,String.valueOf(temp));
                midResult.remove(i+1);
                midResult.remove(i);
                i=-1;
                size=midResult.size();
                System.out.println(midResult);

            }
        }
        return Integer.parseInt(midResult.get(0));
    }
}
