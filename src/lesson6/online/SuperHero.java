package lesson6.online;

public abstract class SuperHero {

    protected String name;
    protected int attack;
    protected float health;
    protected int defence;

    public SuperHero(String name, int attack, float health, int defence) {
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.defence = defence;
    }

    public void attack(SuperHero hero) {
        float dealDamage = this.attack - ((float)this.attack / hero.defence);
        if (!hero.isDead()) {
            hero.health -= dealDamage;
            System.out.println(this.name + " deal damage " + hero.name + " >> " + dealDamage + " dmg.HP "
                    + hero.name + " = " + hero.health);
        } else {
            System.out.println(hero.name + " is dead " + hero.isDead());
        }
    }

    public void healSelf() {
        float summaryHeal = 0.1f * this.defence;
        this.health += summaryHeal;
        System.out.println(this.name + " heal self " + summaryHeal);
    }

    public boolean isDead() {
        return this.health <=0;
    }

    public String getHeroInfo() {
        return name + " HP: " + health;
    }

}