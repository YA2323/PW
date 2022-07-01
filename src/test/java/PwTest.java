import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class PwTest {

    @Test
    void pwLengthTest() {

        //given
        String pw = "12345";
        //when
        boolean actual = PwVal.checkLength(pw);
        boolean expected = true;
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void pwTest(){

        //given
        String pw ="Beispiel";
        //when
        boolean actual = PwVal.passwordVal(pw);
        boolean expected = true;
        //then
        Assertions.assertEquals(expected,actual);
    }
}
