import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class BiggerNumberTest {
//6.Напишите метод, который из двух параметров типа int возвращает бОльшее значение.
//Test Data:
//3333, 9999
//Expected Result = 9999
    @Test
    public void testBiggerNumber(){
        int number = BiggerNumber.getBiggerNumber(3333, 9999);
        System.out.println(number);
        Assert.assertEquals(number,9999);
    }
}
