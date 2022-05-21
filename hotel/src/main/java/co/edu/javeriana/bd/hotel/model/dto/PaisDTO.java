package co.edu.javeriana.bd.hotel.model.dto;

public class PaisDTO {
    
    String nombre;
    float iva;
    float ic;
    float inTur;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getIc() {
        return ic;
    }

    public void setIc(float ic) {
        this.ic = ic;
    }

    public float getInTur() {
        return inTur;
    }

    public void setInTur(float inTur) {
        this.inTur = inTur;
    }

    @Override
    public String toString() {
        return "PaisDTO{" + "nombre=" + nombre + ", iva=" + iva + ", ic=" + ic + ", inTur=" + inTur + '}';
    }
    
}
