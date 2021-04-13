package africa.semicolon.mp3Player;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarChartTest {
    BarChart barChart;
    @BeforeEach
    void beforeEach(){
         barChart=new BarChart();
    }
@AfterEach
    void afterEach(){
        barChart=null;
}
@Test
    void methodInCreatingBarChart(){

   int[]     arrays= new int[]{0, 0, 0, 0, 0, 0, 1, 2, 4, 2,1};
    System.out.println(barChart.barDisplay(arrays));
    assertEquals(11,barChart.barDisplay(arrays));
}
}
