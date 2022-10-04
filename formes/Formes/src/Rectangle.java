public class Rectangle extends Form {
    private double width;
    private double height;

    public Rectangle(String name, Point center, double area, double perimeter, double width, double height) {
        super(name, center, area, perimeter);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void computeArea() {
        setArea(width * height);
    }

    public void computePerimeter() {
        setPerimeter(2 * (width + height));
    }

    public String toString() {
        return super.toString() + ", " + width + ", " + height;
    }

}
