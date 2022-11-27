package project.model.entity;

public class Contact {
    private String address;
    private String email;
    private String phone;
    private String website;

    public Contact() {
    }

    public Contact(String address, String email, String phone, String website) {
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
