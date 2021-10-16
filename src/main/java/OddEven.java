public class OddEven {
//Создать алгоритм OddEven, который примет на вход число, вернет “Odd”,  если число нечетное, и “Even”,
// если число четное. Во всех остальных случаях результат будет “Undefined”.
    public static String oddEven(int number){
        if(number<0){
            return "Odd";
        } else if(number>=0){
            return "Even";
        }
        return "Undefined";
    }

}
