package IgorAntonio.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private int codigo;
	private Professor professor;
	private Disciplina disciplina;
	private List<Aluno> alunos;
	private List<Professor> professores;
	private List<Disciplina> disciplinas;
	
	public Turma(int idTurma, Disciplina disciplina, Professor professor) {
        this.codigo = idTurma;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>(); 
        this.disciplinas = new ArrayList<>(); 
    }
	
	@Override
	public String toString() {
	    return "Turma: " + codigo + "\nDisciplina: " + disciplina.getNome() + "\nProfessor: " + professor.getNome();
	}


	public int getIdTurma() {
        return codigo;
    }
	
	 public String addAluno(Aluno aluno) {
	        alunos.add(aluno);
	        return "Aluno " + aluno.getNome() + " incluído com sucesso na turma " + this.codigo;
	    }

	public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }
	
	 public String addProfessor(Professor professor) {
	        professores.add(professor);
	        return "Professor " + professor.getNome() + " incluido com sucesso!";
	    }

	
	public void removeProfessor(Professor professor) {
        this.professores.remove(professor);
    }
	
	public String addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        return "Disciplina " + disciplina.getNome() + " incluido com sucesso!";
    }
	
	public void removeDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }
	
	public void exibirAlunos() {
	    System.out.println("Alunos da Turma " + codigo + ":");
	    for (Aluno aluno : alunos) {
	        System.out.println("  - Aluno " + aluno.getMatricula() + ": " + aluno.getNome());
	    }
	}
	
	public boolean abrirTurma() {
		if(alunos.size() < 2) {
			System.out.println("Turma não pode ser aberta! Número de alunos insuficiente!\n");
			return false;
		}
		
		if(alunos.size() > 10) {
			System.out.println("Turma nao pode ser aberta! Número de alunos ultrapassou o limite de alunosc por turma!\n");
			return false;
		}
 		System.out.println("Turma aberta com sucesso!\n");
		return true;
	}
	
	public String gerarPauta() {
		return "Codigo da turma: " + codigo + "\nNome da disciplina: " +
							disciplina.getNome() + "\nNome do professor: " +
							professor.getNome() + "\nAlunos: " +
							getAlunos();					
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int ccdigo) {
		this.codigo = ccdigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
}
