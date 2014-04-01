package model;

import java.util.Scanner;

import view.BancoTela;

public class Conta {
	
	double saldo;
	int numConta;
	int numVerificacao;
	
	//cria conta comun
	
public void contaComun(){
	System.out.print("Numero da conta: ");
	Scanner teclado = new Scanner(System.in);
	numConta = Integer.parseInt(teclado.next());
	System.out.print("Numero verificação: ");
	Scanner tecladoNumVerificacao = new Scanner(System.in);
	numVerificacao = Integer.parseInt(tecladoNumVerificacao.next());
	
}
	
	
	//Deposito em conta
	public void depositar(){
		double deposito;
		System.out.print("Valor do deposito: ");
		double tecla;
		Scanner teclado = new Scanner(System.in);
		deposito = Double.parseDouble(teclado.next()) ;
		saldo = deposito + getSaldo();
		//System.out.println("Saldo..."+saldo);
	}
	
	
	
	//Sacar se existir saldo
	public void sacar(){
		//System.out.println("Saldo..."+getSaldo());
		double saque = 0;
		
		if (saldo > 0) {
			System.out.println("Valor do Saque: ");
			Scanner teclado = new Scanner(System.in);
			
			
			//Variavel para comparação no if
			
			saque =  Double.parseDouble(teclado.next());
			
			    if(saque > saldo){
				
				   System.out.println("Saldo insuficiente para esse valor de saque !! ");
			
			    }
			  saldo = saldo - saque;
			  
			}
			 
		}
			
		
	
	//Extrato 
	public void extrato(){
		double extrato;
		
		saldo = getSaldo();
		//System.out.println("Extrato... "+getSaldo());
	}
	
	
	
	
	


	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumVerificacao() {
		return numVerificacao;
	}
	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}
	
	
	

}
