import java.util.ArrayList;
/**
 * Write a description of class MeterArchive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeterArchive
{
    private ArrayList<Meter> archive;

    public MeterArchive(){
        archive = new ArrayList<>();
    }

    public void addArchive(Meter meter)
    {
        archive.add(meter);
    }

    public void display()
    { 
        StringBuilder sb = new StringBuilder();
        for (Meter s : archive)
        {
            sb.append(s);
            sb.append("\t");
        }

        System.out.println(sb.toString());
    }

    public boolean deleteFromArchive(String regNumber)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.remove(i);
                System.out.println("Sletter instrument med regnummer: " + list.getRegNumber());
                return true;
            }
        }
        //System.out.println(": Objekt er ikke slettet");
        return false;
    }

    public Meter getFromArchive(String regNumber)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.get(i);
                //System.out.orintln("Henter instrument med regnummer " + list.getRegNumber());
                System.out.println(list);
                return list;
            }
        }
        return null;
    }

    public boolean changePlacement(String regNumber, String placement)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.get(i).setPlacement(placement);
                //System.out.println("Endrer posisjon for instrument med regnummer: " + list.getRegNumber());
                System.out.println(list);              
                return true;                                         
            }
        }
        return false;
    }

    public boolean changeWorks(String regNumber)
    {
        for(int i = 0; i < archive.size(); i++)
        {
            Meter list = archive.get(i);
            if(regNumber.equals(list.getRegNumber()))
            {
                archive.get(i).setWorks(false);
                System.out.println("Setter instrumentet med regnummer " + list.getRegNumber() + " til ikke i orden");              
                return true;                                         
            }
        }
        return false;
    }

}
