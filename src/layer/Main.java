package layer;
import java.util.Scanner;
import model.Produto;
import service.Service;


public class Main {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Service escolha = new Service();
		
		System.out.println("Escolha o produto");
		
		Produto resultado = escolha.GetProduto(leitor.nextInt());
		System.out.println(resultado.Modelo);
		System.out.println(resultado.Ano);
		System.out.println(resultado.Fabricante);
		System.out.println(resultado.Categoria);
		System.out.println(resultado.QtdPortas);
		System.out.println(resultado.Imposto);
		System.out.println(resultado.Valor);
		
		
	}

}
