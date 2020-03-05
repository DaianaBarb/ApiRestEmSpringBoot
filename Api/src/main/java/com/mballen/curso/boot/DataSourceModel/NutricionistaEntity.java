package com.mballen.curso.boot.DataSourceModel;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="nutricionista")
 
public class NutricionistaEntity implements Serializable {
	
	private static final long serialVersionUID =3862024889868951158L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="idade")
	private int idade;
	
	@Column(name="codigo_registro")
	private String codigoRegistro;
	
	
	@Column(name="id_paciente")
	private Long idPaciente;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCoigoRegistro() {
		return codigoRegistro;
	}
	public void setCoigoRegistro(String coigoRegistro) {
		this.codigoRegistro = coigoRegistro;
	}
	public Long getId_paciente() {
		return idPaciente;
	}
	public void setId_paciente(Long id_paciente) {
		this.idPaciente = id_paciente;
	}
	
	
public NutricionistaEntity(){}

}
