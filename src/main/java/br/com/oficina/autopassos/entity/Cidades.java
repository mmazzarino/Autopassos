package br.com.oficina.autopassos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcCidades")
public class Cidades {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="CodCidade")
    private Integer codCidade; 
	
	@Column(name="CodUF")
    private Integer codUf; 
	
	@Column(name="NomeCidade")
    private String nomeCidade;

	public Integer getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(Integer codCidade) {
		this.codCidade = codCidade;
	}

	public Integer getCodUf() {
		return codUf;
	}

	public void setCodUf(Integer codUf) {
		this.codUf = codUf;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	} 
	
	
}
