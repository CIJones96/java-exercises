import basics.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Chris", 1000.00);
    }

    @Test
    void testInitialBalance() {
        assertEquals(1000.00, account.getBalance(), 0.001);
    }

    @Test
    void testDeposit() {
        account.deposit(500.00);
        assertEquals(1500.00, account.getBalance(), 0.001);
    }
}
