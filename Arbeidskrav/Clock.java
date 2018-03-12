
/**
 * Write a description of class Clock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock extends Meter
{
    private double seconds;
    
    public Clock(){
    }
    
    public Clock(String regNumber, String placement, boolean works, double seconds){
        super(regNumber, placement, works);
        setSeconds(seconds);
    }
    
    public String toString(){
       return super.toString() + "\nMin sec: " + getSeconds();
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
    
    public void setSeconds(double seconds){
        this.seconds = seconds;
    }
    
    public double getSeconds(){
        return seconds;
    }
}
