package project.model.entity;

public class ProductDetails {
    private int proDetailsId;
    private int productId;
    private String sizeId;
    private float pricePrDt;
    private boolean proDtStatus;

    public ProductDetails() {
    }

    public ProductDetails(int proDetailsId, int productId, String sizeId, float pricePrDt, boolean proDtStatus) {
        this.proDetailsId = proDetailsId;
        this.productId = productId;
        this.sizeId = sizeId;
        this.pricePrDt = pricePrDt;
        this.proDtStatus = proDtStatus;
    }

    public int getProDetailsId() {
        return proDetailsId;
    }

    public void setProDetailsId(int proDetailsId) {
        this.proDetailsId = proDetailsId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public float getPricePrDt() {
        return pricePrDt;
    }

    public void setPricePrDt(float pricePrDt) {
        this.pricePrDt = pricePrDt;
    }

    public boolean isProDtStatus() {
        return proDtStatus;
    }

    public void setProDtStatus(boolean proDtStatus) {
        this.proDtStatus = proDtStatus;
    }
}
