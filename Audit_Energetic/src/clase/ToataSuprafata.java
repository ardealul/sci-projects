package clase;
import clase.*;

public class ToataSuprafata {
	 public static float calculateSuprafataOpaca(Suprafata [] arie){
		 Perete per = new Perete(3,4,null);
	        float suprafataOpaca = 0;
	        for(Suprafata v : arie){
	            if(v != null) {
	            	if(v instanceof Perete) {
	            		suprafataOpaca += v.calcSuprafata();
	            		
	            	}else 
	            	{
	            		suprafataOpaca -= v.calcSuprafata();
	            	}
	               // toataaria += v.calcSuprafata();
	            }
	        }
	        return suprafataOpaca;
	    }
}
