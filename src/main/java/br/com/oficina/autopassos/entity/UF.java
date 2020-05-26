package br.com.oficina.autopassos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcUF")
public class UF {
	
	@Id
	@Column(name="CodUF")
    private Integer codUf; 
	
	@Column(name="NomeUF")
    private String nomeUf;

	
	public Integer getCodUf() {
		return codUf;
	}

	public void setCodUf(Integer codUf) {
		this.codUf = codUf;
	}

	public String getTitulo() {
		return nomeUf;
	}

	public void setTitulo(String titulo) {
		this.nomeUf = titulo;
	} 

}
