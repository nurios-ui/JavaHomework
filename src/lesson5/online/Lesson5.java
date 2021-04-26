package lesson5.online;

import lesson5.online.models.Hero;

public class Lesson5 {

    public static void main (String[] args) {

        Paladin paladin = new Paladin( "Rodric", 100, 50, 25, 10);
        Archer archer = new Archer("Robin", 50, 100, 50, 1);
        Mage mage = new Mage("Ksardas", 20, 120, 120, 0);
        Titan titan= new Titan("Lars", 20000, 999, 999, 999);
        Ranger ranger = new Ranger("Legolas", 150, 150, 500, 20, 280);

       /* paladin.speak();
        paladin.dealDamage();
        paladin.healSelf();
        paladin.selfDefense();

        archer.speak();
        archer.dealDamage();
        archer.healSelf();

        mage.speak();
        mage.dealDamage();
        mage.healSelf();
        //mage.health = 999;

        titan.selfDefense();
        titan.healSelf();

        ranger.superAttack();*/

        Hero[] army = {paladin, archer, mage, titan, ranger};
        for (int i = 0; i < army.length; i++) {
            army[i].speak();
            army[i].dealDamage();
            army[i].healSelf();
            //army[i].selfDefense;
            if (army[i] instanceof Ranger) {
                Ranger tmp = (Ranger) army[i];
                tmp.superAttack();
            }
            if (army[i] instanceof Paladin) {
                ((Paladin) army[i]).selfDefense();
            }
            
        }

        Object[] myArray = new Object[4];

        int a = 10;
        String myString = "Hello";
        char b = 'H';

        myArray[0] = a;
        myArray[1] = myString;
        myArray[2] = b;
        myArray[3] = paladin;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] instanceof Paladin) {
                ((Paladin) myArray[i]).dealDamage();
            }
            if (myArray[i] instanceof String) {
                System.out.println(((String) myArray[i]).length());
            }
        }
    }
}
