package project.model.entity;

import java.util.Date;

public class User {
    private int userId;
    private String userName;
    private String passWords;
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private boolean userStatus;
    private String confrimPassWords;
    private Date birthDate;
    private String imageUser;
    private boolean userPemission;

    public User() {
    }

    public User(int userId, String userName, String passWords, String fullName, String phone, String email, String address, boolean userStatus, String confrimPassWords, Date birthDate, String imageUser, boolean userPemission) {
        this.userId = userId;
        this.userName = userName;
        this.passWords = passWords;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.userStatus = userStatus;
        this.confrimPassWords = confrimPassWords;
        this.birthDate = birthDate;
        this.imageUser = imageUser;
        this.userPemission = userPemission;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWords() {
        return passWords;
    }

    public void setPassWords(String passWords) {
        this.passWords = passWords;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public String getConfrimPassWords() {
        return confrimPassWords;
    }

    public void setConfrimPassWords(String confrimPassWords) {
        this.confrimPassWords = confrimPassWords;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getImageUser() {
        return imageUser;
    }

    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }

    public boolean isUserPemission() {
        return userPemission;
    }

    public void setUserPemission(boolean userPemission) {
        this.userPemission = userPemission;
    }
}








