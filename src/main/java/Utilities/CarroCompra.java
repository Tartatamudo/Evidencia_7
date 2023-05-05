package Utilities;

public class CarroCompra {

	private int[][] productos = new int[2][5];

	public CarroCompra() {
		for (int i = 0; i < 5; i++) {
			productos[0][i] = 1;
			productos[1][i] = 1000;
		}
	}

	private int CalcularTotal() {
		int total = 0;
		int subTotal = 0;
		for (int i = 0; i < 5; i++) {
			total += SubTotal(productos[0][i], productos[1][i]);
		}
		return total;
	}

	/**
	 * @param cant
	 * @param precio
	 */

	private int SubTotal(int cant, int precio) {
		Calculadora calc = new Calculadora(cant, precio);
		return calc.Multiplicar();
	}

	public void MostrarTotal() {
		System.out.println("El total de la compra es: " + this.CalcularTotal());
	}

}