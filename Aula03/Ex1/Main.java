import java.util.Scanner;

public class Main{

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados doa Alunos
        System.out.println("Digite o RA do aluno: ");
        int RA = scanner.nextInt();
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();

        //Notas dos Alunos
        System.out.println("Digite a nota da prova 1 do aluno: ");
        int P1 = scanner.nextInt();
        System.out.println("Digite a nota da prova 2 do aluno: ");
        int P2 = scanner.nextInt();
        System.out.println("Digite a nota do trabalho 1 do aluno: ");
        int T1 = scanner.nextInt();
        System.out.println("Digite a nota do trabalho 2 do aluno: ");
        int T2 = scanner.nextInt();

        //Criando Aluno como "variável" - instancia da classe
        Aluno aluno = new Aluno(RA,nome,P1,P2,T1,T2);

        //Exibi as infos
        aluno.exibirInfos();

        scanner.close();
    }
}