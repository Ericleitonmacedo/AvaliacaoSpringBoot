/**
 * 
 */
package br.com.ericleiton.aluno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ericleiton.aluno.model.Aluno;
import br.com.ericleiton.aluno.service.AlunoService;
import lombok.AllArgsConstructor;

/**
 * @author Ericleiton
 *
 */
@AllArgsConstructor
@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	
	private AlunoService service;
	
	
	@GetMapping()
	public List<Aluno> get() {
		return this.service.demos();
			
	}

	@PostMapping
	public String post(@RequestBody Aluno aluno) {
		this.service.save(aluno);
		return "Aluno salvo com sucesso";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.service.remove(id);
		return "Aluno removido com sucesso!";
		
	}
	
	
	@PutMapping
	public String put(@RequestBody Aluno aluno) {
		this.service.edit(aluno);
		return "Aluno atualizado com sucesso!";
		
	}
	
	@GetMapping("/nome")
	public Aluno getByName(@RequestParam("nome") String nome) {
		return this.service.getByName(nome);
	
	}
	
	@GetMapping("/curso")
	public List<Aluno> getByCurso(@RequestParam("curso") String curso) {
		return this.service.getByCurso(curso);
	
	}
}

