package br.com.oficina.autopassos.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OfcPessoas")
public class Pessoas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name ="CodPessoa")
	private Integer codPessoa;
	
	@Column(length = 50, name = "NomePessoa")
	private String nomePessoa;
	
	@Column(name = "TipoPessoa")
	private char tipoPessoa;
	
	@Column(name = "dddCelular")
	private Integer dddCelular;
	
	@Column(name = "Celular")
	private Integer celular;
	
	@Column(name = "dddTelefone")
	private Integer dddTelefone;
	
	@Column(name = "Telefone")
	private Integer telefone;
	
	@Column(length = 70, name = "Email")
	private String email;
	
	@Column(name = "FlgWhatsApp")
	private char flgWhatsApp;
	
	@Column(length = 10, name = "Apelido")
	private String apelido;
	
	@Column(name = "DataNascimento")
	private Date dataNascimento;
	
	@Column(name ="CodContato")
	private Integer codContato;
	
	@Column(length = 100, name ="Endereco")
	private String endereco;

	@Column(length = 14, name = "CPF")
	private String cpf;
	
	@Column(length = 18, name = "CNPJ")
	private String cnpj;

	public Integer getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Integer codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public char getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(char tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Integer getDddCelular() {
		return dddCelular;
	}

	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public Integer getDddTelefone() {
		return dddTelefone;
	}

	public void setDddTelefone(Integer dddTelefone) {
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

	public char getFlgWhatsApp() {
		return flgWhatsApp;
	}

	public void setFlgWhatsApp(char flgWhatsApp) {
		this.flgWhatsApp = flgWhatsApp;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getCodContato() {
		return codContato;
	}

	public void setCodContato(Integer codContato) {
		this.codContato = codContato;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	
}
