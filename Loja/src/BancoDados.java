import java.util.ArrayList;

public class BancoDados {

	public static void main(String[] args) {
		
		ArrayList<Cliente> cli = new ArrayList<Cliente>();
		ArrayList<Produto> pro = new ArrayList<Produto>();


		String baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00";
		String[] baseSplit = baseDados.split(";");
		
		for (String b : baseSplit ) {
			
			Cliente c = new Cliente();
			Produto p = new Produto();
			
			
			String[] baseSplit2 = b.split(",");
			
			
			if(baseSplit2[0].startsWith("C")) {
				c.setNome(baseSplit2[0]);
				c.setIdade(Double.parseDouble(baseSplit2[1]));
				c.setCidade(baseSplit2[2]);
				
				cli.add(c);
				
			}
			else {
				p.setNome(baseSplit2[0]);
				p.setQuantidade(Double.parseDouble(baseSplit2[1]));
				p.setPreco(Double.parseDouble(baseSplit2[2]));
				
				pro.add(p);
				
			}
			
		
		
		}
		
			System.out.print("\n  Cliente \n");

			for (Cliente cl : cli) {

				System.out.print(" \n Nome  =  " + cl.getNome().substring(1) + " ");
				System.out.print(" \n Nota  =  " + cl.getIdade() + " ");
				System.out.print(" \n Cidade =  " + cl.getCidade() + " \n");
			}
		 

			System.out.print("\n  Produto \n");
			for (Produto pr : pro) {

				System.out.print(" \n Nome  =  " + pr.getNome().substring(1) + " ");
				System.out.print(" \n Quantidade  =  " + pr.getQuantidade() + " ");
				System.out.print(" \n Preço =  " + pr.getPreco() + " \n" );

			}
		

	}

}
