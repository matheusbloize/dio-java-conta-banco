package com.matheusbloize.dio.lab;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero;
		String agencia, nomeCliente;
		float saldo;

		System.out.println("Bem-vindo(a) ao Banco!");
		System.out.println("Por favor, informe as seguintes informações para criar sua conta.");

		System.out.println("Número: ");
		numero = input.nextInt();
		System.out.println("Agência: ");
		agencia = input.next();
		System.out.println("Nome: ");
		nomeCliente = input.next();
		System.out.println("Saldo: ");
		saldo = input.nextFloat();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
		input.close();
	}
}
