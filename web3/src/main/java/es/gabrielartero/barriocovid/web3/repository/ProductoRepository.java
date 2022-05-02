package es.gabrielartero.barriocovid.web3.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.gabrielartero.barriocovid.web3.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
    List<Producto> findByNombre(String nombre); 
    List<Producto> findByDescripcion(String descripcion);
}
