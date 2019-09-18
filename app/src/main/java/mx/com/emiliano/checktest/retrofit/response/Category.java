
package mx.com.emiliano.checktest.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("idCategory")
    @Expose
    private Double idCategory;

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
