// Задача 2
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class task3_2 {
    public static void main(String[] args) {
        int n = 15;
        Random rd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(-100, 100));
        }
        System.out.printf("Заданный список\n %s", arr);
        arr.sort(null);
        System.out.printf("\nОтсортированный список\n %s", arr);
        System.out.printf("\nМинимальное \n %s", arr.get(0));
        System.out.printf("\nМаксимальное \n %s", arr.get(n-1));
        System.out.printf("\nСреднее \n %s", arr.get((n-1)/2));
        float count = 0;
        for (int item : arr) {
            count += item;
        }
        System.out.printf("\nСумма всех элементов списка\n %s", count);
        System.out.printf("\nСреднее арифметическое\n %.2f", count / n);
    }
}
