package model;

public abstract class Refrigerante {

	protected RefrigeranteSabores sabores;

	public Refrigerante(RefrigeranteSabores j) {
		sabores = j;
	}

	public void incluirSabor(String sabor) {
		sabores.incluirSabor(sabor);
	}

	public abstract void fabricar();

}
