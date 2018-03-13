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
public class Winner extends JFrame 
{
    //declare variable
    private JPanel contentPane;
    private JFrame theFrame;
    //setting up radio buttons

   

    /**
     * Create the frame.
     */
    public Winner ()//constructor 
    {

        //set frame title
        setTitle("Your Spirit Dog");
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
        JLabel intro = new JLabel("Your spirit dog is..... " );
        //set foreground color to the label
        intro.setForeground(Color.BLACK);
        //set font of that label
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        //set bound of the label
        intro.setBounds(327, 195, 78, 39);
        //add label to the contentPane
        contentPane.add(intro);
        


        //create object of JButton and set label on it
        final JButton btnNewFrame = new JButton("Next");
        final JButton btnBackFrame = new JButton("Back");
        //set font of the Button
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnBackFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));        
        //add Button into contentPane
        contentPane.add(btnNewFrame);
        contentPane.add(btnBackFrame);
        
        //add actionListener
        btnNewFrame.addActionListener(new ActionListener()
        
            {
                private Scores Scores;
                public void actionPerformed(ActionEvent click)
                {
                    //get source of click
                    Object source = click.getSource();
                    
                    //back
                    if(source == btnBackFrame){
                        Q1 frame = new Q1(); /**this isnt working?*/
                        frame.setVisible(true);
                    } 
                    //set default close operation
                    dispose();
                }

            });

    }
}