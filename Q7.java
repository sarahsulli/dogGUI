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

public class Q7 extends JFrame
{
    private JPanel contentPane;
    private Scores Scores;

    /**
     * Create the frame.
     */
    public Q7()//constructor 
    {
        setTitle("Question 7");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 850, 500);                           

        contentPane = new JPanel(new GridLayout(10,0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(233,193,255));
        contentPane.setSize(new Dimension(600,200));

        JLabel intro = new JLabel("How much training do you plan on doing?");
        intro.setForeground(Color.BLACK);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));;
        contentPane.add(intro);

        ButtonGroup group = new ButtonGroup();
        final JRadioButton btn1 = new JRadioButton("Teach my dog only the basics");btn1.setSelected(false);       
        final JRadioButton btn2 = new JRadioButton("I consider training an ongoing process");btn2.setSelected(false);     
        btn1.setForeground(Color.BLACK);
        btn2.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18)); 
        btn2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18)); 
        group.add(btn1);
        group.add(btn2);                 
        contentPane.add(btn1);
        contentPane.add(btn2);

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
                    Object source = click.getSource();
                    if(source == btnNewFrame){
                        Q8 frame = new Q8(); 
                        frame.setVisible(true);
                    }    

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

        btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    //adding points (making sure click on button and pressed next!!)
                    if(source == btn1){
                        scr.addPointD0();
                        scr.addPointD1();
                        scr.addPointD4();
                        scr.addPointD5();
                        scr.addPointD6();
                        scr.addPointD8();
                        scr.addPointD9();
                        scr.addPointD10();
                        scr.addPointD11();
                        scr.addPointD12();
                        scr.addPointD13();
                        scr.addPointD14();

                        Q8 frame = new Q8(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
        //dog can shed
        btn2.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    Scores scr = new Scores();
                    if(source == btn2){                        
                        scr.addPointD2();
                        scr.addPointD3();
                        scr.addPointD7();
                                  
                        Q8 frame = new Q8(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
   
    } 

}