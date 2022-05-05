package es.grupop15.barriocovid.webfinal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    // Nombre en caso de ser usuario y nombre de la tienda en caso de ser vendedor
    @NotBlank(message = "El nombre es obligatorio")
    @Column(name = "nombre")
    private String nombre;

    @NotBlank(message = "El email es obligatoria")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria")
    @Column(name = "contraseña")
    private String contraseña;

    @NotBlank(message = "La direccion es obligatoria")
    @Column(name = "direccion")
    private String direccion;
    

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name ="users_roles", joinColumns = @JoinColumn (name="user_id"), inverseJoinColumns = @JoinColumn (name="role_id"))
	private Set<Rol> roles=new HashSet<>();


    public Usuario() { }

    
    public Usuario(@NotBlank(message = "El nombre es obligatorio") String nombre,
            @NotBlank(message = "El email es obligatoria") String email,
            @NotBlank(message = "La contraseña es obligatoria") String contraseña,
            @NotBlank(message = "La direccion es obligatoria") String direccion, Set<Rol> roles) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.roles = roles;
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


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Set<Rol> getRoles() {
        return roles;
    }


    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

}
