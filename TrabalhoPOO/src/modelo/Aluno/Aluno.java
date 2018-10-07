package modelo.Aluno;

import java.util.ArrayList;
import java.util.Calendar;

import modelo.Disciplina;
import modelo.Pessoa;
import modelo.Curso.Curso;

public class Aluno extends Pessoa {

	private Curso curso;
	private String matricula;
	private ArrayList<Disciplina> disciplinas;
	
	public Aluno(
			String nome, String cpf, 
			String endereco, String email, 
			String telefone) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setTelefone(telefone);
		
		
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		//Só terá matricula quando tiver um curso
		this.matricula = curso.getCodigo() +" "+ getCpf().substring(getCpf().length() - 4) +" "+ Calendar.getInstance().get(Calendar.YEAR);
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}
	
	

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		if(disciplinas.size() > 5) {
			System.out.println("Aluno atingiu o limite de disciplinas");
		}else
			this.disciplinas = disciplinas;
	}
	
	public SituacaoEnum statusAluno() {
		if(disciplinas.size() > 0) {
			return SituacaoEnum.Matriculado;
		}else
			return SituacaoEnum.Pendente;
	}

	@Override
	public String toString() {
		return "Aluno [ matricula=" + matricula + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getEndereco()=" + getEndereco() + ", getEmail()=" + getEmail() + ", getTelefone()="
				+ getTelefone() + "]";
	}
	
	
	
}
