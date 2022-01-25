import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		int i;
		int anzahl[] = {5, 15, 6, 1, 24, 7};
		double preis[] = {80.00, 30.99, 65.00, 1199.00, 12.99, 99.00};
		double umsatz = 0;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		for (i = 0; i < anzahl.length; i++) {
			umsatz = umsatz + anzahl[i] * preis[i];
		}
		System.out.println("Umsatz beträgt: " + df.format(umsatz) + " Euro.");

	}

}
