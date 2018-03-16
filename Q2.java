import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Q2 extends JFrame
{
    private JPanel contentPane;
    private Scores Scores;
    private JFrame theFrame;

    /**
     * Create the frame.
     */
    public Q2 ()//constructor 
    {
        setTitle("Question 2");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 550, 500);                           
        contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        /**contentPane.setLayout(new FlowLayout());*/
        contentPane.setSize(new Dimension(600,200));
        contentPane.setBounds(80, 95, 78, 25);

        JLabel intro = new JLabel("Question two");
        intro.setForeground(Color.BLACK);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        intro.setBounds(327, 195, 78, 39);
        contentPane.add(intro);

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

        final JButton btnNewFrame = new JButton("Next");
        final JButton btnBackFrame = new JButton("Back");       
        final JButton btnQuitFrame = new JButton("Quit");
        btnQuitFrame.setForeground(Color.RED);
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));        
        btnBackFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        btnQuitFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        contentPane.add(btnNewFrame);
        contentPane.add(btnBackFrame);
        contentPane.add(btnQuitFrame);

        btnBackFrame.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    if(source == btnBackFrame){
                        Q1 frame = new Q1(); 
                        frame.setVisible(true);
                    } 
                    dispose();
                }

            });

        btnNewFrame.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    if(source == btnNewFrame){
                        GetDog frame = new GetDog(); 
                        frame.setVisible(true);
                    }    
                    dispose();
                }

            });
        btnQuitFrame.addActionListener(new ActionListener()
            {
                private Scores Scores;
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
        btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    if(source == btn1){
                        scr.addPointD0();
                        GetDog frame = new GetDog(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
        btn2.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    if(source == btn2){
                        scr.addPointD1();
                        GetDog frame = new GetDog(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
        btn3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    if(source == btn3){
                        scr.addPointD2();
                        GetDog frame = new GetDog(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });   
    } 

}