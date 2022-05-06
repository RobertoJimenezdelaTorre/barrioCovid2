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
    @Column(name = "username")
    private String username;

    @NotBlank(message = "La contraseña es obligatoria")
    @Column(name = "password")
    private String password;

    @NotBlank(message = "La direccion es obligatoria")
    @Column(name = "direccion")
    private String direccion;
    

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name ="users_roles", joinColumns = @JoinColumn (name="user_id"), inverseJoinColumns = @JoinColumn (name="role_id"))
	private Set<Rol> roles=new HashSet<>();

    private boolean enabled;




    public Usuario() { }

    
    public Usuario(@NotBlank(message = "El nombre es obligatorio") String nombre,
            @NotBlank(message = "El email es obligatoria") String username,
            @NotBlank(message = "La contraseña es obligatoria") String password,
            @NotBlank(message = "La direccion es obligatoria") String direccion, Set<Rol> roles) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
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


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
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

    public boolean isEnabled() {
        return enabled;
    }


    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
