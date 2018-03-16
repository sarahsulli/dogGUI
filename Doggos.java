
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
    private String germanSheperd = "German Shepherd";
    private ArrayList<String> dogList; 

    public Doggos() {
        dogList = new ArrayList<String>();
        dogList.add(golden);
        dogList.add(lab);
        dogList.add(germanSheperd);       
    }

    public ArrayList<String> getList() {      
        return dogList;
    }

    public String findDog(){
        int index = Scores.getHighestScore();
        String result;
        result = dogList.get(index); 
        return result;
    }
}