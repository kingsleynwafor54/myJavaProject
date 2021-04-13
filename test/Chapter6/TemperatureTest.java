package Chapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    Temperature temperature;
    @BeforeEach
    void beforeEach(){
        temperature=new Temperature();
    }
@AfterEach
    void afterEach(){
        temperature=null;
}
@Test
    void methodCanCalculateTemperatureInCelsius(){
        assertEquals(93.2, Temperature.fahrenheit(34));
}
@Test
    void methodCanCalculateTemperatureInFahrenheit(){
        assertEquals(19.444444444444446,Temperature.celsius(67));
}
}
