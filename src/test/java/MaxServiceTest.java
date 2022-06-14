import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {
    @Test
    public void shouldFindMax() {
        MaxService service = new MaxService();

        int a = 5;
        int b = 3;

        int expected = 3;
        int actual = service.max(a, b);

        assertEquals(expected, actual);
    }
}
