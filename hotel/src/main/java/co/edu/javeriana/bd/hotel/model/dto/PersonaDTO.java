package co.edu.javeriana.bd.hotel.model.dto;

public class PersonaDTO {
    
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;

    public PersonaDTO(String dni, String nombre, String telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return dni + " - " + nombre;
    }

    public String toStringAll() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Direccion: " + direccion + ", Telefono: " + telefono;
    }
    
}
