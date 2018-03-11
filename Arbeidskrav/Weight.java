
/**
 * Write a description of class Weight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weight extends Meter
{
    private double leastWeight;
    private double mostWeight;
    
    public Weight(){
    }           
    
    public Weight(String regNumber, String placement, boolean works, double leastWeight, double mostWeight){
        super(regNumber, placement, works);
        setLeastWeight(leastWeight);
        setMostWeight(mostWeight);
    }
     
    public void display()
    {
        System.out.println(toString());
    }
    
    public String toString(){
       return super.toString() + "\nLeast Weight: " + getLeastWeight() +"\nMost weight: " + getMostWeight();
    }
    
    public void setLeastWeight(double leastWeight){
        this.leastWeight = leastWeight;
    }
    
    public double getLeastWeight(){
        return leastWeight;
    }
    
    public void setMostWeight(double mostWeight){
        this.mostWeight = mostWeight;
    }
    
    public double getMostWeight(){
        return mostWeight;
    }
}
