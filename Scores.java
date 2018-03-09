
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Scores {
   private int golden = 1;
   private int lab = 0;
   private ArrayList<Integer> scoreList;

   public Scores() {
       scoreList = new ArrayList<Integer>();
       scoreList.add(golden);
       scoreList.add(lab);
   }

   public ArrayList<Integer> getList() {
       return scoreList;
    }
}