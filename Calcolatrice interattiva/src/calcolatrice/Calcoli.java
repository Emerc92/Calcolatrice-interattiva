package calcolatrice;


import java.util.Scanner;

	public class Calcoli {
		private static double valore1;
		private static double valore2;

		static Scanner insert = new Scanner(System.in);

		public static void calcolatrice() {
			System.out.println("benvenuto a la calcolatrice Smart £merk ");
			int ciclo = 0;
			int select = 0;
			do {
				do {
					System.out.println("\nselezione un'opzione per l'operazione che vuoi realizzare:");
					System.out.println("	1 per sommare");
					System.out.println("	2 per restare");
					System.out.println("	3 per moltiplicare");
					System.out.println("	4 per dividere");
					System.out.println("	5 per uscire");
					select = insert.nextInt();
					if (select >= 0 && select <= 5) {
						ciclo = 1;
					} else {
						System.out.println("-----------------------------");
						System.out.println(" opzione non valida, riprova ");
						System.out.println("-----------------------------");
					}

				} while (ciclo == 0);

				if (select == 1) {

					somma();

				} else if (select == 2) {
					resta();

				} else if (select == 3) {
					moltiplica();

				} else if (select == 4) {
					dividi();
				} else if (select == 5) {
					System.out.println("-------------------------");
					System.out.println("Grazie! torna quando vuoi!!! ");
					System.out.println("-------------------------");
					ciclo = 2;
				}
			} while (ciclo != 2);
		}

		public static void somma() {
			System.out.print("dammi il primo valore: ");
			valore1 = insert.nextInt();
			System.out.print("\ndammi il secondo valore da sommare: ");
			valore2 = insert.nextInt();

			System.out.println("la somma è uguale a: [" + (valore2 + valore1) + "]");
		}

		public static void resta() {
			System.out.print("dammi il primo valore: ");
			valore1 = insert.nextInt();
			System.out.print("\ndammi il secondo valore: ");
			valore2 = insert.nextInt();
			System.out.println("il resto è uguale a: [" + (valore1 - valore2) + "]");
		}

		public static void moltiplica() {
			System.out.print("dammi il primo valore: ");
			valore1 = insert.nextInt();
			System.out.print("\ndammi il secondo valore: ");
			valore2 = insert.nextInt();
			System.out.println("il risultato della multiplicazione è: [" + (valore1 * valore2) + "]");
		}

		public static void dividi() {
			try {

				System.out.print("dammi il primo valore: ");

				valore1 = insert.nextInt();
				System.out.print("\ndammi il secondo valore: ");
				valore2 = insert.nextInt();
				if (valore2 == 0.0)
					throw new Exception();
				System.out.println("il risultato della divisione è: [" + (valore1 / valore2) + "]");
			} catch (Exception e) {
				System.out.println(
						"ATTENZIONE!! non si può dividere un numero per zero, riprova a inserire i dati");
				dividi();
			}
		}
	}

	
	
