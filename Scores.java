
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

    public ArrayList<Integer> addPointD3(){
        scoreList.set(3, (scoreList.get(3) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD4(){
        scoreList.set(4, (scoreList.get(4) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD5(){
        scoreList.set(5, (scoreList.get(5) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD6(){
        scoreList.set(6, (scoreList.get(6) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD7(){
        scoreList.set(7, (scoreList.get(7) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD8(){
        scoreList.set(8, (scoreList.get(8) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD9(){
        scoreList.set(9, (scoreList.get(9) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD10(){
        scoreList.set(10, (scoreList.get(10) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD11(){
        scoreList.set(11, (scoreList.get(11) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD12(){
        scoreList.set(12, (scoreList.get(12) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD13(){
        scoreList.set(13, (scoreList.get(13) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD14(){
        scoreList.set(14, (scoreList.get(14) +1));
        return scoreList;
    }

    public ArrayList<Integer> addPointD15(){
        scoreList.set(15, (scoreList.get(15) +1));
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