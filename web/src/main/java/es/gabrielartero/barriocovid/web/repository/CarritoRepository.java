package es.gabrielartero.barriocovid.web.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.gabrielartero.barriocovid.web.model.Carrito;

public interface CarritoRepository extends CrudRepository<Carrito, Long> {
   // List<Carrito> findByNombre(String nombre);
}
