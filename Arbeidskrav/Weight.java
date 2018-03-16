
/**
 *
 * @author Martin Braathen
 *
 */
public class Weight extends Meter
{
    private double leastWeight;
    private double mostWeight;
    
    /**
     * Creates and instance of Weight, with standard values.
     */
    public Weight(){
        super("N000", "N000", true);
        leastWeight = 0.0;
        mostWeight = 100.0;
    }           
    
    /**
     * Constructor of the Weight.
     */
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
    
    /**
     * Display whats been inputted of variabels, calling to the toString method above.
     */
    public void display()
    {
        System.out.println(toString());
    }
    
    /**
     * Makes a String out of the variabels from Weight and Meter.
     */
    public String toString(){
       return "\nWeight" + super.toString() + "Least Weight: " + getLeastWeight() +" gram" + "\nMost weight: " + getMostWeight()+ " gram\n";
    }
    
    /**
     * Set the LeastWeight this Weight can measure.
     */
    public void setLeastWeight(double leastWeight){
        this.leastWeight = leastWeight;
    }
    
    /**
     * Gets the LeastWeight this Weight can measure.
     */
    public double getLeastWeight(){
        return leastWeight;
    }
    
    /**
     * Set the MostWeight this Weight can measure.
     */
    public void setMostWeight(double mostWeight){
        this.mostWeight = mostWeight;
    }
    
    /**
     * Gets the MostWeight this Weight can measure.
     */
    public double getMostWeight(){
        return mostWeight;
    }
}
