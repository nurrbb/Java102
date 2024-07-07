public class Scorpion extends Enemy{
    private Loot loot;
    public Scorpion() {
        super(5,"crocodile",3,10);
        this.loot = Loot.generateRandomLoot();
    }

    public Loot getLoot() {
        return loot;
    }

    public void setLoot(Loot loot) {
        this.loot = loot;
    }
}
