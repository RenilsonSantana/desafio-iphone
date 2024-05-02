package aplicacao;

import modelo.internet.Computador;
import modelo.internet.NavegadorInternet;
import modelo.iphone.IPhone;
import modelo.musica.IPod;
import modelo.musica.Mp3;
import modelo.musica.ReprodutorMusical;
import modelo.telefone.Celular;
import modelo.telefone.Telefone;

public class Aplicacao {

	public static void main(String[] args) {
		Telefone celular = new Celular();
		ReprodutorMusical iPod = new IPod();
		ReprodutorMusical mp3 = new Mp3();
		NavegadorInternet computador = new Computador();
		IPhone iPhone = new IPhone();
		
		celular.atenderLigacao();
		celular.realizarLigacao();
		celular.rejeitarLigacao();
		
		iPod.reproduzirMusica();
		iPod.aumentarVolume();
		iPod.diminuirVolume();
		
		mp3.reproduzirMusica();
		mp3.aumentarVolume();
		mp3.diminuirVolume();
		
		computador.navegarNaInternet();
		computador.enviarEmail();
		computador.abrirNovaAba();
		
		iPhone.atenderLigacao();
		iPhone.realizarLigacao();
		iPhone.rejeitarLigacao();
		iPhone.reproduzirMusica();
		iPhone.aumentarVolume();
		iPhone.diminuirVolume();
		iPhone.navegarNaInternet();
		iPhone.enviarEmail();
		iPhone.abrirNovaAba();
	}

}
