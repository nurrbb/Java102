public class BattlePriest extends GameCharacters{
    public BattlePriest() {
        super(2,"Battle Priest",5, 28, 15);
    }
    public String[] getAwards() {
        return new String[]{
                "Holy Relic", // Cave
                "Herbal Remedy", // Forest
                "Blessed Water", // River
                "Rune of Protection", // Mine
                "Desert Rose" // Desert
        };
    }
    public String[] getAwardStories() {
        return new String[]{
                "The Holy Relic from the Cave strengthens the Battle Priest's faith.",
                "The Herbal Remedy found in the Forest heals the wounded.",
                "The Blessed Water from the River purifies the soul.",
                "The Rune of Protection from the Mine shields the Battle Priest.",
                "The Desert Rose from the Desert symbolizes the Battle Priest's endurance."
        };
    }

    public String getFinalStory() {
        return "With the sacred items collected, the Battle Priest returns home, revered as a divine protector.";
    }
}
