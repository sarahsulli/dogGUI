import java.util.ArrayList;
public class GetDog {
    private Scores Scores;
    private Doggos Doggos;
    private static int highDogIndex;
    private String result;
    //example
    public GetDog() {
        Scores = new Scores();
        ArrayList<Integer> scoreList2 = Scores.getList();
        int highDogIndex = 0;
        for(int i=0; i<scoreList2.size(); i++){
            if (scoreList2.get(i) > highDogIndex) {
                highDogIndex = i;
            }
        }
        findDog(); 

    }

    public void findDog(){
        Doggos = new Doggos();
        ArrayList<String> dogList2 = Doggos.getList();
        result = dogList2.get(highDogIndex);            
    }   
}