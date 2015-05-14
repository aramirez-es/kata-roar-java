import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.kata.Dist;

public class DistTest {
    @Test
    public void foobar() {
        Dist dist = new Dist();
        assertEquals("Bar", dist.foo());
    }
}