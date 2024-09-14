import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {// enquanto x for diferente de 0 executa a intrução abaixo
			soma += x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();

	}

}
