package modelo;

import java.util.ArrayList;

import modelo.Aluno.Aluno;
import modelo.Professor.Professor;

public class Disciplina {
	
	private String nome;
	private String codigo;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	private int sala;
	private int cargaHoraria;
	private String horario;
	private int custo;
	
	
	public Disciplina(String nome, String codigo, Professor professor, ArrayList<Aluno> alunos, int sala,
			int cargaHoraria, String horario) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.professor = professor;
		this.alunos = alunos;
		this.sala = sala;
		this.cargaHoraria = cargaHoraria;
		this.horario = horario;
		
		setupCusto();
	}
	
	private void setupCusto() {
		switch (professor.getCategoria()) {
		case Especialista:
			this.custo = 25 * this.cargaHoraria;
			break;
		case Mestre:
			this.custo = 35 * this.cargaHoraria;
			break;
		case Doutor:
			this.custo = 45 * this.cargaHoraria;
			break;
		default:
			break;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public int getSala() {
		return sala;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public String getHorario() {
		return horario;
	}
	public int getCusto() {
		return custo;
	}
	
}
