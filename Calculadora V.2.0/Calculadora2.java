
public class Calculadora2 {
	
	int num1;
	int num2;
	int resultado;
	
	public Calculadora2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = 0;
	}
	
	public int suma (int num1, int num2) {
		resultado = num1+num2;
		return resultado;
	}
	
	public int resta (int num1, int num2) {
		resultado = num1-num2;
		return resultado;
	}
	
	public int multiplicacion (int num1, int num2) {
		resultado = num1*num2;
		return resultado;
	}
	
	public int division (int num1, int num2) {
		resultado = num1/num2;
		return resultado;
	}
	
	

}
