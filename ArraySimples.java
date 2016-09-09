import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {

		String[] uma = {"Francini", "Ricardo"};
		System.out.println(uma[0]);

		String[][] duas = {{"Francini", "F", "SP"},{"Ricardo", "M", "SP"}};

		duas[1][0] = "SANDRA";


		System.out.println(duas[1][0]);


	}
}