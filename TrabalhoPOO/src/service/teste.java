package service;

import modelo.Aluno;
import modelo.Pessoa;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		Aluno.initList();
		aluno.addAluno(new Aluno("Euclides", "04108853376", "endereco", "email", "telefone"));
		aluno.addAluno("Fernando", "03208853376", "endereco", "email", "telefone");
		
		aluno.buscarAluno("04108853376");
		//obj.toString();
//		aluno.editaAluno(obj, "Euclides", "04108853334", "endereco", "email", "telefone");
//		obj.ListaPessoa();
//		
//		aluno.listarAluno();
//		
//		aluno.deletarAluno("04108853376");
//		
//		aluno.listarAluno();
//		
//		
		
	
		
	}

}
