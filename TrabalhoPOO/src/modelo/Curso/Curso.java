package modelo.Curso;

import java.util.ArrayList;

import modelo.Disciplina;
import modelo.Professor.Professor;

public class Curso {

	private String nome;
	private String codigo;
	private String turno;
	private Professor professor;
	private ArrayList<Disciplina> disciplinas;
	
	public Curso(String nome, String codigo, String turno, Professor professor, ArrayList<Disciplina> disciplinas) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.turno = turno;
		this.professor = professor;
		this.disciplinas = disciplinas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
