package model;

public class RefrigeranteLight extends Refrigerante {

	public RefrigeranteLight(RefrigeranteSabores r) {
		super(r);
	}

	@Override
	public void fabricar() {
		incluirSabor("Refrigerante Light");
	}

}
