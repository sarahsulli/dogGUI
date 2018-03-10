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

//create class and extend with JFrame
public class Q1 extends JFrame 
{
    //declare variable
    private JPanel contentPane;

    //setting up radio buttons



    /**
     * Create the frame.
     */
    public Q1 ()//constructor 
    {

        //set frame title
        setTitle("Question 1");
        //set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //set bounds of the frame
        setBounds(100, 100, 550, 500);                           
        //create object of JPanel
        contentPane = new JPanel();

        //set border
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //set ContentPane
        setContentPane(contentPane);
        /**contentPane.setLayout(new FlowLayout());*/
        contentPane.setSize(new Dimension(600,200));
        contentPane.setBounds(80, 95, 78, 25);

        //set Label in the frame
        JLabel intro = new JLabel("Question one");
        //set foreground color to the label
        intro.setForeground(Color.BLACK);
        //set font of that label
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        //set bound of the label
        intro.setBounds(327, 195, 78, 39);
        //add label to the contentPane
        contentPane.add(intro);

        //set button group
        ButtonGroup group = new ButtonGroup();

        JRadioButton btn1 = new JRadioButton("A");btn1.setSelected(false);       
        btn1.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18)); 

        JRadioButton btn2 = new JRadioButton("B");btn1.setSelected(false);
        btn2.setForeground(Color.BLACK);
        btn2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18)); 

        group.add(btn1);
        group.add(btn2);        
        contentPane.add(btn1);
        contentPane.add(btn2);
        


        //create object of JButton and set label on it
        JButton btnNewFrame = new JButton("Next");
        JButton btnBackFrame = new JButton("Back");
        //add actionListener
        btnNewFrame.addActionListener(new ActionListener()
            {
                private Scores Scores;
                public void actionPerformed(ActionEvent click)
                {
                    //get source of click
                    Object source = click.getSource();
                    
                    //adding points (making sure click on button and pressed next!!)
                    if((source == btn1) && (source == btnNewFrame)){
                        Scores.addPointD0();
                    }
                    if((source == btn1) && (source == btnNewFrame)){
                        Scores.addPointD1();
                    }
                    //next 
                    if(source == btnNewFrame){
                        Q2 frame = new Q2();
                        frame.setVisible(true);
                    }    
                    //back
                    if(source == btnBackFrame){
                        Menu frame = new Menu(); /**this isnt working?*/
                        frame.setVisible(true);
                    } 
                    //set default close operation
                    dispose();
                }

            });
        //set font of the Button
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnBackFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));

        
        //add Button into contentPane
        contentPane.add(btnNewFrame);
        contentPane.add(btnBackFrame);
    }
}