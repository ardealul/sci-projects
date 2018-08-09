package persons;
import persons.Person;

public class BubbleSort { /* Metoda BubbleSort primeste o lista de persoane si returneaza tot aceeasi lista, doar ca sortata
*/
	public static Person[] persoane (Person persoane[]) {
		
		  int n = persoane.length-1;  
	        Person temp = new Person(null, null, n);
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(persoane[j-1].getVarsta() > persoane[j].getVarsta()){   
	                                 temp = persoane[j-1];  
	                                 persoane[j-1] = persoane[j];  
	                                 persoane[j] = temp;  
	                         }  
	                          
	                 }  
	         }
	         for(int i=0; i<=n;i++)
		System.out.println(persoane[i].toString());
		return persoane;
		
	}
}
