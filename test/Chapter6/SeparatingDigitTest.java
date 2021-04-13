package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatingDigitTest {
   SeparatingDigits separatingDigits;
   @BeforeEach
    void beforeEach (){
       separatingDigits=new SeparatingDigits();
   }
@AfterEach
    void afterEach(){
       separatingDigits=null;
}
@Test
    void methodCanCalculateTheQuotientOfA_and_B(){
       int a=10;
       int b=2;
       assertEquals(5, SeparatingDigits.separator(a,b));
}
@Test
    void methodCanCalculateTheRemainderOfA_and_B(){
       int a=10;
       int b=3;
       assertEquals(1, SeparatingDigits.separatorRemainder(a,b));
}
@Test
    void methodCanSeparateDigits(){
    int a=10;
       assertEquals(10,separatingDigits.separatingAllDigits(a));
}


    @Test
    void methodCanDisplaySeparatedDigits(){
        int a=10;
        System.out.println(SeparatingDigits.displaySeparatedDigits(96969));
        assertEquals("0 0 0 1 0", SeparatingDigits.displaySeparatedDigits(a));
    }

}


