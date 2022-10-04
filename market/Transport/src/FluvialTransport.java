public class FluvialTransport extends Transport {
    private int volume;
    private int maxVolume;

    public FluvialTransport(int distance, int size) {
        super(distance, size);
        this.volume = 0;
        this.maxVolume = 300000;
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
        return this.dimension * this.volume;
    }
}
