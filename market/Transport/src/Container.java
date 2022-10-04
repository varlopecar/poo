public class Container {
    private int weight; //weight in kilograms
    private int volume; //volume in cubic meters

    public Container(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
