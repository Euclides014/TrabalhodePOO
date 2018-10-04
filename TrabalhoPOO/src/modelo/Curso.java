package modelo;

import java.util.ArrayList;

public class Curso {

	String nome;
	String codigo;
	Professor professor;

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

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	ArrayList<Curso> listaCurso = new ArrayList();

	public ArrayList<Curso> getlistaCurso() {
		return this.listaCurso;

	}

	// Criar Curso
	public void addCurso(String Nome, String codigo, String professor) {
		this.listaCurso.add(new Curso());
	}

	// Editar Curso

	public void editaCuros(Curso obj, String Nome, String codigo, Professor professor) {
		obj.setNome(Nome);
		obj.setCodigo(codigo);
		obj.setProfessor(professor);
	}

	public Curso buscarCurso(String codigo) {
		for (Curso curso : listaCurso) {
			if (curso.getCodigo().equals(codigo)) {
				return curso;
			}
		}
		System.out.println("Curso nao encontrado...");
		return null;

	}

	public void deletarCurso(String codigo) {
		listaCurso.remove(buscarCurso(codigo));
	}

}
