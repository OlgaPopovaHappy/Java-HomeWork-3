/* 2. Пусть дан произвольный список целых чисел,
удалить из него четные числа */

import java.util.ArrayList;
import java.util.Collections;

public class HW_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Collections.addAll(number, 1,4,7,2,5,8,3,6,9);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 == 0){
            number.remove(number.get(i));
            }
        }
        System.out.println(number);
    }
}
