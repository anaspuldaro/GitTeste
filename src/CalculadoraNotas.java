
import java.util.Scanner;
public class CalculadoraNotas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a nota do aluno:" + (i+1) +":");
			notas[i] = scanner.nextDouble();
			}
		double soma = calcularSoma(notas);
		System.out.println("A soma das notas é:" + soma);
		
		scanner.close();
	}
	public static double calcularSoma(double[] notas) {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma;
	}
	public static double calcularMedia(double[] notas) {
		double soma = calcularSoma(notas);
		return soma /notas.length;
	}
}
