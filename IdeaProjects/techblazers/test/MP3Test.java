import mp3.MP3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MP3Test {
    private MP3 mp3;
    @BeforeEach
    void setUp() {
        mp3 = new MP3();
    }
    @Test
    public void testOn() {
    assertEquals(true, mp3.switchOnAndOffMp3(true));
    }
}
