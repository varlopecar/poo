public abstract class Form {
    private String name;
    private Point center;
    private double area;
    private double perimeter;

    public Form(String name, Point center, double area, double perimeter) {
        this.name = name;
        this.center = center;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void move(double dx, double dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    abstract public void computeArea();

    abstract public void computePerimeter();

    public String toString() {
        return name + "(" + center + ", " + area + ", " + perimeter + ")";
    }
}
