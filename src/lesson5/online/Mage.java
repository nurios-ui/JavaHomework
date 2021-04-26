package lesson5.online;

import lesson5.online.models.Hero;

public final class Mage extends Hero {

    public Mage(String name, int health, int strength, int attack, int defence) {
        super(name, health, strength, attack, defence);
     //   System.out.println("This is a mage constructor");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println( this.name + " says I have a hat.");
    }

    @Override
    public void sleep() {
        System.out.println("Mage sleeps");
    }
}
