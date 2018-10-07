package helper;

import java.util.ArrayList;

import modelo.Pessoa;
import modelo.Aluno.Aluno;
import modelo.Professor.Professor;

public class Storage {

	private static ArrayList<Aluno> listaAluno;
	private static ArrayList<Professor> listaProfessor;

	public static void initStorage() {
		listaAluno = new ArrayList<>();
		listaProfessor = new ArrayList<>();
	}

	public static void Adicionar(Pessoa pessoa) {
		switch (pessoa.getClass().getSimpleName()) {
		case "Professor":
			listaProfessor.add((Professor) pessoa);
			System.out.println("Professor Adicionado com sucesso!");
			break;
		case "Aluno":
			listaAluno.add((Aluno) pessoa);
			System.out.println("Aluno Adicionado com sucesso!");
			break;
		default:
			break;
		}
	}

	public static void Editar(Pessoa pessoa) {
		switch (pessoa.getClass().getSimpleName()) {
		case "Professor":
			Professor professor = (Professor) pessoa;
			System.out.println("Editando aluno: " + professor.getNome());
			listaProfessor.set(listaProfessor.indexOf(professor), professor);
			break;
		case "Aluno":
			Aluno aluno = (Aluno) pessoa;
			System.out.println("Editando aluno: " + aluno.getNome());
			listaAluno.set(listaAluno.indexOf(aluno), aluno);
			break;

		default:
			break;
		}
	}
	
	public static void Excluir(Pessoa pessoa) {
		switch (pessoa.getClass().getSimpleName()) {
		case "Professor":
			Professor professor = (Professor) pessoa;
			try {
				listaProfessor.remove(listaProfessor.indexOf(professor));
				System.out.println("Professor deletado !");
			} catch (Exception e) {
				System.out.println("Professor não encontrado");
				System.out.println(e.getMessage());
			}
			break;
		case "Aluno":
			Aluno aluno = (Aluno) pessoa;
			try {
				listaAluno.remove(listaAluno.indexOf(aluno));
				System.out.println("Aluno deletado !");
			} catch (Exception e) {
				System.out.println("Aluno não encontrado");
				System.out.println(e.getMessage());
			}
			break;
		default:
			break;
		}

	}

	public static Pessoa getByCpf(String cpf, Class<?> pessoa) {
		switch (pessoa.getSimpleName()) {
		case "Professor":
			for (Professor p : listaProfessor) {
				if (p.getCpf().equals(cpf)) {
					return p;
				}
			}
			break;
		case "Aluno":
			for (Aluno a : listaAluno) {
				if (a.getCpf().equals(cpf)) {
					return a;
				}
			}
			break;
		default:
			break;
		}
		return null;
	}

	public static ArrayList<Aluno> getAlunos() {
		return listaAluno;
	}

	public static ArrayList<Professor> getProfessores() {
		return listaProfessor;
	}

}
