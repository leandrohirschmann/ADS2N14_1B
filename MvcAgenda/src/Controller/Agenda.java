package Controller;
import static java.lang.System.out;



import java.util.ArrayList;
import java.util.Random;


public class Agenda {

 
  
 
		
		public void geraDdd(){
			//CASA
			Random rdddCasa = new Random();
			int ddd;
			ddd = rdddCasa.nextInt(99);
			
			
			Random r1Casa = new Random();
			int numero;
			numero = r1Casa.nextInt(999);
			
			
			Random r2Casa = new Random();
			int numero4;
			numero4 = r2Casa.nextInt(9999);
			
			
			//Celular
			Random rdddCelular = new Random();
			int dddc;
			dddc = rdddCelular.nextInt(99);
		
			
			Random r1Celular = new Random();
			int numeroc;
			numeroc = r1Celular.nextInt(999);
			
			
			Random r2Celular = new Random();
			int numero4c;
			numero4c = r2Casa.nextInt(9999);
			
			//Trabalho
			Random rdddTrabalho = new Random();
			int dddt;
			dddt = rdddCelular.nextInt(99);
		
			
			Random r1Trabalho = new Random();
			int numerot;
			numerot = r1Celular.nextInt(999);
			
			
			Random r2Trabalho = new Random();
			int numero4t;
			numero4t = r2Casa.nextInt(9999);
			
			System.out.println("Telefone Casa: "+"("+ddd+")"+" "+numero+" - "+numero4);
			System.out.println("Telefone Celular: "+"("+dddc+")"+" "+numeroc+" - "+numero4c);
			System.out.println("Telefone Trabalho: "+"("+dddt+")"+" "+numerot+" - "+numero4t);
			System.out.println("\n");
		}
		
		
		
		
		
		public void sorteiaNome ()
		{
			Random gerador = new Random();
				
		//Gera lista de nomes
			ArrayList<String> listaNomes = new ArrayList() ;
			listaNomes.add ("Leandro");
			listaNomes.add ("Anderson");
			listaNomes.add ("Mara");
			listaNomes.add ("Antonio");
			listaNomes.add ("Antonia");
			listaNomes.add ("João");
			listaNomes.add ("Carla");
			listaNomes.add ("Daniele");
			listaNomes.add ("Marta");
			listaNomes.add ("Ronaldo");
			listaNomes.add ("Rafael");
			listaNomes.add ("Paulo");
			
			int numNome=gerador.nextInt(12);
			
			 
			
			//Gera lista de sobrenomes
			ArrayList<String> listaSobreNomes = new ArrayList() ;
			listaSobreNomes.add ("Silva");
			listaSobreNomes.add ("Rodrigues");
			listaSobreNomes.add ("Rodrigues");
			listaSobreNomes.add ("Sobre Nome");
			listaSobreNomes.add ("Mendes");
			listaSobreNomes.add ("Schneider");
			listaSobreNomes.add ("Oliveira");
			listaSobreNomes.add ("MMMMMMM");
			listaSobreNomes.add ("Camara");
			listaSobreNomes.add ("Garbelotti");
			listaSobreNomes.add ("Nolasco");
			listaSobreNomes.add ("Sei Lá");
			listaSobreNomes.add ("da Silva");
			listaSobreNomes.add ("dos Santos");
			listaSobreNomes.add ("Silva da Silva");
			listaSobreNomes.add ("Smith");
			listaSobreNomes.add ("Schumacher");
			listaSobreNomes.add ("Santos");
			listaSobreNomes.add ("Fernandes");
			listaSobreNomes.add ("Cusato");
			listaSobreNomes.add ("Costa");
			
			int numSobreNome=gerador.nextInt(21);
			
			System.out.println(listaNomes.get(+numNome)+" "+listaSobreNomes.get(numSobreNome));
			
					
		}
		
		
		//Gera Endereço
		
		public void geradorEndereco ()
		{
			//Gera tipo
			ArrayList<String> listaTipo = new ArrayList() ;
			listaTipo.add ("Avenida");
			listaTipo.add ("Praça");
			listaTipo.add ("Rua");
			
			//Gera lista de Endereços
			ArrayList<String> listaEndereco = new ArrayList() ;
			listaEndereco.add ("Maua");
			listaEndereco.add ("Brasil");
			listaEndereco.add ("Mauricio Lessa");
			listaEndereco.add ("Dos Presidentes");
			listaEndereco.add ("Sete de setembro");
			
			Random gerador = new Random();
			
			int numTipo=gerador.nextInt(3);
			int numEndereco = gerador.nextInt(5);
			
			System.out.println(listaTipo.get(+numTipo)+" "+listaEndereco.get(numEndereco));
			
		}
		
		
	
}
