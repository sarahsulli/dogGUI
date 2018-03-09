
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Doggos {
   private String golden = "Golden Retreiver";
   private String lab = "Lab";
   private ArrayList<String> dogList;

   public Doggos() {
       dogList = new ArrayList<String>();
       dogList.add(golden);
       dogList.add(lab);
   }

   public ArrayList<String> getList() {
       return dogList;
    }
}