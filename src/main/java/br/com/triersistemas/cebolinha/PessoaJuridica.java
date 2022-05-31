package br.com.triersistemas.cebolinha;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class PessoaJuridica extends Pessoa {

	@Override
	public String getDocumento() {
		List<String> cnpj = new ArrayList<>();
		cnpj.add("113.586.329/0001-60");
		cnpj.add("167.892.177/0001-10");
		cnpj.add("029.121.060/0001-01");
		cnpj.add("092.685.017/0001.25");
		cnpj.add("016.718.020/0001-26");
		SplittableRandom r = new SplittableRandom();
		return cnpj.get(r.nextInt(0, cnpj.size()));
	}
}