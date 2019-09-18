
package mx.com.emiliano.checktest.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrincipalCategoryList {

    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("idCategory")
    @Expose
    private Double idCategory;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

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

}
