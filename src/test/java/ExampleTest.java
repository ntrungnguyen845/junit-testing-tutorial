import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    //method to test isInteger
    @Test
    public void testIsInteger() {
        Assertions.assertTrue(Main.isInteger("1.2"));
    }

}
