package br.com.oficina.autopassos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcOrcamentos")
public class Orcamentos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "CodOrcamento")
	private Integer codOrcamento;
	
	@Column(name = "CodPessoa")
	private Integer codPessoa;
	
	@Column(length = 20, name = "NomeCarro")
	private String nomeCarro;
	
	@Column(length = 1000, name = "DescricaoServico")
	private String descricaoServico;
	
	@Column(name = "ServicosHoras")
	private String servicosHoras;
	
	@Column(name = "ValorTotal")
	private Float valorTotal;
	
	@Column(name = "PorcDesconto")
	private Float porcDesconto;


	public Integer getCodOrcamento() {
		return codOrcamento;
	}

	public void setCodOrcamento(Integer codOrcamento) {
		this.codOrcamento = codOrcamento;
	}

	public Integer getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Integer codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNomeCarro() {
		return nomeCarro;
	}

	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}


	public String getServicosHoras() {
		return servicosHoras;
	}

	public void setServicosHoras(String servicosHoras) {
		this.servicosHoras = servicosHoras;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Float getPorcDesconto() {
		return porcDesconto;
	}

	public void setPorcDesconto(Float porcDesconto) {
		this.porcDesconto = porcDesconto;
	}
	
}
