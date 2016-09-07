/**
 * Apresentar os conceitos de Variável
 *@author Francini de Assis Silva
*/
public class Variavel {
	
	public static void main(String[] args) {
		
		Integer idade = new Integer(31);
		Double preco = new Double("12.45");
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();

		Boolean casado = new Boolean("true");

		//CONVERSÃO ESTÁTICA
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14");

		int i2 = Integer.valueOf("101011", 2);//Converte o valor binário base 2
		System.out.println(i2);


	}
}