
package mx.com.emiliano.checktest.retrofit.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultSubsidiary {

    @SerializedName("subsidiaryList")
    @Expose
    private List<Subsidiary> subsidiaryList = null;
    @SerializedName("total")
    @Expose
    private Double total;
    @SerializedName("withoutServiceList")
    @Expose
    private List<WithoutServiceList> withoutServiceList = null;
    @SerializedName("categoryList")
    @Expose
    private List<CategoryList> categoryList = null;
    @SerializedName("nextOpeningList")
    @Expose
    private List<NextOpeningList> nextOpeningList = null;
    @SerializedName("principalCategoryList")
    @Expose
    private List<PrincipalCategoryList> principalCategoryList = null;
    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("errores")
    @Expose
    private List<Object> errores = null;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;

    public List<Subsidiary> getSubsidiaryList() {
        return subsidiaryList;
    }

    public void setSubsidiaryList(List<Subsidiary> subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<WithoutServiceList> getWithoutServiceList() {
        return withoutServiceList;
    }

    public void setWithoutServiceList(List<WithoutServiceList> withoutServiceList) {
        this.withoutServiceList = withoutServiceList;
    }

    public List<CategoryList> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryList> categoryList) {
        this.categoryList = categoryList;
    }

    public List<NextOpeningList> getNextOpeningList() {
        return nextOpeningList;
    }

    public void setNextOpeningList(List<NextOpeningList> nextOpeningList) {
        this.nextOpeningList = nextOpeningList;
    }

    public List<PrincipalCategoryList> getPrincipalCategoryList() {
        return principalCategoryList;
    }

    public void setPrincipalCategoryList(List<PrincipalCategoryList> principalCategoryList) {
        this.principalCategoryList = principalCategoryList;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public List<Object> getErrores() {
        return errores;
    }

    public void setErrores(List<Object> errores) {
        this.errores = errores;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

}
