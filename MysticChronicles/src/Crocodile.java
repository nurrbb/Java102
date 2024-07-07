public class Crocodile extends Enemy{
    private int award;
    public Crocodile() {
        super(3,"Crocodile",3,10);
        this.award =5;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }
}
