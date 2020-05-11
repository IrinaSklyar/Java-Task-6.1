package ru.netology.stats;

public class StatService {

    public int totalSum(int[] volumeOfSales) {
        int sum = 0;
        for (int volumeOfSale : volumeOfSales)
            sum = sum + volumeOfSale;
        return sum;
    }


    public int findAverageSum(int[] volumeOfSales) {
        int sum = totalSum(volumeOfSales);
        return sum / volumeOfSales.length;
    }

    public int findMaxindex(int[] volumeOfSales) {
        int indexOfMax = 0;
        for (int i = 1; i < volumeOfSales.length; i++)
            if (volumeOfSales[i] > volumeOfSales[indexOfMax])
                indexOfMax = i;
        return indexOfMax + 1;
    }

    public int findMinindex(int[] volumeOfSales) {
        int indexOfMin = 0;
        for (int i = 1; i < volumeOfSales.length; i++)
            if (volumeOfSales[i] < volumeOfSales[indexOfMin])
                indexOfMin = i;
        return indexOfMin + 1;
    }

    public int findQuantityHighSales(int[] volumeOfSales) {
        int average = findAverageSum(volumeOfSales);
        int indexOfHighAverage = 0;
        for (int i = 0; i < volumeOfSales.length; i++)
            if (volumeOfSales[i] > average)
                indexOfHighAverage++;
        return indexOfHighAverage;
    }

    public int findQuantityLowSales(int[] volumeOfSales) {
        int average = findAverageSum(volumeOfSales);
        int indexOfLowAverage = 0;
        for (int i = 0; i < volumeOfSales.length; i++)
            if (volumeOfSales[i] < average)
                indexOfLowAverage++;
        return indexOfLowAverage;
    }
}











