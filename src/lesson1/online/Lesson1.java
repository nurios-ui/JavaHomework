package lesson1.online;

public class Lesson1 {
    public static void main (String[] args) {
      /*  System.out.println("Here I am");

        //целочисленные
        byte myBite = 34; //1 byte = {-128...+127}
        short myShort = 350; //2 byte = {-32000..+32000}
        int myInt = 2500000; //4 byte = {-2*10^9..+2*10^9}
        long myLong = 3500000000L; //8 byte = {-2^63..+2^63}

        //с плавающей запятой
        float myFloat = 15.86f; //4 byte = {value.0000000}
        double myDouble = 15.86; //8 byte = {value.00000000000000}

        //логическая переменная
        boolean myBoolean = false;//true 1b

        //символы
        char myChar = 'T'; //2b
        int valueTest1 = 74;
        char valueChar = (char) valueTest1;
        int valueInteger = myChar;
        System.out.println(valueTest1);
        System.out.println(valueChar);
        System.out.println(valueInteger);

        //String
        String myString1 = "wedrgyhujhngfvdsa&^%$%^&";
        String myString2 = "HELLO";
        System.out.println(myString1 + myString2);
        System.out.println( 1 + " - this is one");

        float test1 = 15;
        System.out.println(test1); */

       // int a = 15;
        //float b = 4;
        //float result = a / b;
        //System.out.println(a / b); //3.75

       /* int abc = 1;
        abc += 11; //abc = abc + 11;
        System.out.println(abc);

        int cde = 121;
        cde++; //cde = cde + 1;
        cde--;
        System.out.println(cde); */

       /* int a = 10;
        if (a > 10) {
            System.out.println("ok");
        } else {
            System.out.println("not ok!");
        }

        int b = 20;
        if (b < 5) {
            System.out.println("b = ok");
        } */

        /*int age = 65;

        if (age < 18) {
            System.out.println("Too young");
        } else if (age > 60) {
            System.out.println("Care about your health!");
        } else {
            System.out.println("Thank you");
        } */

        int a = 45;
        int b = 30;
        int result;

        //result = a + b;
        result = myMath(a, b);
        a++;
        result = myMath(a, b);
        b++;
        result = myMath(a, b);
        a++;
        result = myMath(a, b);

        System.out.println(result); //78
    }

    public static int myMath(int valueA, int valueB) {
    return valueA + valueB;
    }
}


