package africa.semicolon.mp3Player;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirlineReservationTest {
    AirlineReservation airline;
@BeforeEach
    void BeforeEach(){
    airline=new AirlineReservation();

    }
    @AfterEach
    void afterEach(){
    airline=null;
    }
@Test
    void AirlineShouldReserveSeat(){
    boolean[] seatAssignment=new boolean[10];

airline.firstClassSeats([]);
assertEquals(5,airline.firstClassSeats();

}
@Test
    void airlineShouldAssignSeat(){
    airline.getSeat()
}

}