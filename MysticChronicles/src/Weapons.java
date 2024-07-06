public class Weapons {
    private int id;
    private String name;
    private int damage;
    private int price;

    public Weapons(int id, String name, int damage, int price) {
        this.id =id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weapons[] weapon(){
        Weapons[] weaponsList = new Weapons[6];
         weaponsList[0] = new Weapons(1,"Iron Edge",3,5);
        weaponsList[1] = new Weapons(2,"Dark Sword",4,6);
        weaponsList[2] = new Weapons(3,"Dwarf Dagger",4,43);
        weaponsList[3] = new Weapons(4,"Phantom Sniper",3,5);
        weaponsList[4] = new Weapons(5,"Twin Arrow",4,43);
        weaponsList[5] = new Weapons(6,"Twilight Bow",4,43);
        return weaponsList;
    }

    public static Weapons getWeaponByID(int id){
        for (Weapons weapon : Weapons.weapon()){
            if(weapon.getId() == id){
                return weapon;
            }
        }
        return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
