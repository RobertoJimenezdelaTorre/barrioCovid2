package es.grupop15.barriocovid.webfinal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.grupop15.barriocovid.webfinal.model.Producto;




@Repository
public interface ProductoRepository extends CrudRepository <Producto, Long> { 
    List<Producto> findByTienda(String tienda);
    List<Producto> findByElegido(Boolean elegido); 
}