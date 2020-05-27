package br.com.oficina.autopassos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcContatos")
public class Contatos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "CodContato")
	private Integer codContato;
	
	@Column(name = "dddCelular")
	private Integer dddCelular;
	
	@Column(name = "Celular")
	private Integer celular;
	
	@Column(name = "dddTelefone")
	private Integer dddTelefone;
	
	@Column(name = "Telefone")
	private Integer telefone;
	
	@Column(name = "Email")
	private String email;

	public Integer getCodContato() {
		return codContato;
	}

	public void setCodContato(Integer codContato) {
		this.codContato = codContato;
	}

	public Integer getdddCelular() {
		return dddCelular;
	}

	public void setdddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public Integer getdddTelefone() {
		return dddTelefone;
	}

	public void setdddTelefone(Integer dddTelefone) {
		this.dddTelefone = dddTelefone;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}


