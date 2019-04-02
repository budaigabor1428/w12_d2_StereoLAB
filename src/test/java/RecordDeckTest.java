import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RecordDeckTest {
    RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck(100, "Blah", "126", "Now playing: ", false);
    }

    @Test
    public void hasPlaySpeed(){
        assertEquals(true, recordDeck.isPlaySpeed());
    }
    @Test
    public void hasVolume () {
        Assert.assertEquals(100, recordDeck.getVolume());
    }

    @Test
    public void hasBrand () {
        Assert.assertEquals("Blah", recordDeck.getBrand());
    }

    @Test
    public void hasModel () {
        Assert.assertEquals("126", recordDeck.getModel());
    }

    @Test
    public void canTurnVolumeDown() {
        recordDeck.changeVolume(10);
        Assert.assertEquals(110, recordDeck.getVolume());
    }

    @Test
    public void canTurnVolumeUp () {
        recordDeck.changeVolume(-10);
        Assert.assertEquals(90, recordDeck.getVolume());
    }

    @Test
    public void canPlayASong () {
        Assert.assertEquals("Now playing Raining Blood", recordDeck.play("Raining Blood"));
    }
}
