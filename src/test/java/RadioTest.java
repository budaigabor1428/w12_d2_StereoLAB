import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void before(){
        radio = new Radio(50, "Pure", "g126", "Now playing: ", 324.4, true);

    }
    @Test
    public void hasHerzNumber(){
        assertEquals(200.10, radio.getHerzNumber());
    }
    @Test
    public void hasAMFM(){
        assertEquals(true, radio.getAMFM());
    }


    @Test
    public void hasVolume () {
        Assert.assertEquals(50, radio.getVolume());
    }

    @Test
    public void hasBrand () {
        Assert.assertEquals("Pure", radio.getBrand());
    }

    @Test
    public void hasModel () {
        Assert.assertEquals("g126", radio.getModel());
    }

    @Test
    public void canTurnVolumeDown() {
        radio.changeVolume(10);
        Assert.assertEquals(60, radio.getVolume());
    }

    @Test
    public void canTurnVolumeUp () {
        radio.changeVolume(-10);
        Assert.assertEquals(40, radio.getVolume());
    }
}
