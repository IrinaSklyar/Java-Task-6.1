package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        StatService statService = new StatService();
        int  sum = statService.totalSum(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(sum);


        int average = statService.findAverageSum(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(average);


        int indexOfMax = statService.findMaxindex(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(indexOfMax);


        int indexOfMin = statService.findMinindex(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(indexOfMin);

        int indexOfHighAverage = statService.findQuantityHighSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(indexOfHighAverage);


        int indexOfLowAverage = statService.findQuantityLowSales(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(indexOfLowAverage);
    }
}











