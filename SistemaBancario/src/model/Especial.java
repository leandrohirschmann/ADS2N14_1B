package model;

import java.util.Scanner;

public class Especial extends Conta {

	double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	//cria conta exprecial
	
	public void contaEsprecial(){
		System.out.print("Numero da conta: ");
		Scanner teclado = new Scanner(System.in);
		numConta = Integer.parseInt(teclado.next());
		
		System.out.print("Numero verificação: ");
		Scanner tecladoNumVerificacao = new Scanner(System.in);
		numVerificacao = Integer.parseInt(tecladoNumVerificacao.next());
		
		System.out.print("Limite: ");
		Scanner valorLimite = new Scanner(System.in);
		limite = Integer.parseInt(valorLimite.next());
	}
	
	
	public void saqueEspecial(){
		//System.out.println("Limite..."+getLimite());
		//System.out.println("Saldo..."+getSaldo());
		
		if ( saldo > 0 ) {
			System.out.println("Limite..."+getLimite());
			System.out.println("Saldo..."+getSaldo());
			System.out.println("");
			System.out.println("");
			
			System.out.println("Valor do Saque: ");
			Scanner teclado = new Scanner(System.in);
			saldo = saldo  - Double.parseDouble(teclado.next());
			
				if( Double.parseDouble(teclado.next()) > saldo){
					System.out.println("Limite..."+getLimite());
					System.out.println("Saldo..."+getSaldo());
					System.out.println("!!!!!!!!!");
					System.out.println("!!!!!!!!!");
					if(Double.parseDouble(teclado.next()) < limite){
						
						limite = Double.parseDouble(teclado.next()) - limite;
					}else{
					System.out.println("SALDO INSUFISIENTE NO LIMITE DA CONTA !!!");
					}
			}	
			
			 
			
			
			//limite = limite - Double.parseDouble(teclado.next());
		}
		
			else  {
				//Exception();
				
				System.out.println("Saldo Insuficiente CONTA ESPECIAL !!!!!");
			}
	}
}
