package africa.semicolon.mp3Player;

import com.kingsley.Africa.World;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTest {
    World world;
    @BeforeEach
    void beforeEach(){
        world=new World();
    }
@AfterEach
    void afterEach(){
        world = null;
    }
   @Test
    void methodCanPrint (){
       assertEquals("Hello World",world.printHelloWorld());
   }
   @Test
    void methodCanAddArraysTogether(){
        int[][] a={{1,3,4},{2,4,3},{3,4,5}};
        int[][] b={{1,3,4},{2,4,3},{1,2,4}};
        world.addArrays(a,b);
   assertEquals(6,world.getArrayAddition());
   }

    }