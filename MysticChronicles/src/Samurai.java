public class Samurai extends GameCharacters{
    public Samurai() {
        super(5,"Samurai",5, 21, 18);
    }
    public String[] getAwards() {
        return new String[]{
                "Scroll of Ancient Teachings", // Cave
                "Dragon Scale", // Forest
                "Sword of Wisdom", // River
                "Samurai Seal", // Mine
                "Staff of the Sandstorm" // Desert
        };
    }
    public String[] getAwardStories() {
        return new String[]{
                "The Scroll of Ancient Teachings from the Cave enriches the Samurai's wisdom.",
                "The Dragon Scale found in the Forest symbolizes the Samurai's strength.",
                "The Sword of Wisdom from the River sharpens the Samurai's skills.",
                "The Samurai Seal from the Mine signifies the Samurai's honor.",
                "The Staff of the Sandstorm from the Desert empowers the Samurai's spirit."
        };
    }

    public String getFinalStory() {
        return "With the ancient relics gathered, the Samurai returns home, becoming a legend in his own time.";
    }
}

