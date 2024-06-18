package ru.netology.service.test;

import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackTest {
    @Test
    public void CalcCashbackHackTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals (actual, expected);
    }

}