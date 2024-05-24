package aula12;

import java.util.*;

public class MainTesteMapaAluno {
    public static void main(String[] args) {
        SortedMap<Integer, Aluno> mapaAlunos = new TreeMap<Integer, Aluno>(); 
        Scanner scanner = new Scanner(System.in);

        Aluno aluno1 = new Aluno(1000, "Eduardo", 19, "CC");
        Aluno aluno2 = new Aluno(2000, "Rafael", 20, "CC");
        Aluno aluno3 = new Aluno(3000, "Júlia", 19, "CC");
        Aluno aluno4 = new Aluno(4000, "Isabela", 19, "CC");
        Aluno aluno5 = new Aluno(5000, "Henrique", 19, "CC");

        mapaAlunos.put(aluno1.getMatricula(), aluno1);
        mapaAlunos.put(aluno2.getMatricula(), aluno2);
        mapaAlunos.put(aluno3.getMatricula(), aluno3);
        mapaAlunos.put(aluno4.getMatricula(), aluno4);
        mapaAlunos.put(aluno5.getMatricula(), aluno5);

        System.out.println("Informe a matrícula que deseja procurar: ");
        int matricula = scanner.nextInt();

        if (mapaAlunos.containsKey(matricula)) {
            Aluno aluno = mapaAlunos.get(matricula);
            System.out.println("Aluno encontrado: " + aluno.getNome());
        } else {
            System.out.println("Aluno não encontrado!");
        }

        scanner.close();
    }
}
