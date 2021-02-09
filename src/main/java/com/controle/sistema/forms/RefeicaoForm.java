package com.controle.sistema.forms;

import java.sql.Blob;

import com.controle.sistema.model.Refeicao;

public class RefeicaoForm {
	private String nome;
	private String categoria;
	private String area;
	private String imagem;
	private String instrucoes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getInstrucoes() {
		return instrucoes;
	}

	public void setInstrucoes(String instrucoes) {
		this.instrucoes = instrucoes;
	}

	public Refeicao convert() {
		return new Refeicao(this.nome, this.categoria, this.area, this.imagem, this.instrucoes);
	}
}
