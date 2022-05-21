package co.edu.javeriana.bd.hotel.model.dto;

public class CuentaDTO {
    
    String user;
    String pass;
    PersonaDTO persona;

    public CuentaDTO(String user, String pass, PersonaDTO persona) {
        this.user = user;
        this.pass = pass;
        this.persona = persona;
    }

    public CuentaDTO(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "user=" + user + ", pass=" + pass + ", persona=" + persona + '}';
    }
        
}
