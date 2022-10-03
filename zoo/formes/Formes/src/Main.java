public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Cercle", new Point(0, 0), 0, 0, 1);
        Rectangle r = new Rectangle("Rectangle", new Point(0, 0), 0, 0, 1, 2);

        c.computeArea();
        c.computePerimeter();
        r.computeArea();
        r.computePerimeter();

        System.out.println(c);
        System.out.println(r);
    }
}