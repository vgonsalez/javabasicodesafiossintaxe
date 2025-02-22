package com.SimulandoUmaContaBancariaDIO;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Lê entradas do terminal
        Scanner scanner = new Scanner(System.in);

        //Solicita e lê o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        //Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt()

        //Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        //Solicita e lê o saldo da conta
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        //Encerra a função de leitura de entradas
        scanner.close();

        //Mensagem final com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}