package br.com.convenioMedico.sistemaConvenioMedico.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sigla;

	@OneToMany(mappedBy = "estado", fetch = FetchType.EAGER)
	private List<Municipio> cidades;

	public Estado() {
		// TODO Auto-generated constructor stub
	}

	public Estado(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Municipio> getCidades() {
		return cidades;
	}

	public void setCidades(List<Municipio> cidades) {
		this.cidades = cidades;
	}

}
