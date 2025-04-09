public class Aluno {

    private int RA;
    private String nome;
    private double P1;
    private double P2;
    private double T1;
    private double T2;

    public Aluno(int RA, String nome, int P1, int P2, int T1, int T2) {
        this.RA = RA;
        this.nome = nome;
        this.P1 = P1;
        this.P2 = P2;
        this.T1 = T1;
        this.T2 = T2;
    }

    // metodo = função de c

    public double calcularMedia(){
        return (P1 + P2 + T1 + T2)/4;
    }

    public boolean estaAprovado(){
        return calcularMedia() >= 5.0;
    }

    public void exibirInfos(){
        System.out.println("RA: " + RA);
        System.out.println("Nome: " + nome);
        System.out.println("Media Final: " + calcularMedia());
        System.out.println("Aprovado: " + estaAprovado());
    }


}