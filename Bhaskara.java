package br.com.atividades;

public class Bhaskara {

	private double a, b, c, delta, x1, x2;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}

	public double calculaDelta() {
		delta = Math.pow(b, 2) - (4 * a * c);
		return delta;
	}

	public double getDelta() {
		return delta;
	}

	public double calculaX1() {
		if ((a == 0) || (delta < 0)) {
			System.out.println("Impossível calcular!");
		} else {
			x1 = ((-b + Math.sqrt(delta)) / (2 * a));
		}
		return x1;
	}

	public double calculaX2() {
		if ((a == 0) || (delta < 0)) {
			System.out.println("Impossível calcular!");
		} else {
			x2 = ((-b - Math.sqrt(delta)) / (2 * a));
		}
		return x2;
	}
}
