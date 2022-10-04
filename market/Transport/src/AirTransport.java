public class AirTransport extends Transport {
    private int volume;
    private int maxVolume;

    public AirTransport(int distance, int size) {
        super(distance, size);
        this.volume = 0;
        this.maxVolume = 80000;
    }

    @Override
    public void addContainer(Container container) {
        if (this.volume + container.getVolume() <= this.maxVolume) {
            this.containers[index] = container;
            this.index++;
            this.volume += container.getVolume();
        }
    }

    @Override
    public int getDimension() {
        return this.volume;
    }

    public double computeCost() {
        return 15 * this.distance * this.volume;
    }
}
