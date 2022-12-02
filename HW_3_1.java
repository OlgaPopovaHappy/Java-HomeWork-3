/* 1. Реализовать алгоритм сортировки слиянием */

public class HW_3_1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 5, 8, 3, 6, 9};
        mergeSort(arr); //метод деления

        for (int i = 0; i < arr.length; i++) { // выводем на экран отсортированный массив
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int len = arr.length; // присваиваем длину массива
        if ( len == 1 ) return; // здесь деление останавливается и начинаем слияние
        int mid = len/2; // узнаем середину масива

        int[] l = new int[mid]; //  левая часть массива
        int[] r = new int[len - mid]; //правая часть массива

        for (int i = 0; i < mid; i++) { //копируем массив в левую часть
            l[i] = arr[i]; // всю левую часть массива присваиваем к l
        }
        for (int i = mid; i < len; i++) {//копируем массив в правую часть
            r[i - mid] = arr[i];  // остальную часть массива присваиваем к r
        }
        mergeSort(l); // аналогично делим левую
        mergeSort(r); // и правую части
        merge(arr, l, r); // вызываем функцию для слияния
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length; // выделяем две переменные
        int rigth = r.length;
        int i = 0; // i отвечает за левую часть
        int j = 0; // j отвечает за правую часть
        int idx = 0; // индекс массива

        while (i < left && j < rigth){
            if (l[i] < r[j]){
                arr[idx] = l[i];
                i++;
                idx++;
            }else{
                arr[idx] = r[j];
                j++;
                idx++;
            }
        }
        // если есть остатки
        for (int ll = i; ll < left; ll++)  // сохраняем остатки из левой части
            arr[idx++] = l[ll];

            for (int rr = j; rr < rigth; rr++)  // сохраняем остатки из правой части
                arr[idx++] = r[rr];
    }

}
