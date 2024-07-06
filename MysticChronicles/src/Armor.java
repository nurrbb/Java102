public class Armor {
    private int id;
    private  String name;
    private int defense;
    private int price;

    public Armor(int id, String name, int defense, int price) {
        this.id = id;
        this.name = name;
        this.defense = defense;
        this.price = price;
    }

    public static Armor[] armor(){
        Armor[] armorList = new Armor[4];
        armorList[0] = new Armor(1,"Padded Armor",4,5);
        armorList[1] = new Armor(2,"Huntsman Leather", 5,23);
        armorList[2] = new Armor(3,"Steel Vanguar",5,32);
        armorList[3] = new Armor(4,"Dragonskin West", 6,32);

        return armorList;
    }
    public static Armor getArmorByID(int id){
        for(Armor armor: Armor.armor()){
            if(armor.getId() == id){
                return armor;
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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
