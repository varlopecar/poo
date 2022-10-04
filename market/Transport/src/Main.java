public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000, 1000);
        Container container2 = new Container(43000, 12000);
        Transport transport = new FluvialTransport(35000, 10);
        transport.addContainer(container);
        transport.addContainer(container2);

        System.out.println(transport.computeCost());
    }
}