
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Doggos {
    private String golden = "Golden Retriever";
    private String lab = "Lab";
    private String germanSheperd = "German Shepherd";
    private String poodle = "Poodle";
    private String frenchBulldog = "French Bulldog";
    private String huskie = "Huskie";
    private String greatDane = "Great Dane";
    private String borderCollie = "Boarder Collie";
    private String corgi = "Corgi";   
    private String maltese = "Maltese";      
    private String pomeranian = "Pomeranian";
    private String chihuahua = "Chihuahua";
    private String havanese = "Havanese";
    private String shibaInu = "Shiba Inu";
    private String newfoundland = "Newfoundland";
    
    private ArrayList<String> dogList = new ArrayList<String>();;     
    public Doggos() {
        //dogList = new ArrayList<String>();
        dogList.add(golden);
        dogList.add(lab);
        dogList.add(germanSheperd);    
        dogList.add(poodle);
        dogList.add(frenchBulldog);
        dogList.add(huskie);
        dogList.add(greatDane);
        dogList.add(borderCollie);
        dogList.add(corgi);
        dogList.add(maltese);
        dogList.add(pomeranian);
        dogList.add(chihuahua);
        dogList.add(havanese);
        dogList.add(shibaInu);
        dogList.add(newfoundland);
    }
    
    public ArrayList<String> getList() {      
        return dogList;        
    }

    public String findDog(){               
        Scores copy = new Scores();
        //copy.getHighestScore();
        int index = copy.getHighestScore(); 
        String result;
        result = dogList.get(index); 
        return result;
    }
}