
import java.util.Scanner;
public class CalculadoraNotas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a nota do aluno: " + (i+1) +" : ");
			notas[i] = scanner.nextDouble();
			
			}
		double soma = calcularSoma(notas);
		System.out.println("A soma das notas é: " + soma);
		double media = calcularMedia(notas);
		System.out.println("A média das notas é: " +media);
		double menornota = menorNota(notas);
		System.out.println("A menor nota é: " +menornota);
		double maiornota = maiorNota(notas);
		System.out.println("A maior nota é: " +maiornota);
		
		
		
		System.out.println("As notas menores de que seis são: ");
		notasMenoresQueSeis(notas);
		
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
	public static void notasMenoresQueSeis(double[] notas) {
		for (double nota : notas) {
			if (nota < 6) {
				System.out.println(nota);
			}
		}
	}
	public static double menorNota(double[] notas) {
		double menor = notas[0];
		for (double nota : notas) {
			if (nota < menor) {
				menor = nota;
			}
		}
		return menor;
		
	}
	public static double maiorNota(double[] notas) {
		double maior = notas[0];
		for (double nota : notas) {
			if (nota > maior) {
				maior = nota;
			}
		}
		return maior;
	}
}
