import java.util.HashMap;

public class Vestibular {
	public static void main(String[] args) {

		HashMap<Integer, aluno> vest = new HashMap<Integer, aluno>();

		String alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo";
		String[] alunosSplit = alunosVestibular.split(";");

		int id;
		id = 0;
		Double nota;

		

		for (String v : alunosSplit) {
			aluno a = new aluno();

			String[] alunosSplit2 = v.split(",");
			
			if(Double.parseDouble(alunosSplit2[1])<7)
					continue;
			
			id++;
			a.setNome(alunosSplit2[0]);
			a.setNota(Double.parseDouble(alunosSplit2[1]));
			a.setCidade(alunosSplit2[2]);
			
			vest.put(id, a);

			
		}

		vest.forEach((key, value) -> {
			System.out.print(key + " \n Nome  =  " + value.getNome() + " " );
			System.out.print(key + " \n Nome  =  " + value.getNome() + " " );
			System.out.print(key + " \n Nota  =  " + value.getNota() + " ");
			System.out.print(key + " \n Cidade =  " +  value.getCidade() + " ");
		});

	}
}
