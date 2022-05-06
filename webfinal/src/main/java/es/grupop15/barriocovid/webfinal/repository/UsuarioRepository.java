package es.grupop15.barriocovid.webfinal.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import es.grupop15.barriocovid.webfinal.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    @Query("SELECT u from Usuario u Where u.username = :username")
	public Usuario getUserByUsername(@Param("username") String username);
}
