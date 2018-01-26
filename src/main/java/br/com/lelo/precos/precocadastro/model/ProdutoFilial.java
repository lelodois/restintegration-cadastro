package br.com.lelo.precos.precocadastro.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ProdutoFilial {

	@Id
	private String produtoFilial;

	private Long produto;
	private Long filial;
	private boolean pesavel;
	private boolean precoReplicador;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date dataCriacao = new Date();

	public ProdutoFilial() {
	}

	public ProdutoFilial(Long produto, Long filial) {
		super();
		this.produto = produto;
		this.filial = filial;
		this.produtoFilial = produto + "" + filial;
	}

	public ProdutoFilial(long produto, long filial, boolean pesavel, boolean replicador) {
		this(produto, filial);
		this.precoReplicador = replicador;
		this.pesavel = pesavel;
	}

	public Long getFilial() {
		return filial;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Long getProduto() {
		return produto;
	}

	public void setFilial(Long filial) {
		this.filial = filial;
	}

	public void setPesavel(boolean pesavel) {
		this.pesavel = pesavel;
	}

	public boolean isPesavel() {
		return pesavel;
	}

	public void setPrecoReplicador(boolean precoReplicador) {
		this.precoReplicador = precoReplicador;
	}

	public boolean isPrecoReplicador() {
		return precoReplicador;
	}

	public void setProduto(Long produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return StringUtils.join("filial: ", filial, "\tproduto: ", produto, "\tpesavel: " + pesavel + "\treplicador: " + precoReplicador);
	}
}
