package es.gabrielartero.barriocovid.web2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "numeroProductos")
    private int numeroProductos;

    @Column(name = "precio")
    private double precio;

    @Column(name = "necesitaReparto")
    private boolean necesitaReparto;

    @Column(name = "direccionReparto")
    private String direccionReparto;

    @Column(name = "repartidor")
    private String repartidor;


    public Carrito(int numeroProductos, double precio, boolean necesitaReparto, String direccionReparto,
            String repartidor) {
        this.numeroProductos = numeroProductos;
        this.precio = precio;
        this.necesitaReparto = necesitaReparto;
        this.direccionReparto = direccionReparto;
        this.repartidor = repartidor;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getNumeroProductos() {
        return numeroProductos;
    }
    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isNecesitaReparto() {
        return necesitaReparto;
    }
    public void setNecesitaReparto(boolean necesitaReparto) {
        this.necesitaReparto = necesitaReparto;
    }
    public String getDireccionReparto() {
        return direccionReparto;
    }
    public void setDireccionReparto(String direccionReparto) {
        this.direccionReparto = direccionReparto;
    }
    public String getRepartidor() {
        return repartidor;
    }
    public void setRepartidor(String repartidor) {
        this.repartidor = repartidor;
    }
}
