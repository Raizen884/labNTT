import org.junit.Test;

public class Teste {
	@Test
	public void printPrimos() {
		int[] array = new int[50];
		for (int n = 0; n < 50; n++) {
			array[n] = n;
		}
		
		for (int m = 0; m < 50; m++) {
			if ( numeroPrimo(array[m])) {
				System.out.println("O número: ".concat(String.valueOf(array[m]).concat(" é primo")));
			}
		}
		
	}

	private boolean numeroPrimo(int numero) {
		int count = 0;
		for (int n = numero; n > 0; n--) {
			if (numero % n == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}
}
