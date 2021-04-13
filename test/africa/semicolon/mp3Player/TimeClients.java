package africa.semicolon.mp3Player;

import com.kingsley.Africa.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeClients {
    Time time;
    @BeforeEach
    void beforeEach(){
        time= new Time();
    }


    @Test
    void time_CanBeSet(){
        time.setTime(12,52,2);
        assertEquals(2,time.getSecond());
        assertEquals(52,time.getMinute());

    }
 @Test
 void time_cannotTakeInvalidHour(){
        time.setTime(30,52,5);
        assertEquals(30,time.getHour());
 }
@Test
    void time_canThrowExceptions(){
        assertThrows(IllegalArgumentException.class,()->time.setTime(23,70,54));
}

@Test
    void time_canBeCreated(){
        assertNotNull(time);
}
}
