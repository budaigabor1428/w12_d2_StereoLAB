import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before () {
        cdPlayer = new CDPlayer(100, "Sony", "E28", "Now playing: ", 3);
    }

    @Test
    public void hasVolume () {
        assertEquals(100, cdPlayer.getVolume());
    }

    @Test
    public void hasBrand () {
        assertEquals("Sony", cdPlayer.getBrand());
    }

    @Test
    public void hasModel () {
        assertEquals("E28", cdPlayer.getModel());
    }

    @Test
    public void hasNumberOfCds () {
        assertEquals(3, cdPlayer.getNumberOfCds());
    }

    @Test
    public void canTurnVolumeDown() {
        cdPlayer.changeVolume(10);
        assertEquals(110, cdPlayer.getVolume());
    }

    @Test
    public void canTurnVolumeUp () {
        cdPlayer.changeVolume(-10);
        assertEquals(90, cdPlayer.getVolume());
    }

    @Test
    public void canPlayASong () {
        assertEquals("Now playing: Raining Blood", cdPlayer.play("Raining Blood"));
    }

    @Test
    public void hasPlay() {
        assertEquals("Now playing: ", cdPlayer.playing());
    }

}
