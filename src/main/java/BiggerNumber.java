public class BiggerNumber {
    public static int getBiggerNumber(int number1, int number2){
        int biggerNumber = 0;
            if(number1>number2){
                biggerNumber=number1;
            } else{
                biggerNumber=number2;
            }

        System.out.println(biggerNumber);
        return biggerNumber;
    }
}
