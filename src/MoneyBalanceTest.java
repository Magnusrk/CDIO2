import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyBalanceTest {
    MoneyBalance m = new MoneyBalance();

    @Test
    void testAddmoney() {
        m.addmoney(-10000);
        assertEquals(0, m.getBalance());
    }
}