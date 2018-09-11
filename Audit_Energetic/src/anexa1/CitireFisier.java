package anexa1;

import java.io.FileReader;
import java.io.IOException;

public class CitireFisier {
	public String citireFisier(String locatie) throws IOException {
		FileReader fr =new FileReader(locatie);
			 
		String text="";
			    int i;
			    while ((i=fr.read()) != -1)
			    	text += (char)i;
			      System.out.print(text);
		return text;
		
	}
}
