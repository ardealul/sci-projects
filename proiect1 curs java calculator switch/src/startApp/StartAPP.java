package startApp;
import java.util.Scanner;

import repository.Calculator;
import repository.DayOfMonth;;

public class StartAPP {
	public static void main(String[] args) { 
		/*String a = "1+23+45";
		String first = a.substring(1, 2);
		int start=0;
		int sfarsit = 0;
		for (int i=0; i<=a.length();i++) {
			if(a.substring(i,i+1)=="+"|| a.substring(i,i+1)=="-"|| a.substring(i,i+1)=="*"|| a.substring(i,i+1)=="/" ) {
				double numar1=Double.parseDouble(a.substring(start,i));
				double numar2;
				outerloop:
				for(int j=i;j<=a.length();j++) {
					if( a.substring(j,j+1)=="+" || a.substring(j,j+1)=="*" || a.substring(j,j+1)=="-" || a.substring(j,j+1)=="/") {
						numar2=Double.parseDouble(a.substring(i+1,j));
						break outerloop;
					}
					
				}
				
			}
		}
		System.out.println(first);*/
repository.Calculator x = new Calculator();
repository.DayOfMonth y = new DayOfMonth();
Scanner scanner = new Scanner(System.in);
String newLine = System.getProperty("line.separator");
int optiune = 0;

do {
	System.out.println("Pentru a folosii calculatorul, apasa pe 1"+ newLine +"Pentru A folosii Day Of Month, apasa pe 2" + newLine +"Pentru a iesii, apasa pe 0");
	optiune = scanner.nextInt();
	switch (optiune) {
	case 1:
		x.ruleaza();
		break;
	case 2: 
		y.zilenLuna();
		break;
	case 0:
		break;
	default:
        System.out.printf("Ai introdus ceva gresit!");
} 

		
		
	}while(optiune !=0);

}
}
