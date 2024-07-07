public class Hunter extends GameCharacters{
    public Hunter() {
        super(3,"Hunter",7, 18, 21);
    }
    public String[] getAwards() {
        return new String[]{
                "Feathered Cloak", // Cave
                "Elven Bow", // Forest
                "Ring of the Water Spirit", // River
                "Gem of the Mountain", // Mine
                "Scorpion's Sting" // Desert
        };
    }
    public String[] getAwardStories() {
        return new String[]{
                "The Feathered Cloak from the Cave enhances the Hunter's agility.",
                "The Elven Bow found in the Forest is a masterpiece of craftsmanship.",
                "The Ring of the Water Spirit from the River grants the Hunter control over water.",
                "The Gem of the Mountain from the Mine represents the Hunter's resilience.",
                "The Scorpion's Sting from the Desert is a deadly addition to the Hunter's arsenal."
        };
    }

    public String getFinalStory() {
        return "With all the prized possessions, the Hunter returns home, known as the master of the wilderness.";
    }
}
