public class Inventory {

    private Weapons weapons;

    public Inventory(){
        this.weapons = new Weapons(0,"yımrıh",1,0);
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }
}
