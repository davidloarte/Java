import java.util.Scanner;

public class EjecutaCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Calculadora c = new Calculadora();

		System.out.print("Introduzca primer numero:\t");
		int num1 = teclado.nextInt();
		c.ponNum1(num1);
		
		System.out.print("Introduzca segundo numero:\t");
		int num2 = teclado.nextInt();
		c.ponNum2(num2);
		
		System.out.print("Introduzca una operacion:\t");
		String operacion = teclado.next();
		c.setOp(operacion);
		
		//c.ponOperacion(operacion);
		c.opera();
		if (c.isResult()==true)
			System.out.println(c.dameResultado());

	}

}
