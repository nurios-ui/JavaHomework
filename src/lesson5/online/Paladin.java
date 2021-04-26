package lesson5.online;

import lesson5.online.models.Hero;

public class Paladin extends Hero {

    public Paladin(String name, int health, int strength, int attack, int defence) {
        super(name, health, strength, attack, defence);
      //  System.out.println("This is a paladin constructor");
    }

    public void selfDefense() {
        System.out.println(this.name + " defences himself" + this.defence);
    }

    @Override
    public void sleep() {
        System.out.println("Paladin sleeps");
    }
}
