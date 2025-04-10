import java.util.Scanner;

    public class Main{

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Dados iniciais do aluno
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.println("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        //Dados métricos aluno
        System.out.println("Digite o peso do aluno: ");
        int peso = scanner.nextInt();
        System.out.println("Digite a altura do aluno: ");
        int altura = scanner.nextInt();

        //Criando Aluno como "variável" - instancia da classe
        Aluno aluno = new Aluno(nome, idade, peso, altura);

        //exibir infos
        aluno.exibirInfos();
        scanner.close();

    }
}