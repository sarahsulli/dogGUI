
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Scores {
    int golden = 0;
    int lab = 0;
    int germanShepherd = 0;

    int poodle = 0;
    int frenchBulldog = 0;
    int huskie = 0;
    int greatDane = 0;
    int borderCollie = 0;
    int corgie = 0;   
    int shihTzu = 0;      
    int pomeranian = 0;
    int chihuahua = 0;
    int havanse = 0;
    int shibaInu = 0;
    int newfoundland = 0;

    public static ArrayList<Integer> scoreList = new ArrayList<Integer>();
    public Scores() {        
        //scoreList = new ArrayList<Integer>();       
        scoreList.add(golden); 
        scoreList.add(lab);
        scoreList.add(germanShepherd);
        scoreList.add(poodle);
        scoreList.add(frenchBulldog);
        scoreList.add(huskie);
        scoreList.add(greatDane);
        scoreList.add(borderCollie);
        scoreList.add(corgie);
        scoreList.add(shihTzu);
        scoreList.add(pomeranian);
        scoreList.add(chihuahua);        
        scoreList.add(havanse);
        scoreList.add(shibaInu);
        scoreList.add(newfoundland);
    }

    public ArrayList<Integer> getList() {
        return scoreList;
    }    

    public ArrayList<Integer> resetScores(){
        for(int i=0; i < scoreList.size(); i++){
            scoreList.set(i , 0);
        }
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
    public ArrayList<Integer> addPointD2(){
        scoreList.set(2, (scoreList.get(2) +1));
        return scoreList;
    }

    public int getHighestScore(){       
        int highScore=0;
        int highDogIndex=0; 

        for(int i=0; i<scoreList.size(); i++){
            if (scoreList.get(i) > highScore) {
                highDogIndex = i;
            }
        } 
        return highDogIndex;
    }

}