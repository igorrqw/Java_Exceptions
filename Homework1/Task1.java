package Homework1;

/*
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class Task1 {
    public static void main(String[] args) {

        System.out.println(division(2, 0)); // ArithmeticException: Деление на ноль невозможно.

        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(getElement(array, 1000, 6)); // ArrayIndexOutOfBoundsException: Индекс выходит за приделы массива.

        String testString = null;
        System.out.println(getLengthOfStr(testString)); // NullPointerException: Обращение к несуществующему объекту.
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int getElement(int[] arr, int index, int element) {
        return arr[index] * element;
    }

    public static int getLengthOfStr(String str) {
        return str.length() * 2;
    }

}