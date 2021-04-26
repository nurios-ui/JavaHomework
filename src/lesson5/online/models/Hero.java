package lesson5.online.models;

public abstract class Hero {
    protected String name;
    protected  int health;
    protected  int strength;
    protected  int attack;
    protected  int defence;

    public Hero(String name, int health, int strength, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.defence = defence;
     //   System.out.println("This is a hero constructor");
    }

    public void speak() {
        System.out.println(name + " says hello");
    }

    public void dealDamage() {
        System.out.println(name + " deals " + strength * attack + " damage points");
    }

    public void healSelf() {
        health += 20;
        System.out.println(name + " heals himself & has " + health + " health points");
    }

    public abstract void sleep();

}

