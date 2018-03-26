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

public class Q11 extends JFrame
{
    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public Q11()//constructor 
    {
        setTitle("Question 11");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 850, 500);   
        
        contentPane = new JPanel(new GridLayout(10,0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(new Color(233,193,255));
        contentPane.setSize(new Dimension(600,200));

        JLabel intro = new JLabel("Do you want a common dog or a unique breed?");
        intro.setForeground(Color.BLACK);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        contentPane.add(intro);

        ButtonGroup group = new ButtonGroup();
        final JRadioButton btn1 = new JRadioButton("I don't care");btn1.setSelected(false);       
        final JRadioButton btn2 = new JRadioButton("Unique!");btn2.setSelected(false);  
        btn1.setForeground(Color.BLACK);
        btn2.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        btn2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        group.add(btn1);
        group.add(btn2);           
        contentPane.add(btn1);
        contentPane.add(btn2);

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
                        Q12 frame = new Q12(); 
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
                        Q12 frame = new Q12(); 
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
                        scr.addPointD6();//+3/4 pt
                        scr.addPointD12();
                        scr.addPointD13();
                        scr.addPointD14();
                        scr.addPointD6();
                        scr.addPointD12();
                        scr.addPointD13();
                        scr.addPointD14();
                        scr.addPointD6();
                        scr.addPointD12();
                        scr.addPointD13();
                        scr.addPointD14();                      
                        scr.addPointD6();
                        scr.addPointD12();
                        scr.addPointD13();
                        scr.addPointD14();
                        
                        Q12 frame = new Q12(); 
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
    }
}
