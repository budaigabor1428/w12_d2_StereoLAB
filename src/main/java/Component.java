public abstract class Component {

    private int volume;
    private String brand;
    private String model;
    protected String playing;

    public Component(int volume, String brand, String model, String playing) {
        this.volume = volume;
        this.brand = brand;
        this.model = model;
        this.playing = "Now playing: ";

    }

    public int getVolume() {
        return this.volume;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String playing() {
        return playing;
    }

    public void changeVolume (int level) {
        this.volume += level;
    }

}
