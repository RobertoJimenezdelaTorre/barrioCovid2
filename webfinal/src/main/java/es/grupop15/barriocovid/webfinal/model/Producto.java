package es.grupop15.barriocovid.webfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tablaproductos")
public class Producto {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotBlank(message = "El nombre es obligatorio")
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private double precio;

    @NotBlank(message = "La descripción es obligatoria")
    @Column(name = "descripcion")
    private String descripcion;

    @NotBlank(message = "La tienda es obligatoria")
    @Column(name = "tienda")
    private String tienda;

    @Column(name = "stock")
    private int stock;

    private boolean elegido;

    
 

    public Producto() { }

    public Producto(@NotBlank(message = "El nombre es obligatorio") String nombre,
            double precio,
            @NotBlank(message = "La descripción es obligatoria") String descripcion,
            @NotBlank(message = "La tienda es obligatoria") String tienda,
            int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.tienda = tienda;
        this.stock = stock;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isElegido() {
        return elegido;
    }

    public void setElegido(boolean elegido) {
        this.elegido = elegido;
    }

}
