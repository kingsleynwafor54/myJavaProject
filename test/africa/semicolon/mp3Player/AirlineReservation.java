package africa.semicolon.mp3Player;

public class AirlineReservation {
public final boolean[] arrays=new boolean[10];

    public int firstClassSeats(boolean[] arrays) {
        arrays[0]=true;
        arrays[1]=true;
        arrays[2]=true;
        arrays[3]=true;
        arrays[4]=true;
       int counter ;
        for( counter=0 ; counter<5; counter++){
            arrays[counter]=true;
        }
    return counter;
    }
}