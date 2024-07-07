import java.util.Random;
import java.util.Scanner;

public class BattleLocation extends Location {

    private Enemy enemy;
    private int awardIndex;
    private int maxEnemy;
    private boolean lootEnabled;

    public BattleLocation(Player player, String name, Enemy enemy, int awardIndex, int maxEnemy, boolean lootEnabled) {
        super(player, name);
        this.enemy = enemy;
        this.awardIndex = awardIndex;
        this.maxEnemy = maxEnemy;
        this.lootEnabled = lootEnabled;
    }

    public int getMaxEnemy() {
        return maxEnemy;
    }

    public void setMaxEnemy(int maxEnemy) {
        this.maxEnemy = maxEnemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public int getAwardIndex() {
        return awardIndex;
    }

    public void setAwardIndex(int awardIndex) {
        this.awardIndex = awardIndex;
    }

    public boolean isLootEnabled() {
        return lootEnabled;
    }

    public void setLootEnabled(boolean lootEnabled) {
        this.lootEnabled = lootEnabled;
    }

    public int enemyNum() {
        Random r = new Random();
        return r.nextInt(3) + 1;
    }

    @Override
    public boolean LocationStatus() {
        if (this.getPlayer().hasAward(awardIndex)) {
            System.out.println("You have already collected the award from " + this.getName() + ". You cannot enter this location again.");
            return false;
        }
        int enemyNum = this.enemyNum();
        System.out.println();
        System.out.println("You are at " + this.getName());
        System.out.println("Be careful! There are " + enemyNum + " " + this.enemy.getName() + " lives here!");
        System.out.println("Press F for fight, R for run!");
        String choose = input.nextLine().toUpperCase();
        if (choose.equals("F") && combat(enemyNum)) {
            System.out.println("Defeated all enemies in " + this.getName());
            awardPlayer();
            return true;
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You died");
            return false;
        }
        return true;
    }

    public boolean combat(int enemyNum) {
        for (int i = 1; i <= enemyNum; i++) {
            this.getEnemy().setHealth(this.getEnemy().getDefHealth());
            playerStatus();
            enemyStatus(i);
            while (this.getPlayer().getHealth() > 0 && this.getEnemy().getHealth() > 0) {
                System.out.println("Press H for hit, R for run!");
                String chooseCombat = input.nextLine().toUpperCase();
                if (chooseCombat.equals("H")) {
                    Random random = new Random();
                    int start = random.nextInt(2);
                    if (start == 0) {
                        System.out.println("You hit first.");
                        this.getEnemy().setHealth(this.getEnemy().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        System.out.println("Enemy attacked!");
                        int enemyDamage = this.getEnemy().getDamage() - this.getPlayer().getInventory().getArmor().getDefense();
                        if (enemyDamage < 0) {
                            enemyDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getEnemy().getDamage());
                    } else {
                        System.out.println("Enemy attacked first!");
                        int enemyDamage = this.getEnemy().getDamage() - this.getPlayer().getInventory().getArmor().getDefense();
                        if (enemyDamage < 0) {
                            enemyDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getEnemy().getDamage());
                        afterHit();
                        System.out.println("You hit.");
                        this.getEnemy().setHealth(this.getEnemy().getHealth() - this.getPlayer().getTotalDamage());
                    }
                    playerStatus();
                    enemyStatus(i);
                } else {
                    System.out.println("You ran away!");
                    return false;
                }
            }
            if (this.getPlayer().getHealth() <= 0) {
                return false;
            }
        }
        return true;
    }

    public void awardPlayer() {
        if (lootEnabled) {
            Loot loot = Loot.generateRandomLoot();
            if (loot != null) {
                loot.printLoot();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Would you like to use the loot? (yes/no)");
                String response = scanner.nextLine().toLowerCase();
                if (response.equals("yes")) {
                    if (loot.getType().equals("weapon")) {
                        this.getPlayer().getInventory().addWeapon(loot.getWeapons());
                    } else if (loot.getType().equals("armor")) {
                        this.getPlayer().getInventory().addArmor(loot.getArmor());
                    } else if (loot.getType().equals("money")) {
                        this.getPlayer().setMoney(this.getPlayer().getMoney() + loot.getMoney());
                    }
                    System.out.println("Loot added to your inventory.");
                } else {
                    System.out.println("You chose not to use the loot.");
                }
            } else {
                System.out.println("No loot available.");
            }
        }
        this.getPlayer().addAward(awardIndex);
    }

    public void playerStatus() {
        System.out.println("Player Health : " + this.getPlayer().getHealth());
        System.out.println("Player Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Player Armor : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Player Money : " + this.getPlayer().getMoney());
    }

    public void enemyStatus(int enemyNum) {
        System.out.println("Enemy Health : " + this.getEnemy().getHealth());
        System.out.println("Enemy Damage : " + this.getEnemy().getDamage());
        System.out.println("Enemy " + enemyNum + " Health : " + this.getEnemy().getHealth());
    }

    public void afterHit() {
        if (this.getEnemy().getHealth() <= 0) {
            System.out.println("You defeated the enemy.");
        } else if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You have been defeated.");
        }
    }
}
