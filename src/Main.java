import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1. Объявление 4-х массивов с инициализацией без распечатки.");
        int [] array1 = new int [] {1, 2, 3}; //Массив целочисленных значений
        double [] array2 = new double[] {1.57, 7.654, 9.986}; //Массив вещественных значений
        byte [] array3 = {-12, 43, 9, 126, 127, -128}; //Массив, выбранный произвольно без ключевого слова new: целочисленный с типом значений byte
        boolean [] array4 = {true, false, false, true, true}; //Массив, выбранный произвольно без ключевого слова new: целочисленный с типом значений boolean
    }
    public static void task2() {
        System.out.println("Задача 2. Распечатка 4-х массивов:");
        int [] array1 = new int [] {1, 2, 3}; //Массив целочисленных значений
        double [] array2 = new double[] {1.57, 7.654, 9.986}; //Массив вещественных значений
        byte [] array3 = {-12, 43, 9, 126, 127, -128}; //Массив, выбранный произвольно без ключевого слова: целочисленный с типом значений byte
        boolean [] array4 = {true, false, false, true, true}; //Массив, выбранный произвольно без ключевого слова new: целочисленный с типом значений boolean

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1)
                System.out.print(", "); // Установка запятой после каждого числа без установки в конце всего перечисления
        }
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1)
                System.out.print(", ");
        }
        System.out.println("");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i < array3.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i]);
            if (i < array4.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3. Распечатка 4-х массивов в обратном порядке:");
        int [] array1 = new int [] {1, 2, 3}; //Массив целочисленных значений
        double [] array2 = new double[] {1.57, 7.654, 9.986}; //Массив вещественных значений
        byte [] array3 = {-12, 43, 9, 126, 127, -128}; //Массив, выбранный произвольно без ключевого слова: целочисленный с типом значений byte
        boolean [] array4 = {true, false, false, true, true}; //Массив, выбранный произвольно без ключевого слова new: целочисленный с типом значений boolean

        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i > 0)
                System.out.print(", "); // Установка запятой после каждого числа без установки в конце всего перечисления
        }
        System.out.println("");
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println("");
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = array4.length - 1; i >= 0; i--) {
            System.out.print(array4[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4. Изменить нечётные значения элементов массива array1 на чётные и вывести на печать:");
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //Массив целочисленных значений
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] % 2 != 0)
               array1[i] += 1; // Замена нечётных чисел чётными
            System.out.print(array1[i]);
            if (i < array1.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        System.out.println("Вывод на печать с помощью метода Arrays.toString():");
        System.out.println(Arrays.toString(array1));
    }
}