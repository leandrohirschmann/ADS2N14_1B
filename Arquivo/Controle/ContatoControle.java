package Controle;

import java.util.Random;

import Model.ContatoModel;
import View.View;

public class ContatoControle {

	private ContatoModel contato = new ContatoModel();
	Random geraRandom = new Random();
	private View view = new View();
	public String gerarNome() {

		int nome1, nome2;

		String nomes[] = { "LEANDRO", "PAULO", "ANTONIA", "PAULA", "VALESSA",
				"ROBERTA", "BARBARA", "PRISCILA", "DORA", "SARA", "CARLOS", "JOSUÉ",
				"CAMILY", "RENATA", "LETICIA", "ANDERSON", "JOAQUIM", "ELIZABETE",
				"CATIA", "FABIO" };
				String nome = "";
				nome1 = geraRandom.nextInt(20);
		String sobrenomes[] = { "HIRSCHMANN", "SILVA", "PERES", "RICARDO", "SOUZA",
				"FERRO", "PINTO", "SILVEIRA", "MOREIRA", "FERREIRA", "SKOL",
				"BRAHMA", "PEREIRA", "SILVA DA SILVA", "MOURA", "BIC", "RAIZES",
				"SOBRENOMEQUALQUER", "GAUCHO", "CATARINA" };
				String sobrenome = "";
				nome2 = geraRandom.nextInt(20);

		nome = nomes[nome1];
		sobrenome = sobrenomes[nome2];
		return nome + " " + sobrenome;
	}

	public String gerarEndereco() {

		int endereco;
		String enderecos[] = { "Rua Sao Pedro", "Rua Santo Antônio",
				"Rua São Paulo", "Rua Amazonas", "Rua Quinze De Novembro", "Rua Santa Catarina",
				"Rua Rui Barbosa", "Rua Santos Dumont", "Rua Rio De Janeiro",
				"Rua Tiradentes", "Rua Sete de Setembro", "Rua Projetada " };
		endereco = geraRandom.nextInt(12);
		return enderecos[endereco];
	}

	public String gerarTipoTelefone() {

		int tipoTelefone;
		String tipos[] = { "Comercial", "Particular", "Casa" };
		tipoTelefone = geraRandom.nextInt(3);
		return tipos[tipoTelefone];

	}
	public String geraTelefone() {
		return (this.geraRandom.nextInt(1000 - 100) + 100) + "-" + (this.geraRandom.nextInt(10000 - 1000) + 1000);
	}
	public void geraLista() {

		this.contato.setNome(this.gerarNome());
		this.contato.setEndereco(this.gerarEndereco());
		this.contato.setTelefone(this.geraTelefone());
		this.contato.setTipo(this.gerarTipoTelefone());

		view.imprimeContato(this.contato.getNome(), this.contato.getEndereco(),
				this.contato.getTelefone(), this.contato.getTipo());	}
}