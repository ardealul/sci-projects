package anexa1;

import java.io.IOException;
import java.util.Scanner;

public class Finder {
	public String findObject(String material) throws IOException {
		String subst = "";
		String rezolv="";
		Scanner scanner = new Scanner(System.in);
		CitireFisier a = new CitireFisier();
		String locatie = "C:\\Users\\radum\\Desktop\\Anexa1.txt";
		String exemplu = a.citireFisier(locatie);
		for(int i=0; i<exemplu.length()-1;i++) {
			if(exemplu.charAt(i)==material.charAt(0)) {
				for(int j=i+1;j<exemplu.length();j++) {
					if(exemplu.charAt(j)==material.charAt(material.length()-1)) {
						subst = exemplu.substring(i, j+1); 
						
						if(subst.equals(material)) {
							rezolv = exemplu.substring(i, j+1); 
	}
}
			}
		}
	}
		return rezolv;

}
	
}