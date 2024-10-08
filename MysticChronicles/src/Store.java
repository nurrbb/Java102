public class Store extends SafeLocations {
    public Store(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean LocationStatus() {
        System.out.println("Welcome to the store \n 1 for weapons, \n 2 for armors  \n 3 for exit. Please enter a select:");
        boolean showMenu = true;
        while (showMenu) {
            int select = Location.input.nextInt();

            while (select < 1 || select > 3) {
                System.out.println("Invalid select. Please try again.");
                select = input.nextInt();
            }
            switch (select) {
                case 1:
                    printWeapons();
                    buyWeapon();
                case 2:
                    printArmor();
                    buyArmor();
                case 3:
                    System.out.println("See you later my dear friend.");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapons() {
        System.out.println("           AVAILABLE WEAPONS ");
        for (Weapons w : Weapons.weapon()) {
            System.out.println(w.getId() + ") " + w.getName() + "  Damage: " + w.getDamage() + "  Price: " + w.getPrice());
        }
        System.out.println("0 for exit");

    }

    public void buyWeapon() {
        System.out.println("Enter id of weapon would like to buy: ");
        int chooseWeaponID = input.nextInt();

        while (chooseWeaponID < 0 || chooseWeaponID > Weapons.weapon().length) {
            System.out.println("Invalid select. Please try again.");
            chooseWeaponID = input.nextInt();
        }

        Weapons chosenWeapon = Weapons.getWeaponByID(chooseWeaponID);
        if (chosenWeapon != null) {
            if (chosenWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Insufficient Funds: You do not have enough money to purchase this item." + this.getPlayer().getMoney());
            }
            else {
                System.out.println("Purchase Successful: You have successfully bought : " + chosenWeapon.getName());
                int totalBalance = this.getPlayer().getMoney() - chosenWeapon.getPrice();
                this.getPlayer().setMoney(totalBalance);
                System.out.println("Total Balance :" + this.getPlayer().getMoney());
                System.out.println("Equipped Weapon: " + chosenWeapon.getName());
                this.getPlayer().getInventory().setWeapons(chosenWeapon);
            }
        }
    }

    public void buyArmor() {
        System.out.println("Enter id of armor would like to buy: ");
        int chooseArmorID = input.nextInt();

        while (chooseArmorID < 0 || chooseArmorID > Weapons.weapon().length) {
            System.out.println("Invalid select. Please try again.");
            chooseArmorID = input.nextInt();
        }
        Armor chosenArmor = Armor.getArmorByID(chooseArmorID);

        if (chosenArmor != null) {
            if (chosenArmor.getPrice() > this.getPlayer().getMoney()) {
                System.out.println("Insufficient Funds: You do not have enough money to purchase this item." + this.getPlayer().getMoney());
            } else {
                System.out.println("Purchase Successful: You have successfully bought the" + chosenArmor.getName());
                int totalBalance = this.getPlayer().getMoney() - chosenArmor.getPrice();
                this.getPlayer().setMoney(totalBalance);
                System.out.println("Total Balance : " + this.getPlayer().getMoney());
                System.out.println("Previous Armor: " + this.getPlayer().getInventory().getArmor().getName());
                System.out.println("Equipped Armor: " + chosenArmor.getName());
                this.getPlayer().getInventory().setArmor(chosenArmor);
            }
        }
    }

    public void printArmor() {
        System.out.println("  AVAILABLE ARMORS ");
        for (Armor a : Armor.armor()) {
            System.out.println(a.getId() + ") " + a.getName() + "  Defence: " + a.getDefense() + "  Price: " + a.getPrice());
        }
        System.out.println("0 for exit");
    }

}
