public class Assassin extends GameCharacters{
    public Assassin() {
        super(1,"Assassin",23,23,45);
    }
    public String[] getAwards() {
        return new String[]{
                "Cloak of Shadows", // Cave
                "Bottle of Poisonous Herb", // Forest
                "Talisman of Silence", // River
                "Book of Daggers", // Mine
                "Sandstorm Hourglass" // Desert
        };
    }
    public String[] getAwardStories() {
        return new String[]{
                "With the Cloak of Shadows, the Assassin blends perfectly into the darkness of the Cave.",
                "The Bottle of Poisonous Herb found in the Forest is a powerful tool in the Assassin's arsenal.",
                "The Talisman of Silence retrieved from the River silences the Assassin's steps.",
                "The Book of Daggers from the Mine holds ancient techniques of silent kills.",
                "The Sandstorm Hourglass from the Desert allows the Assassin to vanish in a cloud of sand."
        };
    }

    public String getFinalStory() {
        return "With all the treasures gathered, the Assassin returns home, becoming the most feared and respected figure in the land.";
    }
}
