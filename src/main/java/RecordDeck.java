public class RecordDeck extends Component implements IPlay {

    private boolean playSpeed;

    public RecordDeck(int volume, String brand, String model, String playing, boolean playSpeed){
        super(volume, brand, model, playing);
        this.playSpeed = playSpeed;
    }

    public boolean isPlaySpeed() {
        return playSpeed;
    }

    public String play (String song) {
        return playing + song;
    }
}
