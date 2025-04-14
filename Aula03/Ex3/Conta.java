public class Conta {
    public Integer numeroConta;
    public String titular;
    public double saldo;

    public Conta(String titular, Integer numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean podeSacar(){
        return saldo > 0;
    }

    public boolean podeDepositar(){
        return numeroConta != null;
    }

    public void exibirInformacoes(){
        System.out.println("Numero da Conta: " + numeroConta + "    Titular: " + titular);
        System.out.println("Pode sacar? " + podeSacar() + "    Saldo: " + saldo);
        System.out.println("Pode depositar: " + podeDepositar());
    }
}