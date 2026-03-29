package EncapsulationExample;
public class Circle {
    private double PI = 3.14;
    private double radius = 0.0;

    public void setRadius(double r) {
        if (r < 0) {
            System.out.println("Radius cannot be negative. Setting to 0.");
            return;
        } else {
            radius = r;
        }
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
    
}
