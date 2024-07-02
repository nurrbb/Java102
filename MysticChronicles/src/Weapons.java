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
        Weapons[] weaponsList = new Weapons[3];
         weaponsList[0] = new Weapons(1,"yav bakçaz",3,43);
        weaponsList[1] = new Weapons(2,"yav fgv",3,43);
        weaponsList[2] = new Weapons(3,"yav bakçaz",3,43);
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
