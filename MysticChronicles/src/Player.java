import java.util.Scanner;

public class Player {
    private String name;
    private int damage;
    private int health;
    private  int money;
    private  int defHealth;
    private Inventory inventory;
    private boolean[] awards;
    private String[] characterAwards;
    private String[] awardStories;
    private String finalStory;
    private Scanner input = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
        this.awards = new boolean[5]; // 5 ödül alanı
        for (int i = 0; i < awards.length; i++) {
            awards[i] = false;
        }
    }
    public void selectChar(){
        GameCharacters[] characterList ={new Assassin(), new BattlePriest(),new Hunter(),new Knight(),new Samurai()};
        System.out.println(" CHARACTERS ");
        System.out.println();
        for (GameCharacters gameCharacters:characterList){
            System.out.println("Character: "+ gameCharacters.getName()+
                    "\t Armor: "+ this.getInventory().getArmor().getName()+
                    "\t Weapon: "+ this.getInventory().getWeapons().getName()+
                    "\t Health: "+ gameCharacters.getHealth()+
                    "\t Damage: "+gameCharacters.getDamage()+
                    "\t Defence: "+ this.getInventory().getArmor().getDefense()+
                    "\t Money: "+ gameCharacters.getMoney());
        }
        System.out.println();

        System.out.println("Please select a character. Enter 1 for Assassin,2 for Battle Priest,3 for Hunter, 4 for Knight 5 for Samurai.");

        int select = input.nextInt();

        switch(select){
            case 1:
                initPlayer(new Assassin());
                break;
            case 2:
                initPlayer(new BattlePriest());
                break;
            case 3:
                initPlayer(new Hunter());
                break;
            case 4:
                initPlayer(new Knight());
                break;
            case 5:
                initPlayer(new Samurai());
                break;
            default:
                System.out.println("Invalid selection.");
                return;
        }

        System.out.println("Chosen character: "+ this.getName()+
                "\t Health: "+ this.getHealth()+
                "\t Damage: "+this.getDamage()+
                "\t Money: "+ this.getMoney());

    }

    public  void initPlayer(GameCharacters gameCharacters){
        this.setName(gameCharacters.getName());
        this.setDamage((gameCharacters.getDamage()));
        this.setHealth(gameCharacters.getHealth());
        this.setDefHealth(gameCharacters.getHealth());
        this.setMoney(gameCharacters.getMoney());
    }

    public void setCharacterAwards(String[] awards) {
        this.characterAwards = awards;
    }

    public void setAwardStories(String[] stories) {
        this.awardStories = stories;
    }

    public void setFinalStory(String story) {
        this.finalStory = story;
    }

    public String getCharacterAward(int index) {
        return characterAwards[index];
    }

    public boolean hasAward(int index) {
        return awards[index];
    }

    public void setAward(int index, boolean hasAward) {
        this.awards[index] = hasAward;
        System.out.println(awardStories[index]);
        if (allAwardsCollected()) {
            System.out.println(finalStory);
        }
    }

    public boolean allAwardsCollected() {
        for (boolean hasAward : awards) {
            if (!hasAward) {
                return false;
            }
        }
        return true;
    }

    public Inventory getInventory() {
        return inventory;
    }


    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalDamage(){
        return damage+this.getInventory().getWeapons().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
}
