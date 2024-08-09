public class Notebook extends Product {

    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(int id, Brand brand, String name, double price, double discountRate, int stockAmount, int ram, int storage, double screenSize) {
        super(id, brand, name, price, discountRate, stockAmount);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Brand: %s, Name: %s, Price: %.1f TL, RAM: %d GB, Storage: %d GB SSD, Screen: %.1f inches",
                getId(), getBrand().getName(), getName(), getPrice(), ram, storage, screenSize);
    }

}
