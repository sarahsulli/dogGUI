
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.AbstractButton;
import java.awt.event.*;
import java.awt.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
public class Doggos {
    private String golden = "Golden Retriever";
    private String lab = "Lab";
    private String germanSheperd = "German Shepherd";
    private String poodle = "Poodle";
    private String frenchBulldog = "French Bulldog";
    private String huskie = "Husky";
    private String greatDane = "Great Dane";
    private String borderCollie = "Boarder Collie";
    private String corgi = "Corgi";   
    private String maltese = "Maltese";      
    private String pomeranian = "Pomeranian";
    private String chihuahua = "Chihuahua";
    private String havanese = "Havanese";
    private String shibaInu = "Shiba Inu";
    private String newfoundland = "Newfoundland";

    private JPanel contentPane;
    private String info;
        private String pic;
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
        int index = copy.getHighestScore(); 
        String result;
        result = dogList.get(index); 
        return result;
    }

    public String find2Dog(){
        Scores copy = new Scores();
        int index = copy.secondHighScore(); 
        String result;
        result = dogList.get(index); 
        return result;
    }

    public String find3Dog(){
        Scores copy = new Scores();
        int index = copy.thirdHighSchore(); 
        String result;
        result = dogList.get(index); 
        return result;
    }

    public String dInfo(){
        Scores sCopy = new Scores();
        int dogIndexInfo = sCopy.getHighestScore();
        if(dogIndexInfo == 0 )
        {
            info = "<html><b>The Golden Retriever is one of the most popular dog breeds in the U.S. </b> "
            + "<br>The breed’s friendly, tolerant attitude makes him a fabulous family pet,"
            + "<br> and it’s intelligence makes him a highly capable working dog. You can’t go wrong with"
            + "<br> a golden! </html>";
        }
        if(dogIndexInfo == 1 )
        {
            info = "<html><b>Labs are great family and working dogs, making them America’s most </b>"
            +"<br> popular breed. Labs are friendly, outgoing, and high-spirited companions who have more "
            +"<br> than enough affection to go around for a anyone looking for a medium-to-large dog. </html> ";
        }
        if(dogIndexInfo == 2 )
        {
            info = "<html><b> The German Shepherd Dog is a large, smart, loyal, and agile dog.</b>"
            +"<br> These dogs require an active lifestyle  and frequent training for keeping its mind " 
            +"<br> and body active. The German Shepherd are famous for their loyalty and ability to learn "
            +"<br> commands for any task. </html>";
        }
        if(dogIndexInfo == 3 )
        {
            info = "<html><b> Elegant and energetic, the Standard Poodle is one of the smartest </b>"
            +"<br> and most trainable breeds.  Poodles excels at performance sports such as obedience, "
            +"<br> agility, and hunt tests. They are people-friendly dogs who want to stay close to their "
            +"<br> families they get lonely when left by themselves for long periods and are always up for "
            +"<br> a good game </html>";
        }
        if(dogIndexInfo == 4 )
        {
            info = "<html><b> These friendly creatures are strong companion dogs. They adapt well to </b>"
            +"<br> smaller homes and elderly people. Although they are not that smart, they are affectionate "
            +"<br> with people and only need basic training in the beginning. This dog is cute and can "
            +"<br> always cheer you up after a long day with its cuddles </html>";
        }
        if(dogIndexInfo == 5 )
        {
            info = "<html><b> Huskies are medium sized working dogs that can withstand cold climates. </b>"
            +"<br> They only need basic training because they are somewhat smart. Huskies are very popular "
            +"<br> between all age groups because of their extreme friendliness to family, friends, and "
            +"<br> strangers. They have a very high energy level and are down to play anytime, anywhere. </html>";
        }
        if(dogIndexInfo == 6 )
        {
            info = "<html><b> Great Danes are truly majestic dogs. They are especially known for their </b>"
            +"<br> giant size and noble personalities. They are not smart and also drool a lot, but they are "
            +"<br> large and loving. Danes don’t need extreme exercise, but a little from time to time is "
            +"<br> expected. They will guard their homes and loved ones with affection. </html>";
        }
        if(dogIndexInfo == 7 )
        {
            info = "<html><b> Collies are known to be one of the smartest dogs, possessing agility, balance, </b>"
            +"<br> and intelligence. They are friendly with family, but not so much with strangers. Training "
            +"<br> is an ongoing process and the more they are trained, the smarter they become. These dogs "
            +"<br> are great for owners who love obedient and intelligent dogs. </html>";
        }
        if(dogIndexInfo == 8 )
        {
            info = "<html><b> Corgis seem like they are always smiling. These canines are sweet, caring, and </b>"
            +"<br> calm. They are friendly towards family and friends or strangers. Their small legs make "
            +"<br> them seem cuter as they are closer to the ground. They only need basic training, and they "
            +"<br> are fit for smaller homes because they are composed and don’t drool a lot.  </html>";
        }
        if(dogIndexInfo == 9 )
        {
            info = "<html><b> These small creatures are very loving, gentle, playful, and charming. They love </b>"
            +"<br> nothing more than to cuddle up in your lap and keep you company with whatever you are doing. "
            +"<br> Training and socializing in the beginning periods of their lives play huge roles in how "
            +"<br> their personalities will turn out. However, often times they can be hard to train. "
            +"<br> Nevertheless, they puppies are loving and happy unconditionally. </html>";
        }
        if(dogIndexInfo == 10 )
        {
            info = "<html><b> These small dogs have a huge personality. Cute, feisty and furry, Poms are </b>"
            +"<br> intelligent and loyal to their families. Don't let their cuteness fool you, however. "
            +"<br> These independent, bold dogs have minds of their own. They are alert and curious about "
            +"<br> the world around them. </html>";
        }
        if(dogIndexInfo == 11 )
        {
            info = "<html><b> Chihuahuas are known for their small size, outsize personality, and variety in </b>" 
            +"<br> coat types and colors. Fun loving and busy, Chihuahuas like nothing better than to be "
            +"<br> close to their people. They follow them everywhere in the house and ride along in tote "
            +"<br> bags when their people run errands or go shopping. It's not unusual for Chihuahuas to "
            +"<br> form a close bond with a single person, and they can become very demanding if they're "
            +"<br> overindulged. Besides being affectionate housemates, Chihuahuas are intelligent and "
            +"<br> fast learners. </html>";
        }
        if(dogIndexInfo == 12 )
        {
            info = "<html><b> Bred as a companion dog and smuggled into the US from Cuba, the Havanese’s </b>"
            +"<br> long, silky hair, expressive eyes, and cuddly size make them a great choice! Havanese "
            +"<br> are very affectionate to their owners and strangers alike, and are trainable yet "
            +"<br> independent. </html>";
        }
        if(dogIndexInfo == 13 )
        {
            info = "<html><b> The Shiba Inu is known for a bold, fiery personality. The Japanese have three </b>"
            +"<br> words to describe the breed's mental traits: kaani-i (spirited boldness), ryosei "
            +"<br> (good nature), and soboku (alertness). Combined, these traits make up the interesting, "
            +"<br> intelligent, and strong-willed temperament of this breed. The Shiba Inu is medium to "
            +"<br> small size and athletic. Like a ninja warrior, the Shiba Inu moves quickly, nimbly, "
            +"<br> effortlessly. He is keen and alert. Shibas are considered stubborn and independent, "
            +"<br> making them more difficult to train. </html>";
        }
        if(dogIndexInfo == 14 )
        {
            info = "<html><b> These big friendly giants are natural babysitters. They’re naturally gentle </b>"
            +"<br> and friendly, as well as protective, making them great family dogs. Newfoundlands "
            +"<br> loves children, are intelligent, and aims to please. Their webbed feet and water "
            +"<br> resistant coat makes them excellent swimmers, however their coat needs regular grooming.  </html>";
        }

        return info;
    }

    public String dogPic(){
        
        Scores sCopy = new Scores();
        int dogIndexInfo = sCopy.getHighestScore();
        if(dogIndexInfo == 0 )
        {
            pic = "golden.gif";
            return pic;
        }
        if(dogIndexInfo == 1 )
        {
            pic = "lab.gif";
            return pic;
        }
        if(dogIndexInfo == 2 )
        {
            pic = "gs.gif";
            return pic;
        }
        if(dogIndexInfo == 3 )
        {
            pic = "poodle.gif";
            return pic;
        }
        if(dogIndexInfo == 4 )
        {
            pic = "fbd.gif";
            return pic;
        }
        if(dogIndexInfo == 5 )
        {
            pic = "husky.gif";
            return pic;
        }
        if(dogIndexInfo == 6 )
        {
            pic = "gd.gif";
            return pic;
        }
        if(dogIndexInfo == 7 )
        {
            pic = "bc.gif";
            return pic;
        }
        if(dogIndexInfo == 8 )
        {
            pic = "corgi.gif";
            return pic;            
        }
        if(dogIndexInfo == 9 )
        {
            pic = "maltese.gif";
            return pic;
        }
        if(dogIndexInfo == 10 )
        {
            pic = "pom.gif";
            return pic;
        }
        if(dogIndexInfo == 11 )
        {
            pic = "chi.gif";
            return pic;
        }
        if(dogIndexInfo == 12 )
        {
            pic = "hav.gif";
            return pic;
        }
        if(dogIndexInfo == 13 )
        {
            pic = "shiba.gif";
            return pic;
        }
        if(dogIndexInfo == 14 )
        {
            pic = "newf.gif";
            return pic;
        }
        return pic;
    }

}
