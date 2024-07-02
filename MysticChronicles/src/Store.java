public class Store extends SafeLocations{
    public Store(Player player) {
        super(player, "Store");
    }
    @Override
    public boolean LocationStatus() {
        System.out.println("Welcome to the store \n 1 for weapons, \n 2 for armors \n 3 for potions \n 4 for exit. Please enter a select:");
        int select = Location.input.nextInt();

        while (select<1 || select>4 ){
            System.out.println("ya yanlış giriş");
            select = input.nextInt();
        }
        switch (select){
            case 1:
                printWeapons();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                printPotions();
                break;
            case 4:
                System.out.println("see u later my frined");
                return true;
        }
        return true;
    }

    public void printWeapons() {
        System.out.println("wwww");
        for (Weapons w : Weapons.weapon()) {
            System.out.println(w.getDamage() + "price: " + w.getPrice() + "damage" + w.getDamage());
        }

    }
    public void buyWeapon(){
        System.out.println("Chhose a weapon: ");
        int chooseWeaponID = input.nextInt();

        while (chooseWeaponID <1 || chooseWeaponID > Weapons.weapon().length){
            System.out.println("unvadilllld");
            chooseWeaponID = input.nextInt();
        }
        Weapons choosenWeapon = Weapons.getWeaponByID(chooseWeaponID);
        if(choosenWeapon != null){
            if(choosenWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("paran yok knk"+ this.getPlayer().getMoney());
            }
            else {
                System.out.println(choosenWeapon.getName() + "satın aldın affeirm");
                int totalBalance = this.getPlayer().getMoney() - choosenWeapon.getPrice();
                this.getPlayer().setMoney(totalBalance);
                System.out.println("total balance:" + this.getPlayer().getMoney());
                System.out.println("önceki silah+ " + this.getPlayer().getInventory().getWeapons().getName());
                System.out.println("yeni silah");this.getPlayer().getInventory().setWeapons(choosenWeapon);
            }

        }
    }

    public void printArmor(){
        System.out.println("armorss");
    }
    public void printPotions(){
        System.out.println("iksir");
    }
}
