package africa.semicolon.mp3Player;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
    void airlineCanAssignSeat(){
    boolean[] arrays= new boolean[10];

    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(1));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(1));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(1));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(1));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(1));
    assertEquals(AirlineReservation.classType.FILLED_SEATS, airline.assignSeatInASection(1));

}
@Test
    void airlineShouldBeAbleToReserveEconomySeats(){
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(2));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(2));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(2));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(2));
    assertEquals(AirlineReservation.classType.SEAT_RESERVED, airline.assignSeatInASection(2));
    assertEquals(AirlineReservation.classType.FILLED_SEATS, airline.assignSeatInASection(2));

}
@Test
    void airlineShouldAssignTicketToCustomers(){
    airline.assignSeat(1);
    assertEquals( "Seat No: " +  (1) + " First Class Seat",airline.getAirlineTicket());
    airline.assignSeat(1);
    assertEquals( "Seat No: " +  (2) + " First Class Seat",airline.getAirlineTicket());
    airline.assignSeat(1);
    assertEquals( "Seat No: " +  (3) + " First Class Seat",airline.getAirlineTicket());
}
@Test
    void airlineShouldPrintOutMessage(){
    assertEquals("Next flight leaves in 3 hours",airline.getSeatFullMessage());
}
}
