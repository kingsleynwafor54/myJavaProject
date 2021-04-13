package africa.semicolon.mp3Player;

import java.util.Arrays;

public class AirlineReservation {
    public final boolean[] arraySeats = new boolean[10];
    private String airlineTicket ="";
    private boolean firstClassFull=false;
    private   boolean economyFull=false;
    public enum classType {
        SEAT_RESERVED, FILLED_SEATS;
    }
  boolean assignSeat(int classLevel) {
        boolean firstClassSeat = classLevel == 1;
        boolean economySeat = classLevel == 2;
        if (firstClassSeat) {
            for (int counter = 0; counter < (arraySeats.length / 2); counter++) {
                if (!arraySeats[counter]) {
                    arraySeats[counter] = true;
                    airlineTicket = "Seat No: " + (counter + 1) + " First Class Seat";
                    return true;
                }
                if (arraySeats[arraySeats.length / 2]) {
                    firstClassFull = true;
                }
            }
        }
        if (economySeat) {
            for (int counter = 5; counter < arraySeats.length; counter++) {
                if (!arraySeats[counter]) {
                    arraySeats[counter] = true;
                    airlineTicket = "Seat No: " + (counter + 1) + " Economy Class Seat";
                    return true;
                }
                if (arraySeats[arraySeats.length - 1]) {
                    economyFull = true;
                }
            }
        }
        return false;
    }
    public classType assignSeatInASection(int classLevel) {
        boolean firstClassSeat = classLevel == 1;
        boolean economySeat = classLevel == 2;
        if (firstClassSeat) {
            if (!firstClassFull) {
                if (assignSeat(1)) {
                    return classType.SEAT_RESERVED;
                } else {
                    return classType.FILLED_SEATS;
                }
            }
        }
        if (economySeat) {
            if (!economyFull) {
                if (assignSeat(2)) {
                    return classType.SEAT_RESERVED;
                } else {
                    return classType.FILLED_SEATS;
                }
            }
        }
        return classType.FILLED_SEATS;

    }

    public String getSeatFullMessage() {
        return "Next flight leaves in 3 hours";
    }

    public String getSeats() {
        return Arrays.toString(arraySeats);
    }

    public String getAirlineTicket() {
        return airlineTicket;
    }
}
