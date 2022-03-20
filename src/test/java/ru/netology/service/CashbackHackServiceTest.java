package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateHackNormal() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(500, service.remain(1500));
    }

    @Test
    public void shouldCalculateHackMinBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldCalculateNearMinBorder() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(998, service.remain(1002));
    }
    @Test
    public void shouldCalculateUpperBoard() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1, service.remain(1999));
    }

    @Test
    public void shouldCalculateNearUpperBoard() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(2, service.remain(1998));
    }

    @Test
    public void shouldCalculateBorder() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldCalculateUpperBorder() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(2000));
    }

    @Test
    public void shouldCalculatMultiplyBoundary() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(4000));
    }

    @Test
    public void shouldCalculateZero() {  //here we have Error
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(0));
    }
}