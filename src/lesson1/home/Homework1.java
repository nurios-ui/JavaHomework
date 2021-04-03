package lesson1.home;

public class Homework1 {
    public static void main (String[] args) {
        int a = 5;
        int b = 8;
        int c = 4;
        int d = 3;
        //float result1;   без этой переменной можно обойтись
        String name = "Алексей";
        int year = 400;

       // result1 = calc(a, b, c, d);  без этой переменной можно обойтись
        System.out.println("Реультат задания 1: " + calc(a, b, c, d));

        System.out.println("Реультат задания 2: " + interval(a, b));

        if (positNegat(a)) {
            System.out.println("Реультат задания 3: " + "положительное число");
        } else {
            System.out.println("Реультат задания 3: " + "отрицательное число");
        }


        System.out.println("Реультат задания 4: " + greetings(name));

        System.out.println("Реультат задания 5: " + "Год високосный? " + leap(year));
    }

    public static float calc (int valueA, int valueB, int valueC, int valueD) {
            return valueA * (valueB + ((float)valueC / valueD));
    }

    public static boolean interval (int valueA, int valueB) {
        int sum = valueA + valueB;
        return (sum <= 20) && (sum >= 10);
       /* if (10 < sum && sum <= 20) {
            System.out.println("true");
        } else {
                System.out.println("false");
            }*/
        }

    public static boolean positNegat (int value) {
        return value >= 0;
       /* if (value >= 0) {
            System.out.println("Реультат задания 3: " + "положительное число");
        } else {
            System.out.println("Реультат задания 3: " + "отрицательное число");
        }*/
    }

    public static String greetings (String name) {
        return "Привет, " + name + "!";
    }

    /*public static String leap (float year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return "Високосный";
            } else {
                return "Не високосный";
            }
        } else {
            return "Не високосный";
        }
    }*/

    public  static boolean leap (int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0);
    }
}
