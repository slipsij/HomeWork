package ru.snatkin.task21_1;

public class VoidLeft {

    //todoL создать масиив заполнить эл-ами передать этот масиив на вход туЛефт
    // в методе ту леф делаем смещение
    //переюираем все элементы и от 0 до lenght-1 вместо iого эл-та записываю i+1
    // i=lenght-1 Записываем 0
    //в завис от масиива обычный или ссылочный ту леф либо войд либо возвр массив
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int[] temp;

        System.out.println("Смещение влево");
        temp = toReverse(array);
        printArray(temp);
    }
    public static int[] toLeft(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    public static int[]  toReverse(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
