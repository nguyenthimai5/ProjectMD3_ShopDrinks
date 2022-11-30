package project.model.entity;

public class WishList {
    private int wishlistId;
    private int productId;
    private int userId;
    private boolean wishlistStatus;

    public WishList() {
    }

    public WishList(int wishlistId, int productId, int userId, boolean wishlistStatus) {
        this.wishlistId = wishlistId;
        this.productId = productId;
        this.userId = userId;
        this.wishlistStatus = wishlistStatus;
    }

    public int getWishlistId() {
        return wishlistId;
    }

    public void setWishlistId(int wishlistId) {
        this.wishlistId = wishlistId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isWishlistStatus() {
        return wishlistStatus;
    }

    public void setWishlistStatus(boolean wishlistStatus) {
        this.wishlistStatus = wishlistStatus;
    }
}
