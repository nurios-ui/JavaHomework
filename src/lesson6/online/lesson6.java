package lesson6.online;

import java.util.Scanner;

public class lesson6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*String s0 = "Hello_test!";
        String s1 = "Hello_";
        s1 += "test!";

        String s2 = scanner.nextLine();
        String s3 = "Hello_test!";

        System.out.println(s0 == s1);
        System.out.println(s0 == s2);
        System.out.println(s0 == s3);
        System.out.println("_________");

        Object[] abc = new Object[1];
        abc[0] = s0;
        System.out.println(abc);

        System.out.println(s0.equals(s1));
        System.out.println(s0.equals(s2));
        System.out.println(s0.equals(s3));*/

     /*   String exampleString = "Example"; //String exampleString = new String ("Example");

        StringBuilder stringBuilder = new StringBuilder("Example");

        long startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            exampleString += i; // "Example012345678910..."
        }
        float deltaTime = System.nanoTime() - startTime;
        System.out.println(exampleString);
        System.out.println("Work time string: " + deltaTime * 0.000001f + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i); //"Example012345678910..."
        }
        deltaTime = System.nanoTime() - startTime;
        System.out.println(stringBuilder.toString());
        System.out.println("Work time stringBuilder: " + deltaTime * 0.000001f + " ms");
        System.out.println(exampleString.equals(stringBuilder.toString()));

        StringBuffer stringBuffer = new StringBuffer();*/

        LightHero lightHero = new LightHero("LightHero", 5 , 100, 20);
        DarkHero darkHero = new DarkHero("DarkHero", 10 , 150, 5);
        //OrangeHero orangeHero = new OrangeHero("Sunny", 15, 80, 15);

        System.out.println(lightHero.getHeroInfo());
        System.out.println(darkHero.getHeroInfo());
       // System.out.println(orangeHero.getHeroInfo());

        while (!lightHero.isDead() || !darkHero.isDead()) {
            lightHero.attack(darkHero);
            System.out.println(lightHero.getHeroInfo());

            if (darkHero.isDead()) {
                System.out.println("lightHero wins!");
                break;
            }

            darkHero.attack(lightHero);
            System.out.println(darkHero.getHeroInfo());

            if (lightHero.isDead()) {
                System.out.println("DarkHero wins!");
                break;
            }

            lightHero.healSelf();
            darkHero.healSelf();



        }
    }
}
