package modelo.musica;

public class Mp3 implements ReprodutorMusical {

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo musica no MP3");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando volume do MP3");
	}

	@Override
	public void diminuirVolume() {
		System.out.println("Diminuindo volume do MP3");
	}

}
