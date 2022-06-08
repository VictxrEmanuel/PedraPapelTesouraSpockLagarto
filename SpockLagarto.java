package Jokenpo;

import java.util.Random;
import java.util.Scanner;

public class SpockLagarto {
	
	static Scanner console = new Scanner(System.in);
	static Random aleatorio = new Random();
	
	static int Regras [][] = {
			{0,-1,1,1,1},
			{1,0,-1,-1,1},
			{-1,1,0,1,-1},
			{-1,1,-1,0,1},
			{1,-1,1,-1,0}
	};
	static final String[] opcoes = {"Pedra","Papel","Tesoura","Lagarto","Spock"};
	static int ganhou = 1;
	static int empatou = 0;
	static int perdeu = -1;
	
	static int obterOpcaoComp() {
		return aleatorio.nextInt(Regras.length);
	}
	
	static int lerOpcaoJog() {
		System.out.println("[0]Pedra");
		System.out.println("[1]Papel");
		System.out.println("[2]Tesoura");
		System.out.println("[3]Lagarto");
		System.out.println("[4]Spock");
		System.out.println("Opção: ");
		
		return console.nextInt();
	}
	
	static void jogar() {
		int jogador = lerOpcaoJog();
		int computador = obterOpcaoComp();
		
		System.out.printf("\nJogador 1: %s",opcoes[jogador]);
		System.out.printf("\nComputador: %s",opcoes[computador]);
		
		System.out.println();
		
		
		if (Regras[jogador][computador] == ganhou) {
			System.out.println("Parabéns você Ganhou!!!");
		}else if (Regras[jogador][computador] == empatou) {
			System.out.println("Empate!");
		}else if (Regras[jogador][computador] == perdeu) {
			System.out.println("O computador Ganhou!!!");
		}
		
	}
	static void menu() {
		System.out.println("Menu");
		System.out.println("[1] Jogar");
		System.out.println("[2] Sair");
		
		System.out.println("Opção: ");
	    byte opcao = console.nextByte();
	    
	    switch (opcao) {
	    case 1:
	    	jogar();
	    	menu();
	    	break;
	    case 2:
	    	System.exit(0);
	    	break;
	    default:
	    	menu();
	    	break;
	    }
	    
	}
	
	
	public static void main(String[] args) {
		menu();

	}

}
