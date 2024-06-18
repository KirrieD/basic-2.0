package ru.netology.service.test;


import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackTest {
    @Test
    public void CalcCashbackHackTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = 0;
        int expected = service.remain(amount);

        assertEquals (actual, expected);
    }

}