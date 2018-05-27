package br.com.ProOdonto.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "paciente")
public class Paciente {
	@Id
	private String cpf;
	private String nome;
	private String sobrenome;
	private String telefone_residencial;
	private String telefone_comercial;
	private String celular;
	@Temporal(TemporalType.DATE)
	@CreatedDate
	private Date data_nascimento;
	@Temporal(TemporalType.DATE)
	@CreatedDate
	@Column(name="data_cadastro", nullable = false,
    columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Date data_cadastro;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numero_ficha;
	
	@PrePersist
	  protected void onCreate() {
		data_cadastro = new Date();
	  }

	  @PreUpdate
	  protected void onUpdate() {
		  data_cadastro = new Date();
	  }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone_residencial() {
		return telefone_residencial;
	}

	public void setTelefone_residencial(String telefone_residencial) {
		this.telefone_residencial = telefone_residencial;
	}

	public String getTelefone_comercial() {
		return telefone_comercial;
	}

	public void setTelefone_comercial(String telefone_comercial) {
		this.telefone_comercial = telefone_comercial;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Date  getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date  data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public int getNumero_ficha() {
		return numero_ficha;
	}

	public void setNumero_ficha(int numero_ficha) {
		this.numero_ficha = numero_ficha;
	}
}
