public class Operador {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o raio");
		double raio = s.nextDouble();

		//Diametro : 2r
		//double raio = 10;
		double diametro = 2 * raio;

		System.out.println("Diametro = " + diametro);

		//Circunferencia : 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Circunferencia = " + circunferencia);

		//Area PI r2
		double area = pi * (raio * raio);
		System.out.println("Area = " + area);
	}
	
}