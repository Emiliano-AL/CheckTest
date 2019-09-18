
package mx.com.emiliano.checktest.retrofit.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NextOpeningList {

    @SerializedName("idSubsidiary")
    @Expose
    private Double idSubsidiary;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("subsidiaryKey")
    @Expose
    private String subsidiaryKey;
    @SerializedName("activeTaim")
    @Expose
    private Boolean activeTaim;
    @SerializedName("shippingCost")
    @Expose
    private Double shippingCost;
    @SerializedName("idCompany")
    @Expose
    private Double idCompany;
    @SerializedName("activeTakeAway")
    @Expose
    private Boolean activeTakeAway;
    @SerializedName("deliveryTime")
    @Expose
    private String deliveryTime;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("idCategory")
    @Expose
    private Double idCategory;
    @SerializedName("minimalPriceDineIn")
    @Expose
    private Double minimalPriceDineIn;
    @SerializedName("activeDelivery")
    @Expose
    private Boolean activeDelivery;
    @SerializedName("minimalPriceTaim")
    @Expose
    private Double minimalPriceTaim;
    @SerializedName("activeReservations")
    @Expose
    private Boolean activeReservations;
    @SerializedName("showMenu")
    @Expose
    private ShowMenu__ showMenu;
    @SerializedName("activeOrders")
    @Expose
    private Boolean activeOrders;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("activeDineIn")
    @Expose
    private Boolean activeDineIn;
    @SerializedName("activePromotions")
    @Expose
    private Boolean activePromotions;
    @SerializedName("categories")
    @Expose
    private List<Category__> categories = null;
    @SerializedName("feeTaim")
    @Expose
    private Integer feeTaim;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("minimalPrice")
    @Expose
    private Double minimalPrice;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public Double getIdSubsidiary() {
        return idSubsidiary;
    }

    public void setIdSubsidiary(Double idSubsidiary) {
        this.idSubsidiary = idSubsidiary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSubsidiaryKey() {
        return subsidiaryKey;
    }

    public void setSubsidiaryKey(String subsidiaryKey) {
        this.subsidiaryKey = subsidiaryKey;
    }

    public Boolean getActiveTaim() {
        return activeTaim;
    }

    public void setActiveTaim(Boolean activeTaim) {
        this.activeTaim = activeTaim;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Double getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Double idCompany) {
        this.idCompany = idCompany;
    }

    public Boolean getActiveTakeAway() {
        return activeTakeAway;
    }

    public void setActiveTakeAway(Boolean activeTakeAway) {
        this.activeTakeAway = activeTakeAway;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Double getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Double idCategory) {
        this.idCategory = idCategory;
    }

    public Double getMinimalPriceDineIn() {
        return minimalPriceDineIn;
    }

    public void setMinimalPriceDineIn(Double minimalPriceDineIn) {
        this.minimalPriceDineIn = minimalPriceDineIn;
    }

    public Boolean getActiveDelivery() {
        return activeDelivery;
    }

    public void setActiveDelivery(Boolean activeDelivery) {
        this.activeDelivery = activeDelivery;
    }

    public Double getMinimalPriceTaim() {
        return minimalPriceTaim;
    }

    public void setMinimalPriceTaim(Double minimalPriceTaim) {
        this.minimalPriceTaim = minimalPriceTaim;
    }

    public Boolean getActiveReservations() {
        return activeReservations;
    }

    public void setActiveReservations(Boolean activeReservations) {
        this.activeReservations = activeReservations;
    }

    public ShowMenu__ getShowMenu() {
        return showMenu;
    }

    public void setShowMenu(ShowMenu__ showMenu) {
        this.showMenu = showMenu;
    }

    public Boolean getActiveOrders() {
        return activeOrders;
    }

    public void setActiveOrders(Boolean activeOrders) {
        this.activeOrders = activeOrders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActiveDineIn() {
        return activeDineIn;
    }

    public void setActiveDineIn(Boolean activeDineIn) {
        this.activeDineIn = activeDineIn;
    }

    public Boolean getActivePromotions() {
        return activePromotions;
    }

    public void setActivePromotions(Boolean activePromotions) {
        this.activePromotions = activePromotions;
    }

    public List<Category__> getCategories() {
        return categories;
    }

    public void setCategories(List<Category__> categories) {
        this.categories = categories;
    }

    public Integer getFeeTaim() {
        return feeTaim;
    }

    public void setFeeTaim(Integer feeTaim) {
        this.feeTaim = feeTaim;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getMinimalPrice() {
        return minimalPrice;
    }

    public void setMinimalPrice(Double minimalPrice) {
        this.minimalPrice = minimalPrice;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
