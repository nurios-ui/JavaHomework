package lesson5.online;

import lesson5.online.models.Hero;

public class Archer extends Hero {

    protected int speeed;

        public Archer(String name, int health, int strength, int attack, int defence) {
            super(name, health, strength, attack, defence);
            //System.out.println("This is an archer constructor");
        }

    public Archer(String name, int health, int strength, int attack, int defence, int speed) {
        super(name, health, strength, attack, defence);
        this.speeed = speed;
    }

    @Override
    public void sleep() {
        System.out.println("Archer sleeps");
    }

 /*       void speak() {
            System.out.println(name + " says hello");
        }

        void dealDamage() {
            System.out.println(name + " deals " + strength * attack + " damage points");
        }

        void healSelf() {
            health += 20;
            System.out.println(name + " heals himself & has " + health + " health points");
        }*/
}


