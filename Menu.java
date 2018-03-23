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

//create class and extend with JFrame
public class Menu extends JFrame 
{
    //declare variable
    private JPanel contentPane;
    private JFrame theFrame;

    /**
     * Create the frame.
     */
    public Menu()//constructor 
    {

        //set frame title
        setTitle("Menu");
        //set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //set bounds of the frame
        setBounds(100, 100, 850, 600);                           
        //create object of JPanel
        contentPane = new JPanel();
        //contentPane = new JPanel(new GridLayout(10,0));

        ImageIcon icon = new ImageIcon("dog.jpg");
        JLabel label = new JLabel(icon);
        label.setSize(new Dimension(1000,1000));
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("dog.jpg").getImage().getScaledInstance(270, 170, Image.SCALE_DEFAULT));
        label.setIcon(imageIcon);
        

        //set border
        contentPane.setBorder(new EmptyBorder(20, 20, 50, 50));
        //set ContentPane
        setContentPane(contentPane);
        contentPane.setSize(new Dimension(1000,1000));
        contentPane.setBackground(new Color(233,193,255));
        contentPane.setBounds(100, 100, 100, 100);

        //set Label in the frame
        JLabel intro = new JLabel("<html><b>This application helps determine what breed of dog you should get.</b>"
                +"<br> Press 'Next' to start! </b></html>");

        //set foreground color to the label
        intro.setForeground(Color.WHITE);
        //set font of that label
        intro.setFont(new Font("Times New Roman", Font.BOLD, 24));
        //set bound of the label
        intro.setBounds(7, 0, 8, 3);
        //add label to the contentPane 
        contentPane.add(intro);

        //create object of JButton and set label on it
        JButton btnNewFrame = new JButton("Next");btnNewFrame.setSelected(false); 
        JButton btnInfoFrame = new JButton("What's this??");btnInfoFrame.setSelected(false); 
        JButton btnQuitFrame = new JButton("Quit");btnQuitFrame.setSelected(false); 
        btnQuitFrame.setForeground(Color.RED);
        //set font of the Button
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        btnInfoFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        btnQuitFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        //set bounds of the Button
        btnNewFrame.setBounds(280, 195, 78, 25);
        btnInfoFrame.setBounds(480, 395, 278, 225);     
        btnQuitFrame.setBounds(480, 395, 278, 225);        
        //add Button into contentPane
        contentPane.add(btnNewFrame);
        contentPane.add(btnInfoFrame);
        contentPane.add(btnQuitFrame);
        contentPane.add(label);
        //add actionListener        
        btnNewFrame.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent click)
                {
                    //call the object of Q1 and set visible true
                    Q1 frame = new Q1();
                    frame.setVisible(true);
                    //set default close operation
                    dispose();
                }
            });
        btnInfoFrame.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent click)
                {
                    //call the object of Q1 and set visible true
                    Info frame = new Info();
                    frame.setVisible(true);
                    //set default close operation
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
