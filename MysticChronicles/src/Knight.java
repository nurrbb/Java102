public class Knight extends GameCharacters{
    public Knight() {
        super(4,"Knight",8, 24, 10);
    }
    public String[] getAwards() {
        return new String[]{
                "Scroll of Sacred Vows", // Cave
                "Medallion of the Ancient Knight", // Forest
                "Crystal of Purity", // River
                "Seal of Nobility", // Mine
                "Royal Map" // Desert
        };
    }
    public String[] getAwardStories() {
        return new String[]{
                "The Scroll of Sacred Vows from the Cave strengthens the Knight's resolve.",
                "The Medallion of the Ancient Knight found in the Forest symbolizes the Knight's honor.",
                "The Crystal of Purity from the River cleanses the Knight's soul.",
                "The Seal of Nobility from the Mine marks the Knight's noble birth.",
                "The Royal Map from the Desert guides the Knight to lost kingdoms."
        };
    }

    public String getFinalStory() {
        return "With the sacred treasures in hand, the Knight returns home, hailed as the protector of the realm.";
    }
}


