package th.ac.ku.MillionSquare.model;

public class Stock {
    private int productId;
    private String productName;
    private double price;
    private int balance;

    public Stock(int productId, String productName, double price, int balance) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.balance = balance;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", balance=" + balance +
                '}';
    }
}


