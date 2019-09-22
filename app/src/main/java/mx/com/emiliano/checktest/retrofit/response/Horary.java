package mx.com.emiliano.checktest.retrofit.response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Horary {
    @SerializedName("Martes")
    @Expose
    private String martes;
    @SerializedName("Mi\u00e9rcoles")
    @Expose
    private String miRcoles;
    @SerializedName("Viernes")
    @Expose
    private String viernes;
    @SerializedName("Lunes")
    @Expose
    private String lunes;
    @SerializedName("S\u00e1bado")
    @Expose
    private String sBado;
    @SerializedName("Domingo")
    @Expose
    private String domingo;
    @SerializedName("Jueves")
    @Expose
    private String jueves;

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiRcoles() {
        return miRcoles;
    }

    public void setMiRcoles(String miRcoles) {
        this.miRcoles = miRcoles;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getSBado() {
        return sBado;
    }

    public void setSBado(String sBado) {
        this.sBado = sBado;
    }

    public String getDomingo() {
        return domingo;
    }

    public void setDomingo(String domingo) {
        this.domingo = domingo;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }
}
