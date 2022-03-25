package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateHackNormal() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1500), 500);
    }

    @Test
    public void shouldCalculateHackMinBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldCalculateNearMinBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1002), 998);
    }

    @Test
    public void shouldCalculateUpperBoard() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1999), 1);
    }

    @Test
    public void shouldCalculateNearUpperBoard() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1998), 2);
    }

    @Test
    public void shouldCalculateUnderThousand() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(900), 100);
    }

    @Test //This block will fall
    public void shouldCalculateBorder() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldCalculateUpperBorder() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(2000), 0);
    }

    @Test
    public void shouldCalculatMultiplyBoundary() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(4000), 0);
    }

    @Test
    public void shouldCalculateZero() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(0), 0);
    }

}