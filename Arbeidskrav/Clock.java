
/**
 * Write a description of class Clock here.
 *
 * @author Martin Braathen
 *
 */
public class Clock extends Meter
{
    private double seconds;
    
    public Clock(){
    }
    
    /**
     * Constructor of the Clock.
     */
    public Clock(String regNumber, String placement, boolean works, double seconds){
        super(regNumber, placement, works);
        setSeconds(seconds);
    }
    
    /**
     * Makes a String out of the variabels from Clock and Meter.
     */
    public String toString(){
       return "\nClock" + super.toString() + "Min sec: " + getSeconds() +"\n";
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
        if(seconds == (((Clock) o).getSeconds()))
        {
            return true;
        }
        return false;
        
    }
    
    /**
     * Set the least seconds this clock can time.
     */
    public void setSeconds(double seconds){
        this.seconds = seconds;
    }
    
    /**
     * Gets the least seconds this clock can time.
     */
    public double getSeconds(){
        return seconds;
    }
}
