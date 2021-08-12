import Maven.Bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BankTest {

 @Test
    public void pinTest(){
        Bank pin =new Bank();


        int actualResult = pin.getPin();


        int expectedResult = pin.getPin();
        assertEquals(expectedResult,actualResult);
    }
}
