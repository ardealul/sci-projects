package smart_objects;



public class CalculateCost {
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
