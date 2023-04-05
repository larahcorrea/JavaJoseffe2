public class teste {


    public static void main(String[] args) {


        String valor = "FIAP - Joseffe";


        System.out.println(valor.substring(1 ));
    }
}


if (baseSplit2[0].startsWith("C")) {

	System.out.print("\n  Cliente \n");

	for (Cliente cl : cli) {

		System.out.print(" \n Nome  =  " + cl.getNome().substring(1) + " ");
		System.out.print(" \n Nota  =  " + cl.getIdade() + " ");
		System.out.print(" \n Cidade =  " + cl.getCidade() + " ");
	}
} else {

	System.out.print("\n  Produto \n");
	for (Produto pr : pro) {

		System.out.print(" \n Nome  =  " + pr.getNome().substring(1) + " ");
		System.out.print(" \n Quantidade  =  " + pr.getQuantidade() + " ");
		System.out.print(" \n Preço =  " + pr.getPreco() + " ");

	}
}