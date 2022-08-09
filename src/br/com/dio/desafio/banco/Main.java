package br.com.dio.desafio.banco;

public class Main {
    public static void main(String[] args) {

        Cliente rita = new Cliente();
        rita.setNome("Rita");

        Conta cc = new ContaCorrente(rita);
        Conta poupanca = new ContaPoupanca(rita);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
