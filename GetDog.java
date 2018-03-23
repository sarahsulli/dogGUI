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

public class GetDog extends JFrame{
    //private Scores Scores = new Scores();
    //private Doggos Doggos;
    private JPanel contentPane;
   
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

        Doggos dCopy = new Doggos();
        Scores sCopy = new Scores();
        String theInfo = dCopy.dInfo();
        String dogPic = dCopy.dogPic();
        
        JLabel intro = new JLabel("YOUR SPIRIT DOG IS A " + dCopy.findDog().toUpperCase());        
        JLabel dogInfoText = new JLabel(theInfo);       
        JLabel other = new JLabel("<html><b> Other good dogs for you include: </b><br>" 
                + dCopy.find2Dog() + " and " +dCopy.find3Dog() +"<html>");


        ImageIcon icon = new ImageIcon(dogPic);
        JLabel label = new JLabel(icon);
        label.setSize(new Dimension(1000,1000));
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(dogPic).getImage().getScaledInstance(270, 170, Image.SCALE_DEFAULT));
        label.setIcon(imageIcon);

        intro.setForeground(Color.BLACK);
        intro.setBounds(327, 195, 78, 39);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

        dogInfoText.setForeground(Color.BLACK);
        dogInfoText.setBounds(327, 195, 78, 39);
        dogInfoText.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));

        other.setForeground(Color.BLACK);
        other.setBounds(327, 195, 78, 39);
        other.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        final JButton btnNextFrame = new JButton("Retake Quiz"); 
        final JButton btnQuitFrame = new JButton("Quit"); 
        btnNextFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnQuitFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnQuitFrame.setForeground(Color.RED);       
        contentPane.add(intro);
        contentPane.add(dogInfoText);
        contentPane.add(other);        

        contentPane.add(btnNextFrame);
        contentPane.add(btnQuitFrame);
        contentPane.add(label);
        //add actionListener
        btnNextFrame.addActionListener(new ActionListener()        
            {
                Scores scr = new Scores();
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    if(source == btnNextFrame){
                        Q1 frame = new Q1(); 
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