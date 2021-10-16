import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class MathematisaTest {
    //    //If M is multiple of 3 and 5 then return .
    //    //If M is only multiple of 3 and not of 5 then return "Bad Number"
    //    //If M is only multiple of 5 and not of 3 then return "Poor Number"
    //    //If M doesn't satisfy any of the above conditions then return "-1"

    @Test
    public void testMessage(){
        String message = Mathematica.getMessage(15);
        System.out.println(message);
        AssertJUnit.assertEquals("Good Number",message);
    }
    @Test
    public void testMessage1(){
        String message = Mathematica.getMessage(33);
        System.out.println(message);
        AssertJUnit.assertEquals("Bad Number",message);
    }
    @Test
    public void testMessage2(){
        String message = Mathematica.getMessage(55);
        System.out.println(message);
        AssertJUnit.assertEquals("Poor Number",message);
    }
    @Test
    public void testMessage3(){
        String message = Mathematica.getMessage(562);
        System.out.println(message);
        AssertJUnit.assertEquals("-1",message);
    }
}
