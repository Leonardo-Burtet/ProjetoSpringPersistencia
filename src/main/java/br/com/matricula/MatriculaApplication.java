package br.com.matricula;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import br.com.matricula.model.entidade.Aluno;
import br.com.matricula.model.entidade.Funcionario;
import br.com.matricula.model.persistencia.AlunoRepository;
import br.com.matricula.model.persistencia.FuncionarioRepository;

@SpringBootApplication
public class MatriculaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatriculaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(AlunoRepository repo, FuncionarioRepository repo2) {
		return (args) -> {
			Aluno aluno = new Aluno("Leonardo Burtet Freitas", "011.122.6783-91", "Ensino Fundamental");
			repo.save(aluno);
			Aluno aluno1 = new Aluno("Flavio Freitas", "012.123.678.91", "Ensino Médio");
			repo.save(aluno1);
			
			List<Aluno> alunoLista = (List<Aluno>) repo.findAll();
			System.out.println(alunoLista);
			
			aluno.setNome("Ricardo Augusto");
			aluno.setCpf("123");
			repo.save(aluno);
			System.out.println(repo.findByNome("Ricardo Augusto"));
			
			repo.delete(aluno);
			
			List<Aluno> alunoListaDeletado = (List<Aluno>) repo.findAll();
			System.out.println(alunoListaDeletado);
			
			Funcionario funcionario = new Funcionario("Jussara Ferreira", "010.101.221-72", "Professor");
			repo2.save(funcionario);
			Funcionario funcionario2 = new Funcionario("Giordano Lopes", "010.101.221-72", "Diretor");
			repo2.save(funcionario2);
			Funcionario funcionario3 = new Funcionario("Augusto TipoDois", "110.222.221-72", "Professor");
			repo2.save(funcionario3);
			
			System.out.println(repo2.findByCargo("Professor"));
		};
	}
}
