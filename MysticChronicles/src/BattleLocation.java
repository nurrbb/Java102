import java.util.Random;

public class BattleLocation extends Location{

    private Enemy enemy;
    private String award;
    private  int maxEnemy;
    public BattleLocation(Player player, String name, Enemy enemy,String award, int maxEnemy) {
        super(player, name);
        this.enemy =enemy;
        this.award = award;
        this.maxEnemy = maxEnemy;
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

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
    public int randomEnemyNum(){
        Random r = new Random();
        return r.nextInt(3)+1;
    }
    @Override
    public boolean LocationStatus() {
        int enemyNum =this.randomEnemyNum();
        System.out.println("You are at " +this.getName());
        System.out.println("Be careful! There are " +enemyNum+ " " + this.enemy.getName() +" lives here!"  );
        System.out.println("Press F for fight, r for run!");
        String choose = input.nextLine();
        choose = choose.toUpperCase();
        if (choose.equals("F")){

        }
        return true;
    }
}
