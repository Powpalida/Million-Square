package th.ac.ku.MillionSquare.model;

public class Contact {
    private int id;
    private String name;
    private String phonenum;
    private String mail;

    public Contact(int id, String name, String phonenum, String mail) {
        this.id = id;
        this.name = name;
        this.phonenum = phonenum;
        this.mail = mail;
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

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
