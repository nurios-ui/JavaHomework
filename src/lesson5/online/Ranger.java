package lesson5.online;

public class Ranger extends Archer{
    public Ranger (String name, int health, int strength, int attack, int defence, int speed) {
        super(name, health, strength, attack, defence, speed);
    }

    public void superAttack(){
        System.out.println(this.name + " super attacked " + this.attack * this.speeed);
    }
}
