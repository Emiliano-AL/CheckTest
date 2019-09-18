
package mx.com.emiliano.checktest.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShowMenu {

    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("href")
    @Expose
    private String href;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
