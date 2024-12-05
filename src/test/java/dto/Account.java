package dto;  //data transfer object

public class Account {

    String name;
    String rating;
    String phone;
    String fax;

    public Account(String name, String rating, String phone, String fax) {
        this.name = name;
        this.rating = rating;
        this.phone = phone;
        this.fax = fax;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
