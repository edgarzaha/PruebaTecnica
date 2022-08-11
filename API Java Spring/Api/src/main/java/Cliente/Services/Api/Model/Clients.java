package Cliente.Services.Api.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.sql.DataSourceDefinition;
import java.time.LocalDateTime;
@Document(collection = "Cliente")
public class Clients {
    @Id
    private int Cliente_ID;
    private String Nombre_Usuario;
    private String Contraseña;
    private String Nombre;
    private String Apellidos;
    private String Correo_Electronico;

    private int Edad;

    private Float Estatura;

    private Float Peso;

    private Float IMC;

    private Float GIB;

    private Float ETA;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreatedDate
    private LocalDateTime FechaCreacion;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @LastModifiedDate
    private LocalDateTime FechaModificacion;

    public int getCliente_ID() {
        return Cliente_ID;
    }

    public void setCliente_ID(int Cliente_ID) {
        Cliente_ID = Cliente_ID;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        Nombre_Usuario = Nombre_Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }

    public LocalDateTime getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        FechaModificacion = fechaModificacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Float getEstatura() {
        return Estatura;
    }

    public void setEstatura(Float estatura) {
        Estatura = estatura;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float peso) {
        Peso = peso;
    }

    public Float getIMC() {
        return IMC;
    }

    public void setIMC(Float IMC) {
        this.IMC = IMC;
    }

    public Float getGIB() {
        return GIB;
    }

    public void setGIB(Float GIB) {
        this.GIB = GIB;
    }

    public Float getETA() {
        return ETA;
    }

    public void setETA(Float ETA) {
        this.ETA = ETA;
    }

}
