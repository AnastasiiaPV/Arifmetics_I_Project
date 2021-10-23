import org.testng.annotations.Test;

public class Bottles99Test {
    //Вызовите этот метод в отдельном тесте (тест не будет ничего проверять, просто будет
    // запускать метод и выводить песню на консоль)

    @Test
    public static void testPrintBottles(){
        System.out.print(Bottles99.print99Bottles());
    }
}
