package Calculations;

public class Practice {


    public static void main(String[] args) {
        int[] values = {12, 32, 5, 233, 5, 62, 1, 2};

        int sum = 0;
        int maxValue = values[0];
        int minValue = values[0];
        double average;


        for (int value : values) {
            sum += value;
            if (maxValue < value) maxValue = value;
            if (minValue > value) minValue = value;
        }

        average = (double) sum / values.length;
        System.out.println(average);

        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(sum);

    }
}
