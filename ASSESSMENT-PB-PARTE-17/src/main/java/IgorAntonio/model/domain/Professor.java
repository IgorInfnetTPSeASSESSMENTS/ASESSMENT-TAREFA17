package IgorAntonio.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private int matricula;
	private String nome;
	private List<Turma> turmas;
	
	public Professor() {}
	
	public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do professor: " + nome + "\nMatricula do professor: " + matricula;
	}


	public void addTurma(Turma turma) {
	    this.turmas.add(turma);
	    
	}
	
	public void removeTurma(Turma turma) {
        this.turmas.remove(turma);
        turma.addProfessor(this); 
    }
	
	public void exibirTurmas() {
        System.out.println("Turmas do Professor " + nome + ":");
        for (Turma turma : turmas) {
            System.out.println("  - Turma " + turma.getCodigo() + ": " + turma.getDisciplina().getNome());
        }
    }
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
	
}