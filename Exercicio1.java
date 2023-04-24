package QueueFilaePilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		int op;
		String nome;
		
		System.out.println("Menu opções: ");
		System.out.println("\n1 -Adicionar Cliente na Fila");
		System.out.println("\n2 - Listar todos os clientes");
		System.out.println("\n3 - Retirar Cliente da Fila");
		System.out.println("\n0 - Sair");
		
	
		do {
			System.out.println("\n\t\tEntre com a opção desejada");
		op = ler.nextInt();
		ler.nextLine();
		
		switch (op) {
		case 1:
			System.out.println("Digite o nome: ");
			nome = ler.nextLine();
			fila.add(nome);
			System.out.println("\nCliente adicioanado!!");
			
		break;
		case 2:
			if (fila.isEmpty()) {
				System.out.println("A Fila está vazia");
			}
			else {
			System.out.println("Lista de clientes na fila ");
			System.out.print(fila);
			}
		break;
		case 3:
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia");
			}
			else {
			fila.remove();
			System.out.println("Fila: ");
			System.out.print(fila);
			System.out.println("\nO cliente foi chamado!");
			}
		break;
		case 0:
			System.out.println("Programa finalizado");
		break;
		default:
			System.out.println("\nOpção Inválida, favor digitar uma opção válida");
		}
		}
		while (op !=0);
	}



	}
	
	
