package br.com.matricula.model.persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.matricula.model.entidade.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long>{
		
	List<Aluno> findByNome(String nome);
	
	List<Aluno> findByCpf(String cpf);
}	
