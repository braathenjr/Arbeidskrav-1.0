import java.util.ArrayList;
/**
 *
 * @author Martin Braathen
 *
 */
public class MeterArchive
{
    private ArrayList<Meter> archive;

    /**
     * Constructing MeterArchive, and runs some of its methods.
     */
    public MeterArchive(){
        archive = new ArrayList<>(); 
        archiveAdd();
        display();
        changePlacement("C1000", "R101H13");
        changeWorks("W2000");
        getFromArchive("T2001");
        deleteFromArchive("T2000");

    }

    /**
     * Adds a specsific Meter object to the archive.
     */
    public void addArchive(Meter meter)
    {
        archive.add(meter);
    }

    /**
     * Display everything thats in archive.
     */
    public void display()
    { 
        for (Meter m : archive)
        {
            System.out.println(m);                      
        }
    }

    /**
     * Deletes an instrument form archive using its regNumber.
     */
    public boolean deleteFromArchive(String regNumber)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.remove(i);
                System.out.println("\nSletter instrument med regnummer: " + list.getRegNumber());
                System.out.println(list);
                return true;
            }
        }
        return false;
    }

    /**
     * Gets all the info about an instrument from archive using its regNumber.
     */
    public Meter getFromArchive(String regNumber)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.get(i);
                System.out.println("\nHenter instrument med regnummer " + list.getRegNumber());
                System.out.println(list);
                return list;
            }
        }
        return null;
    }

    /**
     * Change the placement of an instrument using its regNumber. And inputting the new placement.
     */
    public boolean changePlacement(String regNumber, String placement)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.get(i).setPlacement(placement);
                System.out.println("\nEndrer posisjon for instrument med regnummer: " + list.getRegNumber());
                System.out.println(list);              
                return true;                                         
            }

        }
        return false;
    }

    /**
     * Change if the instrument works to not work using its regNumber.
     */
    public boolean changeWorks(String regNumber)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.get(i).setWorks(false);
                System.out.println("\nSetter instrumentet med regNummer " + list.getRegNumber() + " til ikke i orden");              
                System.out.println(list);
                return true;                                         
            }
        }
        return false;
    }

    /**
     * Adds different instrument to the archive.
     */
    public void archiveAdd()
    {
        archive.add(new Clock("C1000", "R101H1", true, 0.01));
        archive.add(new Clock("C1001", "R101H2", true, 0.05));
        archive.add(new Clock("C1002", "R101H3", true, 0.01));
        archive.add(new Clock("C1003", "R101H4", false, 0.02));
        archive.add(new Thermometer("T2000", "R101H5", true, 1.0, 200.0));
        archive.add(new Thermometer("T2001", "R101H6", true, 1.0, 300.0));     
        archive.add(new Thermometer("T2002", "R101H7", true, 0.5, 200.0));
        archive.add(new Thermometer("T2003", "R101H8", true, 1.0, 200.0));
        archive.add(new Weight("W2000", "R101H9", true, 1.0, 2000.0));
        archive.add(new Weight("W2001", "R101H10", true, 1.0, 1000.0));      
        archive.add(new Weight("W2002", "R101H11", false, 100.0, 3000.0));
        archive.add(new Weight("W2003", "R101H12", true, 0.5, 200.0));       
    }
}
