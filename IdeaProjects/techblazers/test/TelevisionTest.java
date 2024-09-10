import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import television.Television;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {
    private Television television;
    @BeforeEach
    public void setUp() {
        television = new Television();
    }
        @Test
        public void testThatICanSwitchOnTelevision(){
            assertEquals("ON", television.switchOnTelevision("ON"));
        }

        @Test
        public void testThatOnlyOnKeyCanSwitchOnTelevision(){
        assertEquals("OFF", television.switchOnTelevision("increase"));

        }
        @Test
        public void testThatICanSwitchOffTelevision(){
            assertEquals("OFF", television.switchOffTelevision("OFF"));
        }
        @Test
        public void testThatOnlyOffButtonCanOffTelevision(){
        assertEquals("ON", television.switchOnTelevision("On"));
        assertEquals("ON", television.switchOffTelevision("increase"));

        }
        @Test
        public void testThatTelevisionCanIncreaseChanel(){
        assertEquals("ON", television.switchOnTelevision ("ON"));
        assertEquals(1, television.increaseTelevisionChanel( 1 ));
        }
        @Test
    public void testThatTelevisionCanDecreaseChanel(){
        assertEquals("ON", television.switchOnTelevision ("ON"));
        assertEquals(1, television.increaseTelevisionChanel( 1 ));
        assertEquals(0, television.decreaseTelevisionChanel( 1 ));
        }
        @Test
        public void  testThatTelevisionCanIncreaseVolume(){
        assertEquals("ON", television.switchOnTelevision("ON"));
        assertEquals(1, television.increaseTelevisionVolume(1));
        }
        @Test
        public void testThatTelevisionCanDecreaseVolume(){
        assertEquals("ON", television.switchOnTelevision("ON"));
        assertEquals(1, television.increaseTelevisionVolume(1));
        assertEquals(0, television.decreaseTelevisionVolume(1));
        }



    }

