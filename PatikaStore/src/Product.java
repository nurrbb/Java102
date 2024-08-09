public abstract class Product {

    private int id;
    private Brand brand;

    private String name;
    private double price;
    private double discountRate;
    private int stockAmount;

    public Product(int id, Brand brand, String name, double price, double discountRate, int stockAmount) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    @Override
    public String toString() {
        return String.format("%-5d %-20s %-10.2f %-10.2f %-10d %-20s", id, name, price, discountRate, stockAmount, brand.getName());
    }

}
