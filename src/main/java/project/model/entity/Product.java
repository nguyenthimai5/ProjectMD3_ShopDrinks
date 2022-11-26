package project.model.entity;

public class Product {
    private String productId;
    private String productName;
    private String catalogId;
    private String descriptions;
    private int quatity;
    private String image;
    private float price;
    private boolean productStatus;

    public Product() {
    }

    public Product(String productId, String productName, String catalogId, String descriptions, int quatity, String image, float price, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.catalogId = catalogId;
        this.descriptions = descriptions;
        this.quatity = quatity;
        this.image = image;
        this.price = price;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
}
