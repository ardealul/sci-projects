package repository;

import java.util.Scanner;

public class DayOfMonth {
	/*
	 * Se introduce luna si anul de la tastatura si 
	 * in functie de aceste inputuri se alege mesajul
	 * de afisat
	 */
	public void zilenLuna() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti luna pe care o doriti(ex. 'Mai'): ");
		String luna = scanner.nextLine();
		System.out.println("Introduceti anul pe care il doriti");
		int an = scanner.nextInt();
		if (luna!="Februarie"){
		switch (luna) {
		case "Ianuarie":
		case "Martie":
		case "Mai":
		case "Iulie":
		case "August":
		case "Octombrie":
		case "Decembrie":
			System.out.print("Felicitari, ai castigat 31 de zile");
			break;

		case "Aprilie":
		case "Iunie":
		case "Septembrie":
		case "Noiembrie":
			System.out.println("Felicitari, ai castigat 30 de zile");
			break;
		 default:
             System.out.printf("Ai introdus ceva gresit!");
		}
		
		}else if (luna == "Februarie") {
			
			if (an%4==0) {
				System.out.println("Felicitari, ai castigat 29 de zile");
			}
			else if (an%4!=0) {
				System.out.println("Felicitari, ai castigat 28 de zile");
			}
		}
	}

}
