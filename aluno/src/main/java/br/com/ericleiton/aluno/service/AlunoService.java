
/**
 * 
 */
package br.com.ericleiton.aluno.service;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ericleiton.aluno.model.Aluno;
import br.com.ericleiton.aluno.repository.AlunoRepository;
import lombok.AllArgsConstructor;


/**
 * @author Ericleiton
 *
 */
@Service
@AllArgsConstructor
public class AlunoService {
	
	private final AlunoRepository repository;
	
	
	
	public void save(Aluno aluno) {
		this.repository.save(aluno);
		
	}
	
	public List<Aluno> demos(){
		return this.repository.findAll();
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
		
	}
	
	public void edit(Aluno aluno) {
		this.repository.save(aluno);
		
	}
	
	public Aluno getByName(String nome) {
		return this.repository.findByNome(nome);
		
	}
	
	public List<Aluno> getByCurso(String curso) {
		return this.repository.findByCurso(curso);
		
	}
		
}
	


