public abstract class Transport {
    protected Container [] containers;
    protected int index;
    protected int distance;
    protected int dimension;

    public Transport(int distance, int size) {
        this.containers = new Container[size];
        this.index = 0;
        this.distance = distance;
        this.dimension = 0;
    }

    public abstract void addContainer(Container container);

    public abstract int getDimension();

    public abstract double computeCost();
}
