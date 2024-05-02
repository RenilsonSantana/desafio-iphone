package modelo.internet;

public class Computador implements NavegadorInternet {

	@Override
	public void navegarNaInternet() {
		System.out.println("Navegando na internet através do Computador");
	}

	@Override
	public void enviarEmail() {
		System.out.println("Enviando e-mail através do Computador");
	}

	@Override
	public void abrirNovaAba() {
		System.out.println("Abrindo nova aba através do Computador");
	}

}
