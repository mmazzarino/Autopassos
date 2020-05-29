package br.com.oficina.autopassos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcServicos")
public class Servicos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "CodServico")
	private Integer codServico;
	
	@Column(length = 20, name = "NomeServico")
	private String nomeServico;
	
	@Column(name = "ValorHora")
	private Float valorHora;

	public Integer getCodServico() {
		return codServico;
	}

	public void setCodServico(Integer codServico) {
		this.codServico = codServico;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Float getValorHora() {
		return valorHora;
	}

	public void setValorHora(Float valorHora) {
		this.valorHora = valorHora;
	}

	
}
