package th.ac.ku.MillionSquare.model;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public class Payment {
    private int id;
    private String address;
    private String creditCard;
    private String tel;

    public Payment(int id, String address, String creditCard, String tel) {
        this.id = id;
        this.address = address;
        this.creditCard = creditCard;
        this.tel = tel;
    }
    public Payment(){

    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}

