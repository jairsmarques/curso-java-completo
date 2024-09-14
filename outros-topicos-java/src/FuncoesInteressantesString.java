
public class FuncoesInteressantesString {

	public static void main(String[] args) {

		// formatar: loLowerCase(), toUpperCase(), trim().
		// recortar: substring(inicio), subtring(inicio, fim).
		// substituir: replace(char, char), replace(string, string).
		// buscar: IndexOf, lastIndexOf.
		// str.Split(" ").

		String original = "abcde FGHIJ ABC abc DEFG   ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();// elimina espaços em branco
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x'); // troca a por x
		String s07 = original.replace("abc", "xy");// troca o abc por xy
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("tolowerCase -" + s01 + "-");
		System.out.println("toUpperCase -" + s02 + "-");
		System.out.println("trim -" + s03 + "-");
		System.out.println("subtring(2) -" + s04 + "-");
		System.out.println("subtring(2, 9) -" + s05 + "-");
		System.out.println("replace('a', 'x') -" + s06 + "-");
		System.out.println("replace('abc', 'xy') -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("last index of 'bc': " + j);

	}

}
