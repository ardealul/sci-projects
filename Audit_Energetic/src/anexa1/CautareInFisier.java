package anexa1;

import java.io.IOException;
import java.util.Scanner;

public class CautareInFisier {
public void cautare() throws IOException {
	Scanner scanner = new Scanner(System.in);
	CitireFisier a = new CitireFisier();
	String locatie = "C:\\Users\\radum\\Desktop\\Anexa1.txt";
	String exemplu = a.citireFisier(locatie);
	System.out.println("Introdu materialul cautat");
	String categorie = scanner.nextLine();
	String pe =" pe viata";
	for(int i=0; i<exemplu.length()-1;i++) {
		if(exemplu.charAt(i)=='<') {
			for(int j=i+1;j<exemplu.length();j++) {
				if(exemplu.charAt(j)=='>') {
					String subst = exemplu.substring(i+1, j);
					
					if(subst.equals(categorie)) {
						System.out.println(subst);
						for(int l=j+1;j<exemplu.length();l++) {
							if(exemplu.charAt(i)=='*') {
								for(int m=l+1;j<exemplu.length();m++) {
									if(exemplu.charAt(j)=='^') {
										String subst2 = exemplu.substring(l+1, m);
										
										if(subst.equals(categorie)) {
											System.out.println(subst2);
											for(int k=j+1;j<exemplu.length();k++) {
												
											}
						}
					}
				}
			}
		}
	}
	
				}
			}
		}
	}
}
}