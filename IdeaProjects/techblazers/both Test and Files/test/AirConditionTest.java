import ac.AirCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
private AirCondition airCondition;
@BeforeEach
public void setUp() {
    airCondition = new AirCondition();
}
    @Test

public void testThatWhenISwitchOnAirConditionTurnsOn() {
    assertEquals("ON", airCondition.switchOnAirCondition("ON"));
}
@Test
public void testThatOnlyOnButtonCanSwitchOnAirCondition() {
    assertEquals("OFF", airCondition.switchOnAirCondition("Decrease"));
}
@Test
    public void testThatWhenISwitchOffAirConditionTurnsOff() {
    assertEquals("ON", airCondition.switchOnAirCondition("ON"));
    assertEquals("OFF", airCondition.switchOffAirCondition("OFF"));
}
@Test
public void testThatOnlyOffButtonCanSwitchOffAirCondition() {
    assertEquals("ON", airCondition.switchOnAirCondition("ON") );
    assertEquals("ON", airCondition.switchOffAirCondition("Decrease"));
    assertEquals("OFF", airCondition.switchOffAirCondition("OFF"));

}

@Test
    public void testThatAirConditionCanIncreaseTemperature() {
    assertEquals("ON", airCondition.switchOnAirCondition("ON"));
    assertEquals(17, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(18, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals("OFF", airCondition.switchOnAirCondition("OFF"));
}
@Test
    public void testThatAirConditionCanDecreaseTemperature() {
    assertEquals("ON", airCondition.switchOnAirCondition("ON"));
    assertEquals(17, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(16, airCondition.DecreaseAirConditionTemperature(1));
    assertEquals(16, airCondition.DecreaseAirConditionTemperature(1));
    assertEquals(16, airCondition.DecreaseAirConditionTemperature(1));
    assertEquals("OFF", airCondition.switchOnAirCondition("OFF"));
}
@Test
    public void testThatAirConditionWillNotIncreaseTemperatureBeyondRange() {
    assertEquals("ON", airCondition.switchOnAirCondition("ON"));
    assertEquals(17, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(18, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(19, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(20, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(21, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(22, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(23, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(24, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(25, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(26, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(27, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(28, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(29, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(30, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(30, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(30, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals("OFF", airCondition.switchOnAirCondition("OFF"));
}
@Test
    public void testThatAirConditionWillNotDecreaseTemperatureBeyondRange() {
    assertEquals("ON", airCondition.switchOnAirCondition("ON"));
    assertEquals(17, airCondition.IncreaseAirConditionTemperature(1));
    assertEquals(16, airCondition.DecreaseAirConditionTemperature(1));
    assertEquals(16, airCondition.DecreaseAirConditionTemperature(1));
    assertEquals("OFF", airCondition.switchOnAirCondition("OFF"));
}

}