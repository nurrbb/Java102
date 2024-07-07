public class Snake extends Enemy{
    private Loot loot;
    public Snake() {
        super(4,"Snake",3,10);
        this.loot =Loot.generateRandomLoot();
    }

    public Loot getLoot() {
        return loot;
    }

    public void setLoot(Loot loot) {
        this.loot = loot;
    }
}
