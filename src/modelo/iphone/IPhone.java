package modelo.iphone;

import modelo.internet.NavegadorInternet;
import modelo.musica.ReprodutorMusical;
import modelo.telefone.Telefone;

public class IPhone implements ReprodutorMusical, Telefone, NavegadorInternet {

	@Override
	public void navegarNaInternet() {
		System.out.println("Navegando na internet através do iPhone");
	}

	@Override
	public void enviarEmail() {
		System.out.println("Enviando e-mail através do iPhone");
	}

	@Override
	public void abrirNovaAba() {
		System.out.println("Abrindo nova aba através do iPhone");
	}

	@Override
	public void realizarLigacao() {
		System.out.println("Realizando ligação no iPhone");
	}

	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo ligação no iPhone");
	}

	@Override
	public void rejeitarLigacao() {
		System.out.println("Rejeitando ligação no iPhone");
	}

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo musica no iPhone");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume do iPhone");
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume do iPhone");
	}

}
