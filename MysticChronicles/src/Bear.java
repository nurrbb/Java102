public class Bear extends Enemy{
    private int award;
    public Bear() {
        super(2,"Bear",3,10);
        this.award =3;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }
}
