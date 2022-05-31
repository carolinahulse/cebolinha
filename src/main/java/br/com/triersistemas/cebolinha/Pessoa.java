package br.com.triersistemas.cebolinha;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class Pessoa {
	private String nome;
	
	public Pessoa() {
		List<String> nomes = new ArrayList<>();
		nomes.add("Bianca");
		nomes.add("Vitória");
		nomes.add("Caethana");
		nomes.add("Kay");
		nomes.add("Amanda");
		SplittableRandom r = new SplittableRandom();
		this.nome = nomes.get(r.nextInt(0, nomes.size()));
	}

	public String getNome() {
		return nome;
	}
	
	public abstract String getDocumento();
}