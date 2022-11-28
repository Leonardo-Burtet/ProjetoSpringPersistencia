package br.com.matricula.model.persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.matricula.model.entidade.Funcionario;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long>{
		
	List<Funcionario> findByCargo(String cargo);

	List<Funcionario> findByCpf(String cpf);
	
}	
