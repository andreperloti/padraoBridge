package model;

public class Cliente {
	public static void main(String[] args) {
		Refrigerante refri = new RefrigeranteNormal(new RefrigeranteGuarana());
		refri.fabricar();
		
		refri = new RefrigeranteNormal(new RefrigeranteLaranja());
		refri.fabricar();
		
		refri = new RefrigeranteZero(new RefrigeranteGuarana());
		refri.fabricar();

		refri = new RefrigeranteZero(new RefrigeranteUva());
		refri.fabricar();
		
		refri = new RefrigeranteLight(new RefrigeranteGuarana());
		refri.fabricar();

		refri = new RefrigeranteLight(new RefrigeranteUva());
		refri.fabricar();
		
	}
}
