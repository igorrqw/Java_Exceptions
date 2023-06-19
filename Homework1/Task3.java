package Homework1;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] firstArray = new int[] {12, 9, 9};
        // int[] secondArray = new int[] {5, 6, 7,}; //Разность элементов.
        int[] secondArray = new int[] {1, 3, 4, 5}; //Длины массивов не равны.
        System.out.println(Arrays.toString(divArrays(firstArray, secondArray)));
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] - secondArray[i];
        }
        return resultArr;
    }

}