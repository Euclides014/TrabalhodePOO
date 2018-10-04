package modelo;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private String codigodaDisciplina;
	Professor professor;
	private int sala;
	private String horario;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigodaDisciplina() {
		return codigodaDisciplina;
	}
	public void setCodigodaDisciplina(String codigodaDisciplina) {
		this.codigodaDisciplina = codigodaDisciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	static ArrayList<Disciplina> listaDisciplina = new ArrayList();

	public ArrayList<Disciplina> getlistaDiscipliba() {
		return this.listaDisciplina;
	}
	
	ArrayList<Aluno> listaAluMatri = new ArrayList();
	
	public ArrayList<Aluno> getlistaAluMatri(){
		return this.listaAluMatri;
	}
	

}
