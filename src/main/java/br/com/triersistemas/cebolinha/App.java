package br.com.triersistemas.cebolinha;
public class App {

    public static void main(String[] args) {
    	Fornecedor fornecedor1 = new Fornecedor();
        Farmaceutico farmaceutico1 = new Farmaceutico();
        
        System.out.println("Fornecedor: "+fornecedor1.getNome()+"\nCNPJ: "+fornecedor1.getDocumento()+"\nProduto: "+fornecedor1.getProduto());
        System.out.println("-------------------------");
        System.out.println("Farmaceutico: "+farmaceutico1.getNome()+"\nCPF: "+farmaceutico1.getDocumento()+"\nOferta do dia: "+farmaceutico1.getOfertaDoDia());
    }
}