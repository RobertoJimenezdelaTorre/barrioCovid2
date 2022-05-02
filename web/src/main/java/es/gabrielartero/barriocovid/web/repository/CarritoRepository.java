package es.gabrielartero.barriocovid.web2.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.gabrielartero.barriocovid.web2.model.Carrito;

public interface CarritoRepository extends CrudRepository<Carrito, Long> {
   // List<Carrito> findByNombre(String nombre);
}
