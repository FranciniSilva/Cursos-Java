/**
 * Calcular o IMC
 * IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)
*/
import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual seu peso em Quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura em Metros?");

		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

		String msg = (imc >= 20 && imc <= 25) ? "Você está dentro do Peso Ideal" : "Você está fora do Peso Ideal";
		msg = "IMC = " + imc + "\n" + msg;

		JOptionPane.showMessageDialog(null, msg);
		

	}
}