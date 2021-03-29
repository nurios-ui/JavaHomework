package lesson1.home;

public class Homework1 {
    public static void main (String[] args) {
        int a = 0;
        int b = 8;
        int c = 4;
        int d = 3;
        float result1;
        String name = "Алексей";
        int year = 1993;

        result1 = task1(a, b, c, d);
        System.out.println(result1);

        task2(a, b);

        task3(a);

        task4(name);

        task5(year);
    }

    public static float task1 (int valueA, int valueB, int valueC, float valueD) {
            return valueA * (valueB + (valueC / valueD));
    }

    public static void task2 (int valueA, int valueB) {
        int sum = valueA + valueB;
        boolean taskCondition = 10 < sum && sum <= 20;
        System.out.println(taskCondition);
       /* if (10 < sum && sum <= 20) {
            System.out.println("true");
        } else {
                System.out.println("false");
            }*/
        }

    public static void task3 (int value) {
        if (value >= 0) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    public static void task4 (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void task5 (float year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Високосный");
            } else {
                System.out.println("Не високосный");
            }
        } else {
            System.out.println("Не високосный");
        }
    }
}
