package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumberTest {
    PerfectNumber perfectNumber;
    @BeforeEach
    void beforeEach(){
        perfectNumber=new PerfectNumber();
    }
@AfterEach
    void afterEach(){
        perfectNumber=null;
}
@Test
    void methodShouldBeAbleToDetermineAPerfectNumber(){
        int a=28;
        assertEquals(28, PerfectNumber.perfectNumberDetermination(a));
}
@Test
    void methodShouldDisplayTheFirst100PerfectNumbers(){
    System.out.println(PerfectNumber.theFirst_100_PerfectNumber());
  // assertEquals(100,PerfectNumber.theFirst_100_PerfectNumber());
}
}
