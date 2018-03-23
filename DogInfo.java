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

public class DogInfo extends JFrame
{
    private JPanel contentPane;
    private Scores Scores;
    private JFrame theFrame;

    /**
     * Create the frame.
     */
    public DogInfo ()//constructor 
    {
        setTitle("Breed Info");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 850, 500);                           
        contentPane = new JPanel(new GridLayout(10,0));

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setSize(new Dimension(600,200));
        contentPane.setBounds(80, 95, 78, 25);
        contentPane.setBackground(new Color(233,193,255));

        Scores sCopy = new Scores();        
        Doggos dCopy = new Doggos();
        String theInfo = dCopy.dInfo();
        JLabel dogInfoText = new JLabel(theInfo);

        JLabel other = new JLabel("<html><b> Other good dogs for you include: </b><br>" 
                + dCopy.find2Dog() + " and " +dCopy.find3Dog() +"<html>");

        dogInfoText.setForeground(Color.BLACK);
        other.setForeground(Color.BLACK);
        dogInfoText.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        other.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        dogInfoText.setBounds(327, 195, 78, 39);
        other.setBounds(100, 500, 178, 139);                
        contentPane.add(dogInfoText);

        //create object of JButton and set label on it        
        final JButton btnNewFrame = new JButton("Retake Quiz!");
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnNewFrame.setBounds(400, 700, 525, 525);
        contentPane.add(other);
        contentPane.add(btnNewFrame);
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