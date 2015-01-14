package opdracht_B7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader(
					"/Users/Klaas/Documents/workspace/Project_week/src/opdracht_B7/cijfers.txt");
			BufferedReader br = new BufferedReader(fr);

			while (true) {
				String s = br.readLine();

				if (s == null)
					break;

				// scanner maken van de line, en ";" er af halen
				Scanner cijfer = new Scanner(s).useDelimiter(";");

				// array maken met alle doubles per line ter grote van de txt
				// file
				Double[] lijst = new Double[cijfer.nextLine().length()];

				// door elke lijn moeten we heen lezen,
				// als we in die lijst zijn, moeten we alle Doubles er uit
				// halen,
				// deze bijelkaar optellen, delen door het totaal aantal doubles
				// in de lijn
				// dat is het gemiddelde cijfer van die klas!
				// vervolgens alle cijfers vergelijken met het gemiddelde en de
				// cijfers
				// eronder printen!
				int i = 0;
				while (cijfer.hasNextDouble()) {
					lijst[i++] = cijfer.nextDouble();
					System.out.println("test");

				}

				for (int index = 0; index > lijst.length; index++) {

					System.out.println(lijst);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
