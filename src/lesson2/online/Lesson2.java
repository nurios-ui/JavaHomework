package lesson2.online;

public class Lesson2 {
    public static void main (String[] args) {
       /* int a = 20;
        int b = 10;
        int result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        result = (a > b) ? a : b; // тернарный оператор
        result = (a > b) ? doSomething1() : doSomething2();
        System.out.println("Result " + result);

    }

    public static int doSomething1() {
        return 45;
        }

    public static int doSomething2() {
        return 54;
        }*/

      /*  String name = "Olga";
        if (name == "Boris") {
            System.out.println("Send the letter to Boris");
        } else if (name == "Alex") {
            System.out.println("Send the letter to Alex");
        } else if (name == "Olga") {
            System.out.println("Send the letter to Olga");
        } else {
            System.out.println("Went out");
        }

        System.out.println("----------------");

        switch (name) {
            case "Boris":
                System.out.println("Send the letter to Boris");
                break;
            case "Alex":
                System.out.println("Send the letter to Alex");
                break;
            case "Olga":
                System.out.println("Send the letter to Olga");
                break;
            default:
                System.out.println("Went out");
        }*/

        /*for (int i = 0; i < 10; i++) {
            System.out.print(i + "|");
        }

        System.out.println();
        System.out.println(myMath(2, 10));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println();
            }
        }

        printPifagor(10, 10);*/

      /* int b = 0;

       while (b < 10) {
           b++;
           if (b == 3 || b ==8) {
               continue;
           }
           System.out.print(b + "|");
       }
       System.out.println("\nend while");


        int c = 0;
        do {
            c++;
            System.out.print(c + "|");
            if (c == 7) {
                break;
            }
        } while (c < 10);
        System.out.println("\nend do-while");

       // while (true) {

        } */

   /* int[] array = new int[10];
    array[0] = 55;
    array [1] = 698;
    array [2] = 300;

    System.out.println(array[1] + " " + array[2]);

    String[] strArray = new String[100];

    //for (int i = 0; i < strArray.length; i++) {
      //  strArray[i] = "Value " + i;
    //}
    writeArray("value", strArray);

    /*for (int i = 0; i < strArray.length; i++) {
        System.out.print(strArray[i] + "|");
    }*/
    /*readArray(strArray);

    float[] myFloatArray = {10.5f, 15.9f, 200.987f};
        System.out.print(myFloatArray.length + " {");
    for (int i = 0; i < myFloatArray.length; i++) {
        System.out.print(myFloatArray[i] + ", ");
    }
    System.out.print("}");*/

      int[][] doubleArrayInt = new int[3][4];
      doubleArrayInt[0][1] = 15;
      System.out.println(doubleArrayInt[0][1]);

      int value = 0;

      for (int y = 0; y < doubleArrayInt.length; y++) {
          for (int x = 0; x < doubleArrayInt[y].length; x++) {
                doubleArrayInt[y][x] = value;
                value++;
          }
      }

        for (int y = 0; y < doubleArrayInt.length; y++) {
            for (int x = 0; x < doubleArrayInt[y].length; x++) {
                System.out.print(doubleArrayInt[y][x] + " |");
            }
            System.out.println();
        }

        String[][] arr = {{"1", "2", "3"}, {"5", "6", "7"}};

        int value2 = 0;
        int [][][] arr3 = new int[3][4][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[j].length; k++) {
                    arr3[i][j][k] = value2;
                    value2++;
                }

            }

        }
    }




   /* public static int myMath(int base, int signature) {
        int result = 1;
        for (int i = 0; i < signature; i++) {
            result *= base; //result = result * base;
        }
        return result;
    }

    public static void printPifagor(int width, int height) {
        for (int x = 1; x < width; x++) {
            for (int y =1; y < height; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }


    }*/
  /*  public static void writeArray(String value, String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = value + " " + i;
        }
    }

    public static void readArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "|");
        }
        System.out.println();
    }*/
}


