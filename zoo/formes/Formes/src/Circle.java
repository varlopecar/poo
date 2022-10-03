public class Circle extends Form {
    private double radius;

    public Circle(String name, Point center, double area, double perimeter, double radius) {
        super(name, center, area, perimeter);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        setArea(Math.PI * radius * radius);
    }

    public void computePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }

    public String toString() {
        return super.toString() + ", " + radius;
    }
}
