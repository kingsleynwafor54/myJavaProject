package africa.semicolon.mp3Player;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RandomIntegersTest {
    SecureRandom randomInteger;
    RandomInteger sc;

    @BeforeEach

    void beforeEach(){
       randomInteger=new SecureRandom();
        sc=new RandomInteger();
    }
@AfterEach
    void afterEach(){
        randomInteger=null;
}

@Test
    void methodCanGenerateRandomIntegerNumbers(){
  int face1= sc.displayRandomNumber();
    int face3= sc.displayRandomNumber();
    assertNotEquals(face1,face3);
}
}
