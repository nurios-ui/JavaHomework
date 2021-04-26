package lesson5.online;

public class Titan extends Paladin {
    public Titan (String name, int health, int strength, int attack, int defence) {
        super(name, health, strength, attack, defence);
    }

    @Override
    public void healSelf() {
        System.out.println(this.name + " cant heal!");
    }
}
