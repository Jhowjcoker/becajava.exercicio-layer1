package service;

import model.Produto;
import repository.Repository;

public class Service {

	public Produto GetProduto(int indice) {
		Repository calculo = new Repository();

		Produto result = calculo.GetProduto(indice);
		result.Valor += (result.Valor * result.Imposto) / 100;

		return result;
	}

	public void SetProdutos(Produto produto) {
		
		Repository calculo = new Repository();
		produto.Valor += (produto.Valor * produto.Imposto) / 100;
		
		calculo.SetProdutos(produto);
		
	}

}
