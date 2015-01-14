package opdracht_B11;

import java.lang.Math;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		int urenNu = Calendar.getInstance().get(Calendar.HOUR);
		int minutenNu = Calendar.getInstance().get(Calendar.MINUTE);

		System.out.println("De tijd nu: " + "\n"
				+ Klok.drukTijdAf(urenNu, minutenNu) + "\n");

		System.out.println("De tijden test" + "\n");

		// testen met een for loop
		for (int i = 0; i <= 4; i++) {

			// random tijden maken (die blijven hetzelfde per uitvoer!)
			int uurtijd = (int) (Math.random() * 24);
			int minuuttijd = (int) (Math.random() * 60);

			// invoer en gesproken weergeven om het te testen
			System.out.println("Invoer: " + "\n" + uurtijd + ":" + minuuttijd);
			System.out.println("Gesproken: " + "\n"
					+ Klok.drukTijdAf(uurtijd, minuuttijd));
			System.out.println();

		}

	}

}
