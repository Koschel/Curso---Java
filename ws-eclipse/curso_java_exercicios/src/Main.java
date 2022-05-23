import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*int a, b, soma;
		 * 
		System.out.println("-- Exercicio 01 --");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		System.out.printf("Soma: %d%n", soma);
		
		double R, result, pi = 3.14159;
		
		System.out.println("-- Exercicio 02 --");
		
		R = sc.nextDouble();
		
		result = pi * R * R;
		
		System.out.printf("Raio: %.4f%n", result);
		
		int diff, A, B, C, D;
		
		System.out.println("-- Exercicio 03 --");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diff = (A * B - C * D);
		
		System.out.printf("Diferença: %d%n", diff);
		
		int Number, Timer;
		double Salary, SalaryTimer;
		
		System.out.println("-- Exercicio 04 --");
		
		Number = sc.nextInt();
		Timer = sc.nextInt();
		SalaryTimer = sc.nextDouble();
		
		
		Salary = Timer * SalaryTimer; 
		
		System.out.printf("NUMBER: %d%nSALARY: U$ %.2f%n", Number, Salary);
		
			
		int cod1, qtd1, cod2, qtd2;
		double valor1, valor2, total;
		
		System.out.println("-- Exercicio 05 --");
		
		System.out.println("Peça 01:");		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		System.out.println("Peça 02:");
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = ((qtd1*valor1)+(qtd2*valor2));
				
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);*/
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("-- Exercicio 06 --");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
				
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
