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

public class Q8 extends JFrame
{
    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public Q8()//constructor 
    {
        setTitle("Question 8");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 850, 500);  
        
        contentPane = new JPanel(new GridLayout(10,0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(233,193,255));
        contentPane.setSize(new Dimension(600,200));

        JLabel intro = new JLabel("How smart do you want your dog to be?");
        intro.setForeground(Color.BLACK);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        contentPane.add(intro);

        ButtonGroup group = new ButtonGroup();
        final JRadioButton btn1 = new JRadioButton("Very");btn1.setSelected(false);       
        final JRadioButton btn2 = new JRadioButton("Somewhat");btn2.setSelected(false);  
        final JRadioButton btn3 = new JRadioButton("Not");btn3.setSelected(false);
        btn1.setForeground(Color.BLACK);
        btn2.setForeground(Color.BLACK);
        btn3.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        btn2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        btn3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        group.add(btn1);
        group.add(btn2);    
        group.add(btn3); 
        contentPane.add(btn1);
        contentPane.add(btn2);
        contentPane.add(btn3);

        final JButton btnNewFrame = new JButton("Next");
        final JButton btnQuitFrame = new JButton("Quit");
        btnQuitFrame.setForeground(Color.RED);
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        btnQuitFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        contentPane.add(btnNewFrame);
        contentPane.add(btnQuitFrame);        

        btnNewFrame.addActionListener(new ActionListener()
            {

                public void actionPerformed(ActionEvent click)
                {
                    Object source = click.getSource();
                    if(source == btnNewFrame){
                        Q9 frame = new Q9(); 
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
                    if(source == btn1){
                        scr.addPointD0();
                        scr.addPointD2();
                        scr.addPointD3();
                        scr.addPointD7();

                        Q9 frame = new Q9(); 
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
                        scr.addPointD5();
                        scr.addPointD8();
                        scr.addPointD9();
                        scr.addPointD10();
                        scr.addPointD12();
                        scr.addPointD13();
                                 
                        Q9 frame = new Q9(); 
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
                        scr.addPointD4();
                        scr.addPointD6();
                        scr.addPointD11();
                        scr.addPointD14();

                        Q9 frame = new Q9(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
   
    } 

}
