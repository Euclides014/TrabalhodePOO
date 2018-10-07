package modelo.Professor;


import modelo.Disciplina;
import modelo.Pessoa;

public class Professor extends Pessoa {

	private CategoriaENUM categoria;
	private Disciplina disciplina;

	public Professor(String nome, String cpf, String endereco, 
			String email, String telefone, CategoriaENUM categoria) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setTelefone(telefone);
		this.categoria = categoria;
	}

	public CategoriaENUM getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaENUM categoria) {
		this.categoria = categoria;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Professor [getCategoria()=" + getCategoria() + ", getDisciplina()=" + getDisciplina().getNome() + ", getNome()="
				+ getNome() + ", getCpf()=" + getCpf() + ", getEndereco()=" + getEndereco() + ", getEmail()="
				+ getEmail() + ", getTelefone()=" + getTelefone() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass()  + "]";
	}
	
	

}