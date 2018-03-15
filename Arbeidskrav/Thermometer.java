
/**
 * Write a description of class Clock here.
 *
 * @author Martin Braathen
 *
 */
public class Thermometer extends Meter
{
    private double lowest;
    private double highest;

    public Thermometer(){

    }

    /**
     * Constructer of the Thermometer
     * 
     */public Thermometer(String regNumber, String placement, boolean works, double lowest, double highest){
        super(regNumber, placement, works);
        setLowest(lowest);
        setHighest(highest);
    }
    
    /**
     * 
     */
    @Override
    public boolean equals(Object o){
         
        if(!super.equals(o))
        {
            return false;
        }
        if(lowest == (((Thermometer) o).getLowest()))
        {
            return true;
        }
        if(highest == (((Thermometer) o).getHighest()))
        {
            return true;
        }
        return false;
        
    }
    
    /**
     * Makes a String out of the variabels from Thermometer and Meter.
     */
    public String toString(){
       return "\nThermometer" + super.toString() + "Lowest temperature (°C): " + getLowest() +"\nHighest temperature (°C): " + getHighest() +"\n";
    }
    
    /**
     * Set the Highest temperatur this Thermometer can measure.
     */public void setHighest(double highest){
        this.highest = highest;
    }
    
    /**
     * Gets the Highest temperatur this Thermometer can measure
     */
    public double getHighest(){
        return highest;
    }
    
    /**
     * Get the Lowest temperatur this Thermometer can measure
     */
    public double getLowest(){
        return lowest;
    }
    
    /**
     * Set the Lowest temperatur this Thermometer can measure
     */
    public void setLowest(double lowest){
        this.lowest = lowest;
    }

}
