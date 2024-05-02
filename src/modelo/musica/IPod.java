package modelo.musica;

public class IPod implements ReprodutorMusical {

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo musica no iPod");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume do iPod");
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume do iPod");
	}

}
