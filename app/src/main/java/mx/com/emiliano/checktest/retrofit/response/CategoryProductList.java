package mx.com.emiliano.checktest.retrofit.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryProductList {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("idCategory")
    @Expose
    private Double idCategory;
    @SerializedName("productList")
    @Expose
    private List<ProductList> productList = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Double idCategory) {
        this.idCategory = idCategory;
    }

    public List<ProductList> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductList> productList) {
        this.productList = productList;
    }
}
