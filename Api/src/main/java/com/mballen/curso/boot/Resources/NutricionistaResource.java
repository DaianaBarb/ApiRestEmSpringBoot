package com.mballen.curso.boot.Resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource {
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("idade")
	private String idade;
	
	@Override
	public String toString() {
		return "NutricionistaResource [nome=" + nome + ", idade=" + idade + ", codigoRegistro=" + codigoRegistro
				+ ", idPaciente=" + idPaciente + ", getIdade()=" + getIdade() + ", getCodigoRegistro()="
				+ getCodigoRegistro() + ", getNome()=" + getNome() + ", getIdPaciente()=" + getIdPaciente()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	@JsonProperty("codigo_registro")
	private String codigoRegistro;
	
	@JsonProperty("id_paciente") 
	String idPaciente;
	
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}
	public NutricionistaResource(String nome, String idPaciente) {
		this.nome = nome;
		this.idPaciente = idPaciente;
	}


}
