public class Phone extends Product {

    private int memory;
    private double screenSize;
    private  int battery;
    private int ram;
    private String color;

    public Phone(int id, Brand brand, String name, double price, double discountRate, int stockAmount, int memory, double screenSize, int battery, int ram, String color) {
        super(id, brand, name, price, discountRate, stockAmount);
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("| %-2d | %-10s | %-25s | %-9.1f TL | %-7d | %-9.1f | %-8d | %-7d | %-10s |",
                getId(), getBrand().getName(), getName(), getPrice(), memory, screenSize, battery, ram, color);
    }

}
