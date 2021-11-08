package HW_19_20;

public class Task_8_NonRepeatingLength {
    //Find the non-repeating length of the longest substring in a string
    //Example :  aabcb        Output expected: 3
    //Example2: aaaaa        Output expected: 1
    public static void main(String[] args) {
        findSubstringLength("abvmubtcvcabbyuo"); //must be 6 I have 9
        findSubstringLength("acbn");
        findSubstringLength("aaaaa");
        findSubstringLength("");
        findSubstringLength("aaaaA");
    }
////!!!!Wrong method
    public static int findSubstringLength(String str) {
        if(str.equals("")){
            System.out.println(0);
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int comparationCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!(sb.toString().contains(String.valueOf(str.charAt(i))))) {
                sb.append(str.charAt(i));
            }
            if (sb.toString().contains(String.valueOf(str.charAt(i)))) {
                if (sb.length() > comparationCount) {
                    comparationCount=sb.length();
                }
            }
        }
        System.out.println(comparationCount);
        return comparationCount;
    }
}
