package repository;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class Repository {

	public List<Produto> fipe = new ArrayList<Produto>();

	public Produto GetProduto(int indice) {

		Produto produto = new Produto();

		produto.Modelo = "Cobalt";
		produto.Ano = 2015;
		produto.Categoria = "Sedan";
		produto.Valor = 25000;
		produto.Fabricante = "GM";
		produto.QtdPortas = 4;
		produto.Imposto = 4.0;

		fipe.add(produto);
		
		produto = new Produto();

		produto.Modelo = "Uno";
		produto.Ano = 2005;
		produto.Categoria = "Hatc";
		produto.Valor = 10000;
		produto.Fabricante = "FIAT";
		produto.QtdPortas = 2;
		produto.Imposto = 4.0;

		fipe.add(produto);

		return fipe.get(indice);

	}

	public void SetProdutos(Produto produto) {
		fipe.add(produto);

	}

}
