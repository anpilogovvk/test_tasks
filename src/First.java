//package com.company;

public class First{

    public static void main(String[] args) {
        int n = 10;
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double average = 0;

        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            average += array[i]/array.length;
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значени = " + min);
        System.out.println("Среднее значение = " + average);

    }
}