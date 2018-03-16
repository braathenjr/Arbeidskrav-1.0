
/**
 *
 * @author Martin Braathen
 *
 */
public class Clock extends Meter
{
    private double seconds;
    
    /**
     * Creates and instance of Clock, with standard values.
     */
    public Clock(){
        super("N000", "N000", true);
        seconds = 0.1;
        
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
