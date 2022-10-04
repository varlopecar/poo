public class RouteTransport extends WeightTransport {
    public int maxWeight;
    public int weight;

    public RouteTransport(int distance, int size) {
        super(distance, size);
        this.maxWeight = 38000;
    }

    @Override
    public void addContainer(Container container) {
        if (this.weight + container.getWeight() <= this.maxWeight) {
            this.containers[index] = container;
            this.index++;
            this.weight += container.getWeight();
        }
    }

    @Override
    public int getDimension() {
        return this.dimension;
    }

    @Override
    public double computeCost() {
        return 5 * this.distance * this.weight;
    }
}
