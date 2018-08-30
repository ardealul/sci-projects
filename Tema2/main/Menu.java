package main;

import java.util.Scanner;

import smart_objects.CalculateCost;
import smart_objects.Host;
import smart_objects.SmartCam;
import smart_objects.SmartLamp;

import smart_objects.SmartThermostat;

public class Menu {
	
	public void menu() {
		
		Host array[]=new Host[3];
		array[0] = new SmartLamp(false, 0, null);
		array[1] = new SmartThermostat(false, 0);
		array[2] = new SmartCam(false, false);
		int choice=0;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Press one to modify the Smart Lamp.");
		System.out.println("Press two to modify the Smart Thermostat.");
		System.out.println("Press three to modify the Smart Security Cam.");
		System.out.println("Press four to get the total consumption.");
		System.out.println("Press five to get an array of all Smart Devices.");
		System.out.println("Press zero to exit.");
		choice = scanner.nextInt();
		
	    switch (choice) {
	        case 1:
	    		System.out.println(array[0].toString());
	    		System.out.println("Press one to turn the Lamp On or Off");
	    		System.out.println("Press two to set Brightness");
	    		System.out.println("Press three to set Color");
	    		int aleg = scanner.nextInt();
	    		if (aleg==1) {
	    		boolean state = array[0].getState();
	    		if(state==true) {
	    			array[0].turnOff();
	    			//this.menu();
	    			}
	    		if(state==false) {
	    			array[0].turnOn();
	    			//this.menu();
	    			}
	    		}else if (aleg == 2) {
	    			System.out.println("Enter the brightness, from 0 to 100");
	    			int brightness=scanner.nextInt();
	    			((SmartLamp) array[0]).setBrightness(brightness);
	    		System.out.println(array[0]);}
	    		else if(aleg == 3) {
	    			System.out.println("Introdu Culoarea");
	    			String color=scanner.nextLine();
	    			((SmartLamp)array[0]).setColor(color);
	    			System.out.println(array[0]);		    		
	    		}
	        break;
	  case 2:
			System.out.println(array[1].toString());
    		System.out.println("Press one to turn the Thermostat On or Off");
    		System.out.println("Press two to set Temperature");
    		int aleg1 = scanner.nextInt();
    		if (aleg1==1) {
    			boolean state = array[1].getState();
	    		if(state==true)
	    			array[1].turnOff();
	    		if(state==false)
	    			array[1].turnOn();
	    		}else if (aleg1 == 2) {
	    			System.out.println("Enter the Temperature-20, from 0 to 30");
	    			int temperature=scanner.nextInt();
	    			((SmartThermostat) array[1]).setTemperature(temperature);
	    		System.out.println(array[1]);}
    			
    		
	        break;
	   case 3:
		   System.out.println(array[2].toString());
    		System.out.println("Press one to turn the Camera On or Off");
    		System.out.println("Press two to start/stop filming");
    		int aleg2 = scanner.nextInt();
    		if (aleg2==1) {
    		boolean state = array[2].getState();
    		if(state==true)
    			array[2].turnOff();
    		if(state==false)
    			array[2].turnOn();
    		}else if (aleg2 == 2) {
    			System.out.println("Press one to start filming, press two to stop filming");
    			int decizie=scanner.nextInt();
    			if(decizie==1) {
    			((SmartCam) array[2]).StartFilming();
    			if(((SmartCam) array[2]).isFilming()==false){
    				array[2].turnOn();
    			}
    			}
    			else if(decizie == 2) {
    				((SmartCam) array[2]).StopFilming();	    			}
    		System.out.println(array[2]);}
	        break;
	    case 4:
	    double cost = CalculateCost.calculateCost(array);
	for(int i=0;i<3;i++)
	System.out.println(Host.Lista(array[i]).toString());
	    case 5:
	    	for(int i=0;i<3;i++)
	    		{System.out.println(Host.Lista(array[i]).toString());
	    	
	    	break;}
	    case 0:
break;

	   }	
	
		}while (choice!=0);
		
	}


}