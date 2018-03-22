import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout; 
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.event.*;
import java.util.ArrayList;

import java.awt.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;

public class Q1 extends JFrame
{
    private JPanel contentPane;
    //private JFrame theFrame;

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
        setBounds(100, 100, 850, 500);                           
        //create object of JPanel
        contentPane = new JPanel(new GridLayout(10,0));

        //set border
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //set ContentPane
        setContentPane(contentPane);
        contentPane.setSize(new Dimension(600,200));
        contentPane.setBounds(80, 95, 78, 25);

        //set Label in the frame
        JLabel intro = new JLabel("What size dog do you want?");
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

        final JRadioButton btn1 = new JRadioButton("Small");btn1.setSelected(false);       
        final JRadioButton btn2 = new JRadioButton("Medium");btn2.setSelected(false);
        final JRadioButton btn3 = new JRadioButton("Large");btn3.setSelected(false);       
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
        final JButton btnQuitFrame = new JButton("Quit");
        btnQuitFrame.setForeground(Color.RED);
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnQuitFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        contentPane.add(btnNewFrame);
        contentPane.add(btnQuitFrame);        

        btnNewFrame.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent click)
                {
                    //get source of click
                    Object source = click.getSource();
                    //next 
                    if(source == btnNewFrame){
                        Q2 frame = new Q2(); 
                        frame.setVisible(true);
                    }    

                    //set default close operation
                    dispose();
                }

            });
        btnQuitFrame.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent click)
                {
                    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?"
                            + " All data will be lost", 
                            "Quit" ,JOptionPane.YES_NO_OPTION); 
                    if(option == JOptionPane.YES_OPTION)
                    {
                        dispose();
                    }

                }

            });
        //small dog
        btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    //adding points (making sure click on button and pressed next!!)
                    if(source == btn1){
                        scr.addPointD4();
                        scr.addPointD9(); 
                        scr.addPointD10();
                        scr.addPointD12();
                        Q2 frame = new Q2(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
        //med dog
        btn2.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    //adding points (making sure click on button and pressed next!!)
                    if(source == btn2){
                        scr.addPointD8();
                        scr.addPointD13();
                        Q2 frame = new Q2(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
        //big dog
        btn3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    //adding points (making sure click on button and pressed next!!)
                    if(source == btn3){
                        scr.addPointD0();
                        scr.addPointD1();
                        scr.addPointD2();
                        scr.addPointD3();
                        scr.addPointD5();
                        scr.addPointD6();
                        scr.addPointD7();
                        scr.addPointD14();
                        Q2 frame = new Q2(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });    
    } 

}