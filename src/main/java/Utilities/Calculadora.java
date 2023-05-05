package Utilities;

public class Calculadora {

	private int n1;
	private int n2;

	public Calculadora() {
		this.n1 = 0;
		this.n2 = 0;
	}

	/**
	 *
	 * @param num1
	 * @param num2
	 */
	public Calculadora(int num1, int num2) {
		this.n1 = num1;
		this.n2 = num2;
	}

	public int Sumar() {
		return this.n1+this.n2;

	}

	public int Multiplicar() {
		return this.n1*this.n2;

	}

	public void SetN1(int num1) {
		this.n1 = num1;
	}

	public void SetN2(int num2) {
		this.n2 = num2;

	}

}