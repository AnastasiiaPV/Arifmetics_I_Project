package HW_19_20;

public class Task_9_ReverseStr {
    //Write a method that will take one string as an argument and will return the reverse version of this string.
    public static String getReverseStr(String str){
        StringBuilder reverseStr = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }
        System.out.println(reverseStr.toString());
        return reverseStr.toString();
    }

    public static String getReverseStr1(String str) {
        StringBuilder reverseStr = new StringBuilder();
        return new String(reverseStr.reverse());
    }
}
