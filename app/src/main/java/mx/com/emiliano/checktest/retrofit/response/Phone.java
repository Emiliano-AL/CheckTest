package mx.com.emiliano.checktest.retrofit.response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Phone {
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("areaCode")
    @Expose
    private String areaCode;
    @SerializedName("extension")
    @Expose
    private String extension;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("type")
    @Expose
    private String type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
