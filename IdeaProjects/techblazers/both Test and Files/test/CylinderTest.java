package IdeaProjects.techblazers.test;

import cylinder.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    public void testThatCylinderHasHeight(){
        Cylinder cylinder = new Cylinder(5.6, 300);
        assertEquals(5.6, cylinder.getHeight());
    }
    @Test
    public void testThatCylinderHasRadius(){
        Cylinder cylinder = new Cylinder(5.6, 300);
        assertEquals(300, cylinder.getRadius());

    }
    @Test
    public void testThatCylinderHasVolume(){
        Cylinder cylinder = new Cylinder(5.6, 3);
        assertEquals(158.33626956, cylinder.getVolume());
    }


}
