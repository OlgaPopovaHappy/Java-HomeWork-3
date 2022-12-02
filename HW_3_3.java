/* 3. Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее из этого списка.*/

import java.util.ArrayList;
import java.util.Collections;

public class HW_3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 33,66,99,11,44,77,22,55,88);
        double sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Cписок чисел: " + numbers);
        System.out.println("Минимальное число: " + Collections.min(numbers));
        System.out.println("Максимальное число: " + Collections.max(numbers));
        System.out.println("Среднеарифметическое: " + sum/numbers.size());
    }
}
