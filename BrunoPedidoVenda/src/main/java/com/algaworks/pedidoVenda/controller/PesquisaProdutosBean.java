package com.algaworks.pedidoVenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaProdutosBean {
	
	private List<Integer> produtosFiltrados;

	public PesquisaProdutosBean() {
		//System.out.println("Construtor rodou!");
		this.produtosFiltrados = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			this.produtosFiltrados.add(i);
		}
	}
	
	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}

}
