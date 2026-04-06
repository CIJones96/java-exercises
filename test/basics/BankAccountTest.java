import basics.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void testWithdraw() {
        account.withdraw(500.00);
        assertEquals(500.00, account.getBalance(), 0.001);
    }

    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }

    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100));
    }

    @Test
    void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000));
    }
}
