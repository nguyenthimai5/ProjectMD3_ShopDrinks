package project.model.entity;

import java.util.Date;

public class Orders {
    private int ordersId;
    private int userId;
    private Date createDate;
    private float totalAmount;
    private int quantity;
    private String phone;
    private String address;
    private int orderStatus;

    public Orders() {
    }

    public Orders(int ordersId, int userId, Date createDate, float totalAmount, int quantity, String phone, String address, int orderStatus) {
        this.ordersId = ordersId;
        this.userId = userId;
        this.createDate = createDate;
        this.totalAmount = totalAmount;
        this.quantity = quantity;
        this.phone = phone;
        this.address = address;
        this.orderStatus = orderStatus;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }
}
