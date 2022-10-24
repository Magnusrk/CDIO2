import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dieTest {

    die d = new die();
    @Test
    void testThrowDice() {
        for (int i = 0; i < 1000; i++) {
            int[] results = d.throwDice();
            int result = results[0] + results[1];
            int max = d.getDIESIDE()*2;
            int min = results.length;
            System.out.println(result);
            assertTrue(result<=max);
            assertTrue(result>=min);
        }
    }
}