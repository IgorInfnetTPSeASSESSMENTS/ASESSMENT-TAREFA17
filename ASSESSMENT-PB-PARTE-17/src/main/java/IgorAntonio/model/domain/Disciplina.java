package IgorAntonio.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private int codigo;
	private String nome;
	private List<Turma> turmas;
    
    public Disciplina(int codigoDisciplina, String nomeDisciplina) {
        this.codigo = codigoDisciplina;
        this.nome = nomeDisciplina;
        this.turmas = new ArrayList<>();
    }
    
	@Override
	public String toString() {
		
		return "Nome da disciplina: " + nome + "\nCodigo da disciplina: " + codigo;	
	}
	
	public void addTurma(Turma turma) {
	    this.turmas.add(turma);
	    
	}
	
	public void removeTurma(Turma turma) {
        this.turmas.remove(turma);
        turma.addDisciplina(this); 
    }
	
	public void exibirTurmas() {
        System.out.println("Turmas da disciplina: " + nome + ":");
        for (Turma turma : turmas) {
            System.out.println("  - Turma " + turma.getCodigo() + ": " + turma.getDisciplina().getNome());
        }
    }
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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