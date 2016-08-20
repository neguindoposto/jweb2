package br.com.fabricadeprogramador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false,length=11)
	private String cpf;
	
	public Cliente(){
		
	}
	
	public Cliente(String nome,String email,String cpf){
		this.nome =nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
