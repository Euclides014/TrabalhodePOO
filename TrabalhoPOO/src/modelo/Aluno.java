package modelo;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	Curso curso;

	static ArrayList<Aluno> listaAluno;
	
	public static void initList(){
		listaAluno = new ArrayList<Aluno>();
	}
	
	

	public Aluno(String Nome, String Cpf, String endereco, String email, String telefone) {
		
	}



	public ArrayList<Aluno> getlistaAluno() {
		return this.listaAluno;
	}

	// Criar Aluno
	public void addAluno(Aluno aluno) {
		try {
			listaAluno.add(aluno);
			System.out.println("Aluno adicionado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Editar Aluno

	public void editaAluno(Pessoa obj, String Nome, String Cpf, String endereco, String email, String telefone) {
		obj.setNome(Nome);
		obj.setcpf(Cpf);
		obj.setEndereco(endereco);
		obj.setEmail(email);
		obj.setTelefone(telefone);

	}

	// Pesquisa

	public void buscarAluno(String Cpf) {
		for (Aluno a : listaAluno) {
			System.out.println(a.toString());
		}
//		System.out.println("Aluno nao encontrado...");
//		return null;

	}
	// Excluir Aluno

	public void deletarAluno(String Cpf) {
		//listaAluno.remove(buscarAluno(Cpf));
	}

	// Lista Professor

	public void listarAluno() {
		for (Pessoa pessoa : listaAluno) {
			pessoa.ListaPessoa();
		}
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", email="
				+ email + ", telefone=" + telefone + "]";
	}
	
	

}
