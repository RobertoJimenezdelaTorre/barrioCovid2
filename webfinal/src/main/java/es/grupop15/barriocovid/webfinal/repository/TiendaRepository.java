package es.grupop15.barriocovid.webfinal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.grupop15.barriocovid.webfinal.model.Tienda;


@Repository
public interface TiendaRepository extends CrudRepository<Tienda, Long>{
    Tienda findByNombre(String nombre);
}
