package view;

import java.awt.Menu;
import java.util.Scanner;

import model.Conta;
import model.Especial;
import controller.Banco;

public class BancoTela {
	private static Scanner teclado = new Scanner(System.in); 

	
	public static void menuPrincipal(){
		
		
	}
	
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		Especial e = new Especial();
		//Conta cs = new Conta();
		//menuPrincipal();
		
		 int tecla;
		
		
		do{
			System.out.println("----<<<< Criar Conta >>>>----  ");
			System.out.println("1 - Comum ");
			System.out.println("2 - Especial ");
			System.out.println("3 - Investimentos ");
			System.out.println(" ");
			
			System.out.println("9 - <<<< SAIR >>>> ");
			tecla = Integer.parseInt(teclado.next()) ;	
		
		switch (tecla) {
		
		case 1:
			// Operação conta comum
			 c.contaComun();
			 //tecla operação comum
			 int teclaOC;
			            do {
				             System.out.println("1 - Deposito ");
				             System.out.println("2 - Saque ");
				             System.out.println("3 - Extrato ");
				             System.out.println(" ");
				             
				             System.out.println("9 - <<<< VOLTAR >>>> ");
				             teclaOC = Integer.parseInt(teclado.next());
				 
		             	switch (teclaOC) {
			                    case 1:
			                    	//deposito conta comum
			                     	c.depositar();
		                     		System.out.println("Saldo..."+c.getSaldo());
				
			                   	break;
		                       	case 2:
		                       		//saque conta comum
		                       		c.sacar();
		                    		System.out.println("Saldo..."+c.getSaldo());
			
			                	break;
		                    	case 3:
		                    		c.extrato();
		                    		System.out.println("Numero da conta:  "+c.getNumConta());
		                			System.out.println("Extrato...:  "+c.getSaldo());
			                	break;
		                     	}
		                    	} while (teclaOC != 9);
			 
			 
		                       	break;
			
		case 2:
			//Operação conta especial
			e.contaEsprecial();
			
			int teclaCE;
			
			    do {
				
	                 System.out.println("1 - Deposito ");
	                 System.out.println("2 - Saque ");
	                 System.out.println("3 - Extrato ");
	                 System.out.println(" ");
		             
		             System.out.println("9 - <<<< VOLTAR >>>> ");
	                 teclaCE = Integer.parseInt(teclado.next());
				switch (teclaCE) {
				case 1:
					e.depositar();
					System.out.println("Saldo..."+e.getSaldo());
					 System.out.println(" ");
					 System.out.println(" ");
					
					break;

				case 2:
					e.saqueEspecial();
					System.out.println("Saldo..."+e.getSaldo());
					 System.out.println(" ");
					 System.out.println(" ");
					 
					break;
					
				case 3:
					e.extrato();
					System.out.println("Saldo..."+e.getSaldo());
					System.out.println("Limite..."+e.getLimite());
				}
			} while (teclaCE != 9);
			
			break;
			
		case 5:
			//Conta cs = new Conta();
			
			//menuPrincipal();
		
			break;
		
		case 6:
			
			
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
