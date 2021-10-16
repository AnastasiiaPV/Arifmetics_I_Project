public class Mathematica {
    //Given an integer M perform the following conditional actions:

    public static String getMessage(int m){
        return m % 3 == 0 && m % 5 == 0 ? "Good Number" : m % 3 == 0 ? "Bad Number" : m % 5 == 0 ? "Poor Number" : "-1";
    }
}
