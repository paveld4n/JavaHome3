// Задача 1
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class task3_1 {
    
    public static void main(String[] args) {
        int n = 15;
        Random rd = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(rd.nextInt(0,100));

        }
        System.out.printf("Начальный список \n %s", arr);
        for (int i = n - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.printf("\nФинальный список \n %s", arr);
    }
}
