package ru.netology.stats;

public class StatsService {
    public int sum(int[] data) {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public int avg(int[] data) {
        return sum(data) / data.length;
    }

    public int max(int[] data) {
        int max = 0;
        int i = 0;

        for (int value : data) {
            if (value >= data[max]) {
                max = i;
            }
            i++;

        }
        return max + 1;
    }

    public int min(int[] data) {
        int min = 0;
        int i = 0;
        for (int value : data) {
            if (value <= data[min]) {
                min = i;
            }
            i++;
        }
        return min + 1;

    }

    public int countBelowAvg(int[] data) {

        int n = 0;
        int avg = avg(data);
        for (int value : data) {
            if (value < avg) {
                n++;
            }

        }
        return n;
    }

    public int countUnderAvg(int[] data) {
        int n = 0;
        int avg = avg(data);
        for (int value : data) {
            if (value > avg) {
                n++;
            }
        }
        return n;
    }
}
