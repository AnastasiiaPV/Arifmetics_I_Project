import org.junit.jupiter.api.Test;
import org.testng.Assert;

;

public class OddNumberTest {
    //Test Data:
    //-345 -> “Odd”
    //0 -> “Even”
    //222222 -> “Even”
    //2147483647 + 1 -> “Undefined”


    @Test
    public void oddNumberTest() {
        String number = OddEven.oddEven(-345);
        System.out.println(number);

        Assert.assertEquals("Odd",number);
    }

    @Test
    public void testOddNumber2() {
        String number = OddEven.oddEven(0);
        System.out.println(number);

        Assert.assertEquals("Even",number);
    }

    @Test
    public void testONumber3(){
        String number = OddEven.oddEven(222222);
        System.out.println(number);

        Assert.assertEquals("Even",number);
    }

//    @Test
//    public void testONumber4(){
//        String number = OddEven.oddEven((2147483648+1));
//        System.out.println(number);
//
//        Assert.assertEquals("Undefined",number);
//    }


}
