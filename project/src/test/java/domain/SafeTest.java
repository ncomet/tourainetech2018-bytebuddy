package domain;

import frameworks.security.impl.BuddySafe;
import frameworks.security.interfaces.Safe;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SafeTest {

    @Test
    public void testAllowedUser() throws Exception {
        Safe buddySafe = new BuddySafe("4b26e049-14f8-4f40-b742-aab87f0f560f");
        Bank bank = buddySafe.safeInstance(Bank.class);

        final Double total = bank.bankAccountTotal();

        assertThat(total).isNotNull();
        System.out.println(total);
    }

}
