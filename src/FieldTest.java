import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
    Field field = new Field();
    @Test
    void testFieldGet() {
        for (int i = 2; i < 1000; i++) {
            System.out.println(i);
            assertTrue(field.fieldGet(i)<=12);
            assertTrue(field.fieldGet(i)>=2);
        }
    }
}