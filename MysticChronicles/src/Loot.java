import java.util.Random;

public class Loot {
    private int money;
    private String type;
    private Weapons weapons;
    private Armor armor;

    public Loot(Weapons weapon) {
        this.weapons = weapon;
        this.type = "weapon";
    }

    public Loot(Armor armor) {
        this.armor = armor;
        this.type = "armor";
    }

    public Loot(int money) {
        this.money = money;
        this.type = "money";
    }

    public static Loot generateRandomLoot() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        if (chance <= 45) {
            if (chance <= 15) {
                String weaponType = getWeaponType();
                Weapons weapon = Weapons.getRandomWeapon(weaponType);
                return new Loot(weapon);
            } else if (chance <= 30) {
                return new Loot(generateArmor());
            } else {
                return new Loot(generateMoney());
            }
        } else {
            return null;
        }
    }

    private static String getWeaponType() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        if (chance <= 15) {
            return "sword";
        } else if (chance <= 35) {
            return "pistol";
        } else {
            return "rifle";
        }
    }

    private static Armor generateArmor() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        if (chance <= 15) {
            return Armor.getArmorByID(3);
        } else if (chance <= 35) {
            return Armor.getArmorByID(2);
        } else {
            return Armor.getArmorByID(1);
        }
    }

    private static int generateMoney() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        if (chance <= 20) {
            return 10;
        } else if (chance <= 50) {
            return 5;
        } else {
            return 1;
        }
    }

    public void printLoot() {
        switch (type) {
            case "weapon":
                System.out.println("Loot Type: Weapon");
                System.out.println("Weapon Name: " + weapons.getName());
                System.out.println("Weapon Damage: " + weapons.getDamage());
                System.out.println("Weapon Price: " + weapons.getPrice());
                break;
            case "armor":
                System.out.println("Loot Type: Armor");
                System.out.println("Armor Name: " + armor.getName());
                System.out.println("Armor Defense: " + armor.getDefense());
                System.out.println("Armor Price: " + armor.getPrice());
                break;
            case "money":
                System.out.println("Loot Type: Money");
                System.out.println("Amount: " + money);
                break;
            default:
                System.out.println("Unknown loot type.");
                break;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
