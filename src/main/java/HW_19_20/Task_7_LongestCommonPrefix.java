package HW_19_20;

public class Task_7_LongestCommonPrefix {
    //Write a function to find the longest common prefix string amongst an array of strings.
    // If there is no common prefix, return an empty string "".
    //Example 1:
    //Input: String[] strs = {"flower","flow","flight"}
    //Output: "fl"
    //Example 2:
    //Input: String[] strs = {"dog","racecar","car"}
    //Output: ""
    //Explanation: There is no common prefix among the input strings.
    public static String getLongestPrefix(String str1, String str2, String str3){
        StringBuilder prefixSB = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if(str2.contains(String.valueOf(str1.charAt(i))) && str3.contains(String.valueOf(str1.charAt(i)))){
                prefixSB.append(str1.charAt(i));
            } else {
                prefixSB.append("");
                System.out.println(prefixSB.toString());
                return prefixSB.toString();
            }
        }
        System.out.println(prefixSB.toString());
        return prefixSB.toString();
    }
}
