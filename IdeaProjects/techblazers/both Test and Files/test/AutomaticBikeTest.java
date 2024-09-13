package IdeaProjects.techblazers.test;

import bike.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {
    private AutomaticBike automaticBike;
    @BeforeEach
    public void setUp() {
        automaticBike = new AutomaticBike();
    }

    @Test
    public void testThatICanSwitchOnAutomaticBike() {
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
    }
    @Test
    public void testThatICanSwitchOffAutomaticBike() {
        assertEquals("OFF", automaticBike.switchOffAutomaticBike("OFF"));
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearOne() {
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(1, automaticBike.accelerateInGearOne(1));
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearTwo() {
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(23, automaticBike.accelerateInGearTwo(2));
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearThree() {
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(34, automaticBike.accelerateInGearThree(3));
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearFour() {
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(45, automaticBike.accelerateInGearFour(4));
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearOne() {
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(1, automaticBike.accelerateInGearOne(1));
        assertEquals(0, automaticBike.decelerateInGearOne(1));
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearTwo(){
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(23, automaticBike.accelerateInGearTwo(2));
        assertEquals(21, automaticBike.decelerateInGearTwo(2));
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearThree(){
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(34, automaticBike.accelerateInGearThree(3));
        assertEquals(31, automaticBike.decelerateInGearThree(3));
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearFour(){
        assertEquals("ON", automaticBike.switchOnAutomaticBike("ON"));
        assertEquals(45, automaticBike.accelerateInGearFour(4));
        assertEquals(41, automaticBike.decelerateInGearFour(4));
    }

}
