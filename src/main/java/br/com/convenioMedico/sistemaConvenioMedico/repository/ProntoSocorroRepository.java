package br.com.convenioMedico.sistemaConvenioMedico.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.convenioMedico.sistemaConvenioMedico.model.ProntoSocorro;

@Repository
public interface ProntoSocorroRepository extends CrudRepository<ProntoSocorro, Long>{

	List<ProntoSocorro>findByCnpj(String cnpj);
	
}
