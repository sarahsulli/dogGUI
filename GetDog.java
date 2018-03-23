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
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.event.*;
import java.util.ArrayList;
public class GetDog extends JFrame{
    private Scores Scores = new Scores();
    private Doggos Doggos;

    private int highDogIndex;

    private JPanel contentPane;
    private JFrame theFrame;

  

    //this method finds the Index of the highest score
    /**public String findDog(){
    Doggos = new Doggos();
    Doggos.getList = (ArrayList<String>)theDogs.clone();

    ArrayList<String> dogList2 = Doggos.getList();
    int index = Scores.highestScore();
    String result;
    result = Doggos.getList().get(index); 
    return result;
    } */


    public GetDog() {
        //set frame title
        setTitle("Your Spirit Dog");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 850, 500);                           
        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
                contentPane.setBackground(new Color(233,193,255));
        contentPane.setSize(new Dimension(600,200));
        contentPane.setBounds(80, 95, 78, 25);

        Doggos dCopy = new Doggos();
        Scores sCopy = new Scores();
        
        JLabel intro = new JLabel("YOUR SPIRIT DOG IS A " + dCopy.findDog().toUpperCase());
        
        
        
                

        intro.setForeground(Color.BLACK);
        intro.setBounds(327, 195, 78, 39);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        final JButton btnNextFrame = new JButton("More Info"); 
        final JButton btnQuitFrame = new JButton("Quit"); 
        btnNextFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnQuitFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnQuitFrame.setForeground(Color.RED);       
        contentPane.add(intro);

        contentPane.add(btnNextFrame);
        contentPane.add(btnQuitFrame);
        //add actionListener
        btnNextFrame.addActionListener(new ActionListener()        
            {
                Scores scr = new Scores();
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    if(source == btnNextFrame){
                        DogInfo frame = new DogInfo(); 
                        frame.setVisible(true);

                        scr.resetScores(); 
                    } 
                    dispose();
                }

            }); 
        btnQuitFrame.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent click)
                {
                    dispose();
                }
            });    
    }  

} 