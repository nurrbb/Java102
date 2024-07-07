import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int money;
    private int totalDamage;
    private Inventory inventory;
    private List<Integer> awards;

    public Player(String name) {
        this.name = name;
        this.health = 100; // Varsayılan değer
        this.money = 0;
        this.totalDamage = 10; // Varsayılan değer
        this.inventory = new Inventory();
        this.awards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage = totalDamage;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Integer> getAwards() {
        return awards;
    }

    public void addAward(int awardIndex) {
        this.awards.add(awardIndex);
    }

    public boolean hasAward(int awardIndex) {
        return this.awards.contains(awardIndex);
    }
}
