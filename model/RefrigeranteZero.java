package model;

public class RefrigeranteZero extends Refrigerante {

	public RefrigeranteZero(RefrigeranteSabores r) {
		super(r);
	}

	@Override
	public void fabricar() {
		incluirSabor("Refrigerante Zero");
	}

}
