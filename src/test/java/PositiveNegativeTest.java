import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

public class PositiveNegativeTest {
    //Проверьте работу метода на числах 555, 0 и -555.

    @Test
    public void testPositive(){
        boolean number=PossitiveNegative.getPositiveNegative(555);
        AssertJUnit.assertEquals(true,number);
    }
    @Test
    public void testNegative(){
        boolean number=PossitiveNegative.getPositiveNegative(-555);
        AssertJUnit.assertEquals(false,number);
    }
    @Test
    public void testZero(){
        boolean number=PossitiveNegative.getPositiveNegative(0);
        AssertJUnit.assertEquals(true,number);
    }

}
