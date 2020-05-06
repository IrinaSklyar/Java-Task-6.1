package ru.netology.stats;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @org.junit.jupiter.api.Test
    void totalSum() {
        StatService statService = new StatService();
        int expected = 180;
        int actual = statService.totalSum(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);

    }

    @Test
    void findAverageSum() {
        StatService statService = new StatService();
        int expected = 15;
        int actual = statService.findAverageSum(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void findMaxindex() {
        StatService statService = new StatService();
        int expected = 6;
        int actual = statService.findMaxindex(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void findMinindex() {
        StatService statService = new StatService();
        int expected = 9;
        int actual = statService.findMinindex(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityHighSales() {
        StatService statService = new StatService();
        int expected = 5;
        int actual = statService.findQuantityHighSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void findQuantityLowSales() {
        StatService statService = new StatService();
        int expected = 5;
        int actual = statService.findQuantityLowSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }
}


