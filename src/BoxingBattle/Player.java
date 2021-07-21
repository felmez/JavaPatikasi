package BoxingBattle;

public class Player {
    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    public Player(String name, int damage, int health, int weight, double dodgeChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodgeChance;
    }

    public int hit(Player foe) {
        System.out.println("------------");
        System.out.println(this.name + " damaged " + foe.name + " " + this.damage + " points.");

        if (foe.dodge()) {
            System.out.println(foe.name + " defended the attack.");
            return foe.health;
        }

        return Math.max(foe.health - this.damage, 0);

    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodgeChance;
    }
}