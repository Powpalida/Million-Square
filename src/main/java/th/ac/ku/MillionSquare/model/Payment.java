package th.ac.ku.MillionSquare.model;

public class Payment {
    private String name;
    private String address;
    private String creditCard;
    private String tel;

    public Payment(String name, String address, String creditCard, String tel) {
        this.name = name;
        this.address = address;
        this.creditCard = creditCard;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getTel() {
        return tel;
    }
}

