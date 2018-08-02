package repository;

import java.util.Scanner;

public class Calculator {
	/*
	 * Functia rezolvare primeste doua numere si o operatie si in functie de
	 * operatie, alege ce face cu acele doua numere
	 */
	public double rezolvare(double numar, char operatie, double numar2) {
		double raspuns = 0;
		switch (operatie) {
		case '+':
			raspuns = numar + numar2;
			break;

		case '-':
			raspuns = numar - numar2;
			break;

		case '*':
			raspuns = numar * numar2;
			break;

		case '/':
			raspuns = numar / numar2;
			break;

		default:
			System.out.printf("You have entered wrong operator");
		}
		return raspuns;
	}
	/* Functia "ruleaza" citeste 2 numere si un operator 
	 * de la tastatura si afiseaza pe ecran rezultatul operatiei
	 */
	public void ruleaza() {
		Scanner y = new Scanner(System.in);
		System.out.print("Alege primu; numar:");
		double primunr = y.nextDouble();
		System.out.println("Alege Operatia: ");
		String ooperatie = y.next();
		System.out.print("Alege numarul 2: ");
		double nr2 = y.nextDouble();
		char operatie = ooperatie.charAt(0);
		repository.Calculator functie = new Calculator();
		double e = functie.rezolvare(primunr, operatie, nr2);
		System.out.println(primunr+ooperatie+nr2+"="+e);
	}
}
