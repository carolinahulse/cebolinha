package br.com.triersistemas.cebolinha;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class PessoaFisica extends Pessoa {

	@Override
	public String getDocumento() {
		List<String> cpf = new ArrayList<>();
		cpf.add("113.586.329-60");
		cpf.add("167.892.177-10");
		cpf.add("029.121.060-01");
		cpf.add("092.685.017.25");
		cpf.add("016.718.020-26");
		SplittableRandom r = new SplittableRandom();
		return cpf.get(r.nextInt(0, cpf.size()));
	}
}