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

public class Info extends JFrame
{
    private JPanel contentPane;
    private Scores Scores;
    private JFrame theFrame;

    /**
     * Create the frame.
     */
    public Info ()//constructor 
    {
        setTitle("Info");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 550, 500);                           
        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        /**contentPane.setLayout(new FlowLayout());*/
        contentPane.setSize(new Dimension(600,200));
        contentPane.setBounds(80, 95, 78, 25);

        JLabel intro = new JLabel("<html><b>For Out APCS final Project we've decided to create</b>"
                +"<br> a program that determines what dog is right for you!"
                +"<br> This GUI uses ~blah blah blah~  </html>"
            ); /**fill out*/

        intro.setForeground(Color.BLACK);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        intro.setBounds(327, 195, 78, 39);
        contentPane.add(intro);

        //create object of JButton and set label on it        
        final JButton btnBackFrame = new JButton("Take Me Back");
        final JButton btnNewFrame = new JButton("Start Quiz!");
        btnBackFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        contentPane.add(btnBackFrame);
        contentPane.add(btnNewFrame);

        btnBackFrame.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    //get source of click
                    Object source = click.getSource();

                    //back
                    if(source == btnBackFrame){
                        Menu frame = new Menu(); 
                        frame.setVisible(true);
                    } 
                    //set default close operation
                    dispose();
                }

            }); 
        btnNewFrame.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    if(source == btnNewFrame){
                        Q1 frame = new Q1(); 
                        frame.setVisible(true);
                    }    
                    dispose();
                }

            });
    } 

}