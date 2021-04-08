package lesson2.home;

import java.util.Arrays;

public class HomeWork2 {
    public static void main (String[] args) {
        //Задание 1
        int [] binaryArray =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1};
        /*binaryArray[0] = 1;
        binaryArray[1] = 1;
        binaryArray[2] = 0;
        binaryArray[3] = 0;
        binaryArray[4] = 1;
        binaryArray[5] = 0;
        binaryArray[6] = 1;
        binaryArray[7] = 1;
        binaryArray[8] = 0;
        binaryArray[9] = 0;*/
        System.out.print("Задание 1 до:    ");
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " |");
        }
        System.out.println();
        System.out.print("Задание 1 после: ");
        changeBin(binaryArray);

        //Задание 2
        System.out.println();
        System.out.print("Задание 2: ");
        int size = 8;
        int [] emptyArray = new int[size];
        fullArray(emptyArray);

        //Задание 3
        System.out.println();
        System.out.print("Задание 3: ");
        int []  multiplArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(multiplArray);

        //Задание 4
        int []  onedimArray = {11, 55, 63, 92, 511, 64, 85, 92, 44, 68, 79, 1};
        System.out.println("Задание 4 минимальное значение: " + getMin(onedimArray));
        System.out.println("Задание 4 максимальное значение: " + getMax(onedimArray));

        //Задание 5
        int side = 3;
        int [][] squareArray = new int [side][side];
        System.out.print("Задание 5: ");
        System.out.println();
        diagonal(squareArray);
        displayArray(squareArray);

        //Задание 6
        int[] moveArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Задание 6: " + Arrays.toString(moveArray));
        move (moveArray, -6);
        System.out.println("сдвиг -6:  " + Arrays.toString(moveArray));
        move (moveArray, -3);
        System.out.println("сдвиг +3:  " + Arrays.toString(moveArray));
    }

    //Замена "0" на "1"
    public static void changeBin (int[] binaryArray) {
        for (int i = 0; i < binaryArray.length; i++) {
           /* if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }*/
           // binaryArray[i] = (binaryArray[i] == 1) ? 0:1;
            binaryArray[i] = 1- binaryArray[i];
            System.out.print(binaryArray[i] + " |");
        }
    }

    //Заполнение массива
    public static void fullArray (int[] emptyArray) {
        int x = 1;
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = x;
            x += 3;
            System.out.print(emptyArray[i] + "|");
        }
    }

    //Умножение массива
    public static void multiplication (int[] multiplArray) {
        for (int i = 0; i < multiplArray.length; i++) {
           if (multiplArray[i] < 6) {
                multiplArray[i] *= 2;
            }
            System.out.print(multiplArray[i] + "|");
        }
        System.out.println();
    }

    //Поиск минимума
    public static int getMin (int[] onedimArray) {
        int minValue = onedimArray[0];
        for (int i = 0; i < onedimArray.length; i++) {
            if (minValue > onedimArray[i]) {
                minValue = onedimArray[i];
            }
        }
        return minValue;
    }

    //Поиск максимума
    public static int getMax (int[] onedimArray) {
        int maxValue = onedimArray[0];
        for (int i = 0; i < onedimArray.length; i++) {
            if (maxValue < onedimArray[i]) {
                maxValue = onedimArray[i];
            }
        }
        return maxValue;
    }

    //Заполнение квадратного массива
    public static void  diagonal (int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i][i] = 1;
            squareArray[i][squareArray.length - 1 - i] = 1;
        }
    }

    //Вывод квадратного массва
    public static void displayArray (int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "|");
            }
            System.out.println();
        }
    }

    //Сдвиг элемента в массиве
    public static void move (int[] array, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        }  else {
            direction = false;
        }
        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
             int temp = (direction) ? array[0] : array[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction) {
                    array[j] = array[j + 1];
                } else {
                    array[lastIndex - j] = array[lastIndex - j - 1];
                }
            }
            if (direction) {
                array[lastIndex] = temp;
            } else {
                array[0] = temp;
            }
        }
    }
}
