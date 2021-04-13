package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberTest {
    MinimumNumber minimumNumber;
    @BeforeEach
    void beforeEach(){
        minimumNumber=new MinimumNumber();
    }
@AfterEach
    void afterEach(){
        minimumNumber=null;
}
@Test
    void methodShouldBeAbleToGiveOutTheSmallestNumber(){
        double a=5,b=6,c=7;
        assertEquals(5,minimumNumber.smallestNumber(a,b,c));

}

}
