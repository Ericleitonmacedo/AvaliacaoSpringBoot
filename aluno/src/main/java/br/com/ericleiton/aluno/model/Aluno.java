/**
 * 
 */
package br.com.ericleiton.aluno.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



/**
 * @author Ericleiton
 *
 */
@Data
@Entity
@Table(name = "Aluno")
public class Aluno {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String 	RG;
	
	private String 	CPF;
	
	private String 	endereco;
	
	private String 	curso;
	
	
}

