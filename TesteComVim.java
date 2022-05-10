import java.util.Scanner;
public class TesteComVim {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		float num1, num2, num3, num4;

		System.out.println("Digite a primeira nota: ");
		num1 = entrada.nextInt();
		System.out.println("Digite a segunda nota: ");
		num2 = entrada.nextInt();
		System.out.println("Digite a terceira nota: ");
		num3 = entrada.nextInt();
		System.out.println("Digite a quarta nota: ");
		num4 = entrada.nextInt();

		float media = (num1 + num2 + num3 + num4) / 4;

		System.out.printf("Sua média é: %.2f\n", media);
		
		if(media >= 7){
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!");
		}
	}

}

