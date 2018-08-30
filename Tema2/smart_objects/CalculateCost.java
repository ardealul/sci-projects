package smart_objects;



public class CalculateCost {
	/**
	 * Cum am facut si la curs, primeste toate "Consumptiurile" de la toate dispozitivele de tip "Host"
	 * @param Host Object
	 */
    public static float calculateCost(Host [] hosting){
        float cost = 0;
        for(Host v : hosting){
            if(v != null) {
                cost += v.getConsumption();
            }
        }
        return cost;
    }
}
