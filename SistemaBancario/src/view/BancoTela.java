package view;

import java.awt.Menu;
import java.util.Scanner;

import model.Conta;
import controller.Banco;

public class BancoTela {
	private static Scanner teclado = new Scanner(System.in); 

	
	public static void menuPrincipal(){
		
		
	}
	
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		//Conta cs = new Conta();
		//menuPrincipal();
		
		 int tecla;
		
		
		do{
			System.out.println("1 - Deposito ");
			System.out.println("2 - Saque ");
			System.out.println("1 - Deposito ");
			System.out.println("9 - <<<< SAIR >>>> ");
			tecla = Integer.parseInt(teclado.next()) ;	
		
		switch (tecla) {
		case 1:
			//Conta c = new Conta();
			c.depositar();
			System.out.println("Saldo..."+c.getSaldo());
			
			//menuPrincipal();
			break;
			
		case 2:
			//Conta cs = new Conta();
			c.sacar();
			System.out.println("Saldo..."+c.getSaldo());
			//menuPrincipal();
		
			break;
		
		case 3:
			c.extrato();
			System.out.println("Extrato..."+c.getSaldo());
			
			break;
		case 9: 
			System.exit(0);
		}
		
		}while(tecla != 9);

	}
	
	public void lerDoTeclado(){
	
		Scanner teclado = new Scanner(System.in); 

	}

}
