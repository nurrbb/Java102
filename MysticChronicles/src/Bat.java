public class Bat extends Enemy {
    private int money;
    public Bat() {
        super(1,"Bat",3,10);
        this.money =2;
    }

    public int getAward() {
        return money;
    }

    public void setAward(int award) {
        this.money = money;
    }
}
