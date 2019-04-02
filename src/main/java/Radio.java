public class Radio extends Component {

    private double herzNumber;
    private boolean aMfM;

    public Radio (int volume, String brand, String model,String playing, double herzNumber, boolean aMfM) {
        super(volume, brand, model, playing);
        this.herzNumber = herzNumber;
        this.aMfM = aMfM;
    }
    public double getHerzNumber() {
        return herzNumber;
    }

    public boolean getAMFM() {
        return aMfM;
    }

}
