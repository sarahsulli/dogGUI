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
public class Q2 extends JFrame
{
    //declare variable
    private JPanel contentPane;
    private Scores Scores;
    private JFrame theFrame;
    //setting up radio buttons

    /**
     * Create the frame.
     */
    public Q2 ()//constructor 
    {

        //set frame title
        setTitle("Question 2");
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

        final JRadioButton btn1 = new JRadioButton("+GR Q2");btn1.setSelected(false);       
        final JRadioButton btn2 = new JRadioButton("+Lab Q2");btn1.setSelected(false);
        final JRadioButton btn3 = new JRadioButton("+GS Q2");btn1.setSelected(false);       
        btn1.setForeground(Color.BLACK);
        btn2.setForeground(Color.BLACK);
        btn3.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18)); 
        btn2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18)); 
        btn3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18)); 
        group.add(btn1);
        group.add(btn2); 
        group.add(btn3);                
        contentPane.add(btn1);
        contentPane.add(btn2);
        contentPane.add(btn3);

        //create object of JButton and set label on it        
        final JButton btnNewFrame = new JButton("Next");
        final JButton btnBackFrame = new JButton("Back");
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnBackFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        contentPane.add(btnNewFrame);
        contentPane.add(btnBackFrame);

        btnBackFrame.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    //get source of click
                    Object source = click.getSource();

                    //back
                    if(source == btnBackFrame){
                        Q1 frame = new Q1(); 
                        frame.setVisible(true);
                    } 
                    //set default close operation
                    dispose();
                }

            });

        btnNewFrame.addActionListener(new ActionListener()
            {
                private Scores Scores;
                public void actionPerformed(ActionEvent click)
                {
                    //get source of click
                    Object source = click.getSource();
                    //next 
                    if(source == btnNewFrame){
                        GetDog frame = new GetDog(); 
                        frame.setVisible(true);
                    }    

                    //set default close operation
                    dispose();
                }

            });

        btn1.addActionListener(new ActionListener(){
                private Scores Scores;
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();

                    //adding points (making sure click on button and pressed next!!)
                    if((source == btn1) && (source == btnNewFrame)){
                        Scores.addPointD0();
                    }
                }

            });
        btn2.addActionListener(new ActionListener(){
                private Scores Scores;
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();

                    //adding points (making sure click on button and pressed next!!)
                    if((source == btn1) && (source == btnNewFrame)){
                        Scores.addPointD0();
                    }
                }

            });
        btn3.addActionListener(new ActionListener(){
                private Scores Scores;
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();

                    //adding points (making sure click on button and pressed next!!)
                    if((source == btn2) && (source == btnNewFrame)){
                        Scores.addPointD1();
                    }
                }

            });    
    } 

}