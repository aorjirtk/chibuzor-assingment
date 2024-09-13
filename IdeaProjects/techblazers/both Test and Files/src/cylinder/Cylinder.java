package cylinder;

public class Cylinder {
    double height;
    double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public double getHeight() {
        if(height > 1) {
            return height;
        }else
            return 1;
    }
    public double getRadius() {
        if(radius > 1) {
            return radius;
        }else
            return 1;
    }
    public double getVolume() {
        return 3.14159265 * height * (radius * radius);
    }


}
