
/**
 * Write a description of class Meter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Meter
{
    private String regNumber;
    private String placement;
    private boolean works;

    public Meter(){

    }

    public Meter(String regNumber, String placement, boolean works){
        setRegNumber(regNumber);
        setPlacement(placement);
        setWorks(works);
    }

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

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public String getRegNumber(){
        return regNumber;
    }

    public void setPlacement(String placement){
        this.placement = placement;
    }

    public String getPlacement(){
        return placement;
    }

    public void setWorks(boolean works){
        this.works = works;
    }

    public boolean isWorks(){
        return works;
    }
}
