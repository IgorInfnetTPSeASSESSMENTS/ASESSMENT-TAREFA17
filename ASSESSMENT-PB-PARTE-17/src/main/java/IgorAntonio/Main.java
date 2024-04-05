package IgorAntonio;

import java.util.ArrayList;
import java.util.List;

import IgorAntonio.model.domain.Aluno;
import IgorAntonio.model.domain.Disciplina;
import IgorAntonio.model.domain.Professor;
import IgorAntonio.model.domain.Turma;

public class Main {
    public static void main(String[] args) {
       
        List<Turma> turmas = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();

     
        Professor professor1 = new Professor(1, "João");
        Professor professor2 = new Professor(2, "José");

        
        professores.add(professor1);
        professores.add(professor2);

     
        Disciplina disciplina1 = new Disciplina(1, "Java");
        Disciplina disciplina2 = new Disciplina(2, ".Net");
        Disciplina disciplina3 = new Disciplina(3, "PB");

        
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);

        
        Aluno aluno1 = new Aluno(1, "Aluno 1");
        Aluno aluno2 = new Aluno(2, "Aluno 2");
        Aluno aluno3 = new Aluno(3, "Aluno 3");
        Aluno aluno4 = new Aluno(4, "Aluno 4");

      
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        
        Turma turma1 = new Turma(1, disciplina1, professor1);
        Turma turma2 = new Turma(2, disciplina2, professor2);
        Turma turma3 = new Turma(3, disciplina3, professor2);

      
        turma1.addAluno(aluno1);
        turma1.addAluno(aluno2);
        turma2.addAluno(aluno3);
        turma2.addAluno(aluno4);

  
        turmas.add(turma1);
        turmas.add(turma2);
        turmas.add(turma3);
        
        for (Turma turma : turmas) {
            turma.getDisciplina().addTurma(turma);
            turma.getProfessor().addTurma(turma);
            for (Aluno aluno : turma.getAlunos()) {
                aluno.addTurma(turma);
            }
        }

     // Exibindo as turmas com as disciplinas e professores associados
        System.out.println("Alocação de Turmas:");
        for (Turma turma : turmas) {
            System.out.println("Turma: " + turma.getCodigo());
            System.out.println("Disciplina: " + turma.getDisciplina().getNome() + " Professor: " + turma.getProfessor().getNome());
        }
        System.out.println();

        // Exibindo a pauta da turma 1
        System.out.println("Pauta da turma: 1");
        System.out.println("Disciplina: " + turma1.getDisciplina().getNome());
        System.out.println("Professor: " + turma1.getProfessor().getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : turma1.getAlunos()) {
            System.out.println(aluno.getNome());
        }
        System.out.println();

        // Realizando a alocação do aluno 1
        System.out.println("Alocação do aluno: " + aluno1.getNome());
        System.out.println(aluno1.getTurmas());
        System.out.println();

        // Realizando a alocação do aluno 2
        System.out.println("Alocação do aluno: " + aluno2.getNome());
        System.out.println(aluno2.getTurmas());
        System.out.println();
        
        // Realizando a alocação do professor José
        System.out.println("Alocação do Professor: " + professor2.getNome());
        System.out.println(professor2.getTurmas());
        System.out.println();

        // Realizando a alocação da disciplina .Net
        System.out.println("Alocação da disciplina: " + disciplina2.getNome());
        System.out.println(disciplina2.getTurmas());

    }
}
