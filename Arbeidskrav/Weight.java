
/**
 * Write a description of class Clock here.
 *
 * @author Martin Braathen
 *
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
    
    @Override
    public boolean equals(Object o){
         
        if(!super.equals(o))
        {
            return false;
        }
        if(leastWeight == (((Weight) o).getLeastWeight()))
        {
            return true;
        }
        if(mostWeight == (((Weight) o).getMostWeight()))
        {
            return true;
        }
        return false;
        
    }
    
    public void display()
    {
        System.out.println(toString());
    }
    
    public String toString(){
       return "\nWeight" + super.toString() + "Least Weight: " + getLeastWeight() +" gram" + "\nMost weight: " + getMostWeight()+ " gram\n";
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
