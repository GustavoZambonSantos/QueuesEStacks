package QueueFilaePilha;

import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		Stack<String> livro = new Stack<String>();
		int op=1;
		String nome;
		
		System.out.println("Menu opções: ");
		System.out.println("\n1 -Adicionar um novo livro na pilha");
		System.out.println("\n2 - Listar todos os livros");
		System.out.println("\n3 - Retirar um livro ");
		System.out.println("\n0 - Sair");
		
		do {
			System.out.println("\nDigite uma opção: ");
			op = ler.nextInt();
			ler.nextLine();
			
		switch (op) {
		case 1: 
			System.out.println("Digite o nome: ");
			nome = ler.nextLine();
			livro.push(nome);
			System.out.println("\nLivro adicionado");
		
		break;
		case 2:
			if (livro.isEmpty()) {
				System.out.println("A Pilha está vazia");
			}
			else {
			System.out.println("Listar todos os livros ");
			System.out.print(livro);
			}
			break;
		case 3:
			if (livro.isEmpty()) {
				System.out.println("A Pilha está vazia");
			}
			else {
				livro.pop();
			System.out.println("Listar todos os livros ");
			System.out.print(livro);
			System.out.println("\nUm livro foi retirado da pilha ");
			}
			break;	
		case 0:
			System.out.println("Programa Finalizado");
			break;
		default:
			System.out.println("\nOpção Inválida");
		}
		}
		while(op !=0);
	

	
	}

}
