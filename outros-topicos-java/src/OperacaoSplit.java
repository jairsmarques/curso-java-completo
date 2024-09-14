
public class OperacaoSplit {

	public static void main(String[] args) {

		// split -> serve para recortar uma String
		String s = "potato apple lemon";

		String[] vect = s.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
