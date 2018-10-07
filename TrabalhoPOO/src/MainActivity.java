import java.util.ArrayList;

import helper.Storage;
import modelo.Disciplina;
import modelo.Pessoa;
import modelo.Aluno.Aluno;
import modelo.Curso.Curso;
import modelo.Professor.CategoriaENUM;
import modelo.Professor.Professor;

public class MainActivity {

	public static void main(String[] args) {
		
		Professor professor = new Professor("Joaquim", "12412412421", "Rua X", "JoaquimX", "1412421421", CategoriaENUM.Mestre);
		
		Pessoa aluno = new Aluno("Joao Aq", "33141414141", "Rua X", "joao@gmail.com", "94949494");
		
		//Este aluno não possui matricula ao compilar, pq não foi atribuido um curso a ele
		Pessoa aluno2 = new Aluno("Silvanos qs", "21412421", "Rua X", "joao@gmail.com", "94949494");
		
		Storage.initStorage();
		Storage.Adicionar(professor);
		Storage.Adicionar(aluno);
		Storage.Adicionar(aluno2);
		
		//Criando disciplinas
		Disciplina disciplina = new Disciplina("Calculo", "235",(Professor) professor, Storage.getAlunos(), 202, 2, "Matutino");
		Disciplina disciplina2 = new Disciplina("Fisica", "251",(Professor) professor, Storage.getAlunos(), 202, 2, "Noturno");
		
		ArrayList<Disciplina> disciplinas = new ArrayList<>();
		disciplinas.add(disciplina);
		disciplinas.add(disciplina2);
		
		//Criando Curso
		Curso curso = new Curso("Sistemas de Informação", "222", "Matutino", professor, disciplinas);
		
		//Adicionando disciplina a professor
		professor.setDisciplina(disciplina);
		
		//Editando professor
		Storage.Editar(professor);
		
		//listando modificações
		System.out.println(Storage.getByCpf("12412412421", Professor.class).toString());
		
		//Passa o tipo, para saber se quer procurar por aluno ou professor
		Aluno p = (Aluno) Storage.getByCpf("33141414141", Aluno.class);
		System.out.println(p.toString());
		
		//Edita um aluno e adiciona a um curso
		p.setCurso(curso);
		Storage.Editar(p);
		
		//listando alunos apos edição
		ArrayList<Aluno> alunos = Storage.getAlunos();
		for(Aluno a : alunos) {
			System.out.println(a.toString());
		}
		
		//Excluindo aluno
		Storage.Excluir(Storage.getByCpf("33141414141", Aluno.class));
		
	}

}
