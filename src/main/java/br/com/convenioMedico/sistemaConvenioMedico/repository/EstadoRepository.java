package br.com.convenioMedico.sistemaConvenioMedico.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.Estado;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long>{
	
}
