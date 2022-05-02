package es.gabrielartero.barriocovid.web.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.gabrielartero.barriocovid.web.model.Producto;



@Repository
public interface ProductoRepository extends CrudRepository <Producto, Long> { 
    List<Producto> findByTienda(String tienda);
    List<Producto> findByElegido(Boolean elegido); 
}