public class Fluxo{
	public static void main(String[] args) {
		
		int nota = 6;
		if (nota >= 7) {
			System.out.println("Passou");
		} else {
			System.out.println("Reprovou");
			if (nota >= 6) {
				System.out.println("mas pode recuperar a nota");
			}
		}
	}
}