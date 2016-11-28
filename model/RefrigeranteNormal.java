package model;

public class RefrigeranteNormal extends Refrigerante {

	public RefrigeranteNormal(RefrigeranteSabores r) {
		super(r);
	}

	@Override
	public void fabricar() {
		incluirSabor("Refrigerante Normal");
	}

}
