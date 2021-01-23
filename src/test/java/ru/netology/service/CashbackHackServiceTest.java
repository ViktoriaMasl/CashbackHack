package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCashbackMoreThanThousand() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldCashbackLessThanThousand() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldCashbackThanOneRub() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldCashbackEquallyThousand() {
        assertEquals(service.remain(1000), 0);
    }
}