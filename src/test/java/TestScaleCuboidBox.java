import org.junit.Assert;
import org.junit.Test;

public class TestScaleCuboidBox {
    @Test
    public void testCuboid() {
        ScaleCuboidBox scaleCuboidBox = new ScaleCuboidBox(1, 1, 1);
        int volume = (int) scaleCuboidBox.getVolume();
        Assert.assertEquals(1, volume);
    }
}
