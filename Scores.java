
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
   public static ArrayList<Integer> scoreList;

   public Scores() {
       scoreList = new ArrayList<Integer>();
       scoreList.add(golden); 
       scoreList.add(lab);
   }

   public ArrayList<Integer> getList() {
       return scoreList;
    }
   //methods to add point to each dog "add point Dog # 'x'"
   
   public ArrayList<Integer> addPointD0(){
       scoreList.set(0, (scoreList.get(0) +1));
       return scoreList;
   }
   public ArrayList<Integer> addPointD1(){
       scoreList.set(1, (scoreList.get(1) +1));
       return scoreList;
   }
}