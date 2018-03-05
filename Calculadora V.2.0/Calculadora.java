
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class Calculadora {
	// instance variables - replace the example below with your own
	private int num1;
	private int num2;
	private int rdo;
	private String op;
	private boolean result;

	

	/**
	 * Constructor for objects of class Calculadora
	 */
	public Calculadora() {
		// Initialize instance variables
		num1 = 0;
		num2 = 0;
		op = "";
		result = true;
	}

	public void ponNum1(int n1) {
		// put your code here
		this.num1 = n1;
	}

	public void ponNum2(int n2) {
		// put your code here
		this.num2 = n2;
	}

	public void opera() {
		switch (op) {
		case "SUMA":
			rdo = num1 + num2;
			break;
		case "RESTA":
			rdo = num1 - num2;
			break;
		case "MULTIPLICA":
			rdo = num1 * num2;
			break;
		case "DIVIDE":
			rdo = num1 / num2;
			break;
		case "POTENCIA":
			int resultado = 1;

			for (int i = 1; i <= num2; i++) {

				resultado = resultado * num1;

			}

			rdo = resultado;

			break;
		case "RAIZ":

			resultado = (int) Math.pow(num1, 1 / num2);
			rdo = resultado;
			break;
		case "LOGARITMO":
			rdo = (int) Math.log10(num1);
			break;
		case "FACTORIAL":
			int resultado1 = 1;
			for (int i = num1; i > 0; i--) {

				resultado1 = resultado1 * i;

			}
			;
			rdo = resultado1;
			break;
		default:
			System.out.println("Operacion invalida");
			result = false;
			break;
		}
	}

	/*
	 * public void ponOperacion(String opera){ switch(opera){
	 * 
	 * case "SUMA": op="SUMA"; break; case "RESTA": op="RESTA"; break; case
	 * "MULTIPLICA": op="MULTIPLICA"; break; case "DIVIDE": op="DIVIDE"; break; case
	 * "POTENCIA": op="POTENCIA"; break; case "RAIZ": op="RAIZ"; break; case
	 * "LOGARITMO": op="LOGARITMO"; break; case "FACTORIAL": op="FACTORIAL"; break;
	 * } }
	 */
	public int dameResultado() {
		// put your code here
		return rdo;
	}

	public void muestraTodosResultados() {
		System.out.println("Num1=" + Integer.toString(num1) + " Num2=" + Integer.toString(num2));
		System.out.println("Suma :" + Integer.toString(num1 + num2));
		System.out.println("Resta :" + Integer.toString(num1 - num2));
		System.out.println("Multiplica :" + Integer.toString(num1 * num2));
		System.out.println("Division :" + Integer.toString(num1 / num2));
		System.out.println("Potencia :" + Integer.toString(rdo));
		System.out.println("Raiz :" + Integer.toString(rdo));
		System.out.println("Logaritmo :" + Integer.toString(rdo));
		System.out.println("Factorial :" + Integer.toString(rdo));

	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getRdo() {
		return rdo;
	}

	public void setRdo(int rdo) {
		this.rdo = rdo;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result=result;
	}
}
