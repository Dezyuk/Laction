package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    private static final Scanner in = new Scanner(System.in);
    private  static final Random rand = new Random();
    public static void main(String[] args) {
	// write your code here
        task1();
    }
    private static void task1() {
        System.out.print("Введите количество элементов массива > 100\n");
        boolean flag = true;
        int arr_size = 0;
        while (flag) {
            flag = false;
            arr_size = in.nextInt();
            if (arr_size <= 100) {
                flag = true;
                System.out.print("Количество элементов массива должно быть больше 100\n");
            }
        }
        System.out.print("Введите размер блока\n");
        int k = in.nextInt();
        System.out.print("Число перемешиваний \n");
        int n = in.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(501);
        }
        System.out.println(Arrays.toString(arr));
        int id = arr_size / k;
        for (int p = 0; p < n; p++) {
            for (int i = 0; i < id * k; i += k) {
                int index = rand.nextInt(id);
                for (int j = 0; j < k; j++) {
                    int tmp = arr[i + j];
                    arr[i + j] = arr[j + (index * k)];
                    arr[j + (index * k)] = tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
