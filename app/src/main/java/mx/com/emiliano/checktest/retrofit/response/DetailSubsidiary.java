package mx.com.emiliano.checktest.retrofit.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetailSubsidiary {
    @SerializedName("idFavorite")
    @Expose
    private Double idFavorite;
    @SerializedName("idCompany")
    @Expose
    private Double idCompany;
    @SerializedName("activeTakeAway")
    @Expose
    private Boolean activeTakeAway;
    @SerializedName("deliveryTime")
    @Expose
    private String deliveryTime;
    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("homePage")
    @Expose
    private String homePage;
    @SerializedName("promotionProductList")
    @Expose
    private List<PromotionProductList> promotionProductList = null;
    @SerializedName("idCategory")
    @Expose
    private Double idCategory;
    @SerializedName("activeDelivery")
    @Expose
    private Boolean activeDelivery;
    @SerializedName("activeReservations")
    @Expose
    private Boolean activeReservations;
    @SerializedName("categoryList")
    @Expose
    private List<CategoryList> categoryList = null;
    @SerializedName("activeDineIn")
    @Expose
    private Boolean activeDineIn;
    @SerializedName("activePromotions")
    @Expose
    private Boolean activePromotions;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("idSubsidiary")
    @Expose
    private Double idSubsidiary;
    @SerializedName("categoryProductList")
    @Expose
    private List<CategoryProductList> categoryProductList = null;
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
    @SerializedName("txtShare")
    @Expose
    private String txtShare;
    @SerializedName("minimalPriceDineIn")
    @Expose
    private Double minimalPriceDineIn;
    @SerializedName("errores")
    @Expose
    private List<Object> errores = null;
    @SerializedName("minimalPriceTaim")
    @Expose
    private Double minimalPriceTaim;
    @SerializedName("horary")
    @Expose
    private Horary horary;
    @SerializedName("reservations")
    @Expose
    private Reservations reservations;
    @SerializedName("phone")
    @Expose
    private Phone phone;
    @SerializedName("activeOrders")
    @Expose
    private Boolean activeOrders;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("information")
    @Expose
    private Information information;
    @SerializedName("feeTaim")
    @Expose
    private Integer feeTaim;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("minimalPrice")
    @Expose
    private Double minimalPrice;
    @SerializedName("favorite")
    @Expose
    private Favorite favorite;
    @SerializedName("isFavorite")
    @Expose
    private Boolean isFavorite;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    public Double getIdFavorite() {
        return idFavorite;
    }

    public void setIdFavorite(Double idFavorite) {
        this.idFavorite = idFavorite;
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

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public List<PromotionProductList> getPromotionProductList() {
        return promotionProductList;
    }

    public void setPromotionProductList(List<PromotionProductList> promotionProductList) {
        this.promotionProductList = promotionProductList;
    }

    public Double getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Double idCategory) {
        this.idCategory = idCategory;
    }

    public Boolean getActiveDelivery() {
        return activeDelivery;
    }

    public void setActiveDelivery(Boolean activeDelivery) {
        this.activeDelivery = activeDelivery;
    }

    public Boolean getActiveReservations() {
        return activeReservations;
    }

    public void setActiveReservations(Boolean activeReservations) {
        this.activeReservations = activeReservations;
    }

    public List<CategoryList> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryList> categoryList) {
        this.categoryList = categoryList;
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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Double getIdSubsidiary() {
        return idSubsidiary;
    }

    public void setIdSubsidiary(Double idSubsidiary) {
        this.idSubsidiary = idSubsidiary;
    }

    public List<CategoryProductList> getCategoryProductList() {
        return categoryProductList;
    }

    public void setCategoryProductList(List<CategoryProductList> categoryProductList) {
        this.categoryProductList = categoryProductList;
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

    public String getTxtShare() {
        return txtShare;
    }

    public void setTxtShare(String txtShare) {
        this.txtShare = txtShare;
    }

    public Double getMinimalPriceDineIn() {
        return minimalPriceDineIn;
    }

    public void setMinimalPriceDineIn(Double minimalPriceDineIn) {
        this.minimalPriceDineIn = minimalPriceDineIn;
    }

    public List<Object> getErrores() {
        return errores;
    }

    public void setErrores(List<Object> errores) {
        this.errores = errores;
    }

    public Double getMinimalPriceTaim() {
        return minimalPriceTaim;
    }

    public void setMinimalPriceTaim(Double minimalPriceTaim) {
        this.minimalPriceTaim = minimalPriceTaim;
    }

    public Horary getHorary() {
        return horary;
    }

    public void setHorary(Horary horary) {
        this.horary = horary;
    }

    public Reservations getReservations() {
        return reservations;
    }

    public void setReservations(Reservations reservations) {
        this.reservations = reservations;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
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

    public Favorite getFavorite() {
        return favorite;
    }

    public void setFavorite(Favorite favorite) {
        this.favorite = favorite;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
