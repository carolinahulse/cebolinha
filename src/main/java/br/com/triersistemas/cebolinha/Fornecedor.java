package br.com.triersistemas.cebolinha;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Fornecedor extends PessoaJuridica {
	private String produto;
	
	public String getProduto() {
		List<String> produtos = new ArrayList<>();
		produtos.add("Xampus Infantis");
		produtos.add("Tinturas");
		produtos.add("Cremes dentais");
		produtos.add("Fraldas Geriátricas");
		produtos.add("Desodorantes");
		SplittableRandom r = new SplittableRandom();
		return produtos.get(r.nextInt(0, produtos.size()));
	}
}