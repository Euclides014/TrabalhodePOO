package modelo;

import java.util.ArrayList;

public class Professor extends Pessoa {
	
	private CategoriaENUM categoria;
	

public CategoriaENUM getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaENUM categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Professor> getListaProfessor() {
		return listaProfessor;
	}

	public void setListaProfessor(ArrayList<Professor> listaProfessor) {
		this.listaProfessor = listaProfessor;
	}

ArrayList<Professor>listaProfessor = new ArrayList();
	
	public ArrayList<Professor> getlistaProfessor(){
		return this.listaProfessor;
}
		
		// Criar Professor
		public void addProfessor(String Nome, String Cpf, String endereco, String email, String telefone){
			Professor p1 = new Professor();
			listaProfessor.add(p1);
		}
		
		// Editar Professor
		
		public void editaPessoa(Pessoa obj, String Nome, String Cpf, String endereco, String email, String telefone){
			obj.setNome(Nome);
			obj.setcpf(Cpf);
			obj.setEndereco(endereco);
			obj.setEmail(email);
			obj.setTelefone(telefone);
				
		}
		
		// Pesquisa 
		
		public Pessoa buscarProfessor(String Cpf){
			for (Pessoa pessoa : listaProfessor) {
				if(pessoa.getcpf().equals(Cpf)) {
					return pessoa;
				}
			}
			System.out.println("Professor nao encontrado...");
			return null;
			
		}		
		// Excluir Professor
		
		public void deletarProfessor (String Cpf){
			listaProfessor.remove(buscarProfessor(Cpf));
		}
		
		public void listarProfessor(){
			for (Pessoa pessoa : listaProfessor){
				pessoa.ListaPessoa();
			}
	}

}