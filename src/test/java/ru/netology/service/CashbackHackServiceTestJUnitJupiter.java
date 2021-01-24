package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTestJUnitJupiter {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCashBackCheck() {
        assertEquals(1, service.remain(999));
        assertEquals(999, service.remain(1001));
        assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldCashBackNotNeeded() {
        assertEquals(0, service.remain(1000));
    }
}
