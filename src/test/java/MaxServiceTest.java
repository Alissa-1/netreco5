import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {
    @Test
    public static void main(String[] args) {
        MaxService service = new MaxService();

        int a = 5;
        int b = 3;

        int expected = 5;
        int actual = service.max(a, b);

        assertEquals(expected, actual);
    }
}
