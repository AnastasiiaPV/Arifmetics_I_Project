package HW_17_18;

public class Task_1_PrintQOR {
    //Написать метод, который принимает на ход строку и печатает все буквы “q”, “o” и “r” из этой строки:
    //


    public static String str(String str){
        String newStr = "";
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='q'){
                newStr +="q";
            }
            if(str.charAt(i)=='o'){
                newStr +="o";
            }
            if(str.charAt(i)=='r'){
                newStr +="r";
            }
        }

        System.out.println(newStr);
        return newStr;
    }
}
