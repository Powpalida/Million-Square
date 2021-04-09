package th.ac.ku.MillionSquare.model;

public class Menu {
    private int no;
    private String dsName;
    private float price;

    public Menu(int no, String dsName, float price) {
        this.no = no;
        this.dsName = dsName;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
