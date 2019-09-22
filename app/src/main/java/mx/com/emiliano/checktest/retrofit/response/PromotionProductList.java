package mx.com.emiliano.checktest.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromotionProductList {
    @SerializedName("unitPrice")
    @Expose
    private Integer unitPrice;
    @SerializedName("idPromotion")
    @Expose
    private Double idPromotion;
    @SerializedName("discountPrice")
    @Expose
    private Integer discountPrice;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("idProduct")
    @Expose
    private Double idProduct;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("detail")
    @Expose
    private Detail detail;
    @SerializedName("productKey")
    @Expose
    private String productKey;

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Double idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Double idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}
