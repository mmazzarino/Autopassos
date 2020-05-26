package br.com.oficina.autopassos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcEnderecos")
public class Enderecos {
	
	@Id
	@Column(name = "CodEndereco")
	private Integer codEndereco;
	
	@Column(name = "Logradouro")
	private String logradouro;
	
	@Column(name = "Numero")
	private Integer numero;
	
	@Column(name = "Complemento")
	private String complemento;
	
	@Column(name = "Bairro")
	private String bairro;
	
	@Column(name = "CEP")
	private String cep;
	
	@Column(name = "CodCidade")
	private Integer codCidade;

	public Integer getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(Integer codCidade) {
		this.codCidade = codCidade;
	}
	

}
