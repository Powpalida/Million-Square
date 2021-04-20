package th.ac.ku.MillionSquare.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ad_min {

    @Id
    private int id;

    private String name;
    private String pin;
    private String tel;

    public Ad_min(int id, String name, String pin, String tel) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.tel = tel;
    }
    public Ad_min(){

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

    @Override
    public String toString() {
        return "Ad_min{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pin='" + pin + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}

