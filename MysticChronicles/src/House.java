public class House extends SafeLocations{
    public House(Player player) {
        super(player, "Safe house");
    }
    @Override
    public boolean LocationStatus() {
        System.out.println("Youre at safehoouse");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());
        return true;
    }

}
