/*
  Задание № 15
 Необходимо написать программу для сортировки данных массива по возрастанию.
Использовать пузырьковый метод сортировки.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте длину массива: ");
        int n = scan.nextInt();
        int mas[] = new int[n];
        for (int q = 0; q < n; q++) {
            System.out.print("Присвойте число элементу массива [" + (q+1) +"] :");
            mas[q] = scan.nextInt();
        }
        boolean isSorted = false;
        int buf;
        System.out.println("Массив до сортировки:" + Arrays.toString(mas));
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массиив" + Arrays.toString(mas));
    }
}