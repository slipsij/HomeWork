package ru.snatkin.task21_1;

import java.util.Arrays;

public class VoidLeft {

    static byte array[] = new byte[]{1, 2, 3, 4, 5, 6};

        public void voidToLeft(int count) {
            synchronized (array) {
                System.arraycopy(array, count, array, 0, array.length - count);
            }
        }

        public static void main(String[] args) {
            System.out.println("First array: " + Arrays.toString(array));
            new VoidLeft().voidToLeft(2);
            System.out.println("After two shift is: " + Arrays.toString(array));
        }
    }
