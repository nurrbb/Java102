public class Inventory {

    private Weapons weapons;
    //private Armor armor;

    public Inventory(){
        this.weapons = new Weapons(0,"Yumruk",1,0);
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
}