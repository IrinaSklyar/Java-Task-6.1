package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        StatService statService = new StatService();
        int sum = 0;
        sum = statService.totalSum(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(sum);

        int currentMax = 0;
        currentMax = statService.findMax(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(currentMax);

        int currentMin = 0;
        currentMin = statService.findMin(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(currentMin);

        int average = 0;
        average = statService.findAverageSum(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(average);

        int indexOfMax = 0;
        indexOfMax = statService.findMaxindex(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(indexOfMax);

        int indexOfMin = 0;
        indexOfMin = statService.findMinindex(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(indexOfMin);

        int lowAverage = 0;
        lowAverage = statService.findIndexLowAverage(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.print(lowAverage);

        int indexOfHighAverage = 0;
        indexOfHighAverage = statService.findIndexHighAverage(new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(indexOfHighAverage);

    }
}











