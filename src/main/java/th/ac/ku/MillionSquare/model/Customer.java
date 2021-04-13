package th.ac.ku.MillionSquare.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private int id;

    private String name;
    private String pin;
    private String tel;

    public Customer(int id, String name, String pin,String tel) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.tel = tel;
    }
    public Customer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
