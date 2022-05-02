package es.gabrielartero.barriocovid.web3.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendedores")
public class Vendedor {
    
    @Id
    private long id;
    private String nombre;
    private String contraseña;
    private String tienda;
    private String direccionTienda;

    public Vendedor() { }

    public Vendedor(long id, String nombre, String contraseña, String tienda, String direccionTienda) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tienda = tienda;
        this.direccionTienda = direccionTienda;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getTienda() {
        return tienda;
    }
    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    public String getDireccionTienda() {
        return direccionTienda;
    }
    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

}
