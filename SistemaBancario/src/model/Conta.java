package model;

import java.util.Scanner;

import view.BancoTela;

public class Conta {
	
	double saldo;
	int numConta;
	int numVerificacao;
	
	
	//Deposito em conta
	public void depositar(){
		System.out.print("Valor do deposito: ");
		double tecla;
		Scanner teclado = new Scanner(System.in);
		saldo = Double.parseDouble(teclado.next()) ;
		saldo = getSaldo();
		//System.out.println("Saldo..."+saldo);
	}
	
	
	
	//Sacar se existir saldo
	public void sacar(){
		System.out.println("Saldo..."+getSaldo());
		
		if (saldo > 0) {
			System.out.print("Valor do Saque: ");
			Scanner teclado = new Scanner(System.in);
			saldo = saldo - Double.parseDouble(teclado.next()); 
		}
			else  {
				//Exception();
				
				System.out.println("Saldo Insuficiente");
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
