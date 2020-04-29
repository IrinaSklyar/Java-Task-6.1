package ru.netology.stats;

public class StatService {
    public int totalSum(int[] volumeOfSales) {
        int sum = 0;
        for (int volumeOfSale : volumeOfSales)
            sum = sum + volumeOfSale;
        return sum;
    }

    public int findMax(int[] volumeofSales) {
        int currentMax = volumeofSales[0];
        for (int num : volumeofSales) {
            if (num > currentMax) {
                currentMax = num;
            }
        }
        return currentMax;
    }

    public int findMin(int[] volumeofSales) {
        int currentMin = volumeofSales[0];
        for (int num : volumeofSales) {
            if (num <= currentMin) {
                currentMin = num;
            }
        }
        return currentMin;
    }

    public int findAverageSum(int[] volumeofSales) {
        int average = 0;
        int sum = 0;
        for (int volumeOfSale : volumeofSales)
            sum = sum + volumeOfSale;
        average = sum / volumeofSales.length;
        return average;
    }

    public int findMaxindex(int[] volumeofSales) {
        int indexOfMax = 0;
        for (int i = 1; i < volumeofSales.length; i++)
            if (volumeofSales[i] > volumeofSales[indexOfMax])
                indexOfMax = i;
        return indexOfMax;
    }

    public int findMinindex(int[] volumeofSales) {
        int indexOfMin = 0;
        for (int i = 1; i > volumeofSales.length; i++)
            if (volumeofSales[i] < volumeofSales[indexOfMin])
                indexOfMin = i;
        return indexOfMin;
    }

    public int findIndexLowAverage(int[] volumeofSales) {
        int average = 0;
        int sum = 0;
        for (int volumeOfSale : volumeofSales)
            sum = sum + volumeOfSale;
        average = sum / volumeofSales.length;
        int indexOfLowAverage = 0;
        for (int i : volumeofSales)
            if (i < average)
                i = indexOfLowAverage;
            return indexOfLowAverage;
        }
    public int findIndexHighAverage(int[] volumeofSales) {
        int average = 0;
        int sum = 0;
        for (int volumeOfSale : volumeofSales)
            sum = sum + volumeOfSale;
        average = sum / volumeofSales.length;
        int indexOfHighAverage = 0;
           for (int i=0; i<volumeofSales.length;i++)
            if (volumeofSales [i] > average)
                indexOfHighAverage = i;
            return indexOfHighAverage;
    }
            }






