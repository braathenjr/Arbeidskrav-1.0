
/**
 * Write a description of class Clock here.
 *
 * @author Martin Braathen
 *
 */
public class Meter
{
    private String regNumber;
    private String placement;
    private boolean works;

    public Meter(){
        
    }
    
    /**
     * Constructing the Meter.
     */
    public Meter(String regNumber, String placement, boolean works){
        setRegNumber(regNumber);
        setPlacement(placement);
        setWorks(works);
        
    }
    
    /**
     * Makes a String out of the variabels in Meter.
     */
    public String toString(){
        String text = "\nregNumber: " + getRegNumber() + "\nPlacement: " + getPlacement();
        if(works == true)
        { 
            return text + "\nStatus: i orden\n";
        }
        else
        {
            return text + "\nStatus: i ustand\n";
        }
    }
    
    /**
     * 
     */
    @Override
    public boolean equals(Object o){
        if(this == o)
        {
            return true;
        }
        if(o == null)
        {
            return false;
        }        
        if(regNumber.equals(((Meter) o).getRegNumber()))
        {
            return true;
        }
        if(placement.equals(((Meter)o).getPlacement()))
        {
            return true;
        }
        if(works == (((Meter)o).isWorks()))
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Sets the regNumber to this instrument.
     */
    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }
    
    /**
     * Gets the regNumber to this instrument.
     */
    public String getRegNumber(){
        return regNumber;
    }
    
    /**
     * Sets the placement to this instrument.
     */
    public void setPlacement(String placement){
        this.placement = placement;
    }
    
    /**
     * Gets the placement to this instrument.
     */
    public String getPlacement(){
        return placement;
    }
    
    /**
     * Sets if the instrument works or not.
     */
    public void setWorks(boolean works){
        this.works = works;
    }
    
    /**
     * Gets if the instrument works or not.
     */
    public boolean isWorks(){
        return works;
    }
}
