public class SafeLocations extends Location {
    public SafeLocations(Player player, String name) {
        super(player,name);
    }

    @Override
    public boolean LocationStatus() {
        return false;
    }

}
