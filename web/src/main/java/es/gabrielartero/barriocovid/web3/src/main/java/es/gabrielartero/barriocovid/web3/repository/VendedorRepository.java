package es.gabrielartero.barriocovid.web3.repository;

import org.springframework.data.repository.CrudRepository;

import es.gabrielartero.barriocovid.web3.model.Vendedor;

public interface VendedorRepository extends CrudRepository<Vendedor, Long> {
    
}
