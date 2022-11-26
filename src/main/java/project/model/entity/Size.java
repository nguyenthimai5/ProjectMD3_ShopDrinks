package project.model.entity;

public class Size {
    private String sizeId;
    private String sizeName;
    private boolean sizeStatus;

    public Size() {
    }

    public Size(String sizeId, String sizeName, boolean sizeStatus) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
        this.sizeStatus = sizeStatus;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public boolean isSizeStatus() {
        return sizeStatus;
    }

    public void setSizeStatus(boolean sizeStatus) {
        this.sizeStatus = sizeStatus;
    }
}
