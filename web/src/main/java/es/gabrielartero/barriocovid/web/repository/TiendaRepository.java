package es.gabrielartero.barriocovid.web.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.gabrielartero.barriocovid.web.model.Tienda;


@Repository
public interface TiendaRepository extends CrudRepository<Tienda, Long>{
    Tienda findByNombre(String nombre);
}
