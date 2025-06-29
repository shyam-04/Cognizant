import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void testFreezingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32.0, converter.toFahrenheit(0), 0.001);
    }

    @Test
    public void testBoilingPoint() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(212.0, converter.toFahrenheit(100), 0.001);
    }

    @Test
    public void testNegativeCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(14.0, converter.toFahrenheit(-10), 0.001);
    }
}
