
package br.com.ericleiton.aluno.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ericleiton.aluno.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	Aluno findByNome(String nome);
	
	List<Aluno> findByCurso(String curso);
}

