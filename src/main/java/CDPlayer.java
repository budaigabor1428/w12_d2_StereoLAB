public class CDPlayer extends Component implements IPlay {

    private int numberOfCds;

    public CDPlayer(int volume, String brand, String model, String playing, int numberOfCds) {
        super(volume, brand, model, playing);
        this.numberOfCds = numberOfCds;
    }

    public int getNumberOfCds () {
        return this.numberOfCds;
    }

    public String play (String song) {
       return playing + song;
    }


}
