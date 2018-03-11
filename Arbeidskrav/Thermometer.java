
/**
 * Write a description of class Thermometer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thermometer extends Meter
{
    private double lowest;
    private double highest;

    public Thermometer(){

    }

    public Thermometer(String regNumber, String placement, boolean works, double lowest, double highest){
        super(regNumber, placement, works);
        setLowest(lowest);
        setHighest(highest);
    }
    
    public String toString(){
       return super.toString() + "\nLowest temperature: " + getLowest() +"\nHighest temperature: " + getHighest();
    }
    
    public void setHighest(double highest){
        this.highest = highest;
    }

    public double getHighest(){
        return highest;
    }

    public double getLowest(){
        return lowest;
    }
    
    public void setLowest(double lowest){
        this.lowest = lowest;
    }

}
