package exercicios;

public class ContaBancaria {
    private double saldo;
    private  String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            System.out.println("Depositado com sucesso!");
        }else{
            System.out.println("Valor insuficiente!");
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor < saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Valor do saque inválido");
        }
    }
    public double verificarSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1500, "Joao");
        conta.depositar(500);
        System.out.println("saldo após deposito: " + conta.verificarSaldo());
        System.out.println("----------------------------------------------");
        conta.sacar(250);
        System.out.println("Saldo pós sacar: " + conta.verificarSaldo());
        System.out.println("----------------------------------------------");
        conta.sacar(1800);
        System.out.println("Saldo após tentativa de saque: " + conta.verificarSaldo());




    }

}
