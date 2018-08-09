package main;
import persons.BubbleSort;
import persons.Person;

public class Main {

	public static void main(String[] args) {
		Person[] persoane = new Person[10];
		persoane[0] = new Person("Popescu", "Adrian", 22);
		persoane[1] = new Person("Pop", "Robert", 24);
		persoane[2] = new Person("Son", "Trib", 32);
		persoane[3] = new Person("Ghit", "Fane", 54);
		persoane[4] = new Person("Stan", "Tudor", 36);
		persoane[5] = new Person("Randuin", "Victor", 75);
		persoane[6] = new Person("Sony", "Vegas", 64);
		persoane[7] = new Person("Petrescu", "Camil", 124);
		persoane[8] = new Person("Blaga", "Lucian", 123);
		persoane[9] = new Person("Creanga", "Ion", 140);
	
		Person [] j = BubbleSort.persoane(persoane);

	}

}
