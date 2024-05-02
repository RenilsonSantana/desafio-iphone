package modelo.telefone;

public class Celular implements Telefone {

	@Override
	public void realizarLigacao() {
		System.out.println("Realizando ligação no Celular");
	}

	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo ligação no Celular");
	}

	@Override
	public void rejeitarLigacao() {
		System.out.println("Rejeitando ligação no Celular");
	}

}
