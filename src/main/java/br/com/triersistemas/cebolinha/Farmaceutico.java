package br.com.triersistemas.cebolinha;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Farmaceutico extends PessoaFisica {
	private String ofertaDoDia;
	
	public String getOfertaDoDia() {
		List<String> ofertas = new ArrayList<>();
		ofertas.add("10% desconto - Linha de higiene");
		ofertas.add("Queima de estoque - Xampus Masculino");
		ofertas.add("5% desconto - Alimentos de bebê");
		ofertas.add("15% desconto - Clientes com cadastro");
		ofertas.add("8% desconto - Primeira compra");
		SplittableRandom r = new SplittableRandom();
		return ofertaDoDia = ofertas.get(r.nextInt(0, ofertas.size()));
	}
}