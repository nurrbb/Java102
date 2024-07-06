public class Inventory {

    private Weapons weapons;
    private Armor armor;

    public Inventory(){
        this.weapons = new Weapons(-1,"Fist",1,0);
        this.armor = new Armor(-1,"Worn Vest",1,0);
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
