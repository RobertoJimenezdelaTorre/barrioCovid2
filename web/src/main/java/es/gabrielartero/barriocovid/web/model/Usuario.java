package es.gabrielartero.barriocovid.web2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombreUsuario")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "dirección")
    private String dirección;

    @Column(name = "confinado")
    private boolean confinado;

    @Column(name = "voluntario")
    private boolean voluntario;


    public Usuario() { }



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public boolean isConfinado() {
        return confinado;
    }

    public void setConfinado(boolean confinado) {
        this.confinado = confinado;
    }

    public boolean isVoluntario() {
        return voluntario;
    }

    public void setVoluntario(boolean voluntario) {
        this.voluntario = voluntario;
    }

    public Usuario(String nombre, String email, String contraseña, String dirección, boolean confinado,
            boolean voluntario) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.dirección = dirección;
        this.confinado = confinado;
        this.voluntario = voluntario;
    }


}
