import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
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

public class Q5 extends JFrame
{
    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public Q5()//constructor 
    {
        setTitle("Question 5");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 850, 500);                           
        contentPane = new JPanel(new GridLayout(10,0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(233,193,255));
        setContentPane(contentPane);
        contentPane.setSize(new Dimension(600,200));

        JLabel intro = new JLabel("Do you live with young children or seniors?");
        intro.setForeground(Color.BLACK);
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        contentPane.add(intro);

        ButtonGroup group = new ButtonGroup();
        final JRadioButton btn1 = new JRadioButton("Children");btn1.setSelected(false); 
        final JRadioButton btn2 = new JRadioButton("Seniors");btn2.setSelected(false);    
        final JRadioButton btn3 = new JRadioButton("Children and Seniors");btn3.setSelected(false); 
        final JRadioButton btn4 = new JRadioButton("None");btn4.setSelected(false);     
        btn1.setForeground(Color.BLACK);
        btn2.setForeground(Color.BLACK);
        btn3.setForeground(Color.BLACK);    
        btn4.setForeground(Color.BLACK);
        btn1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        btn2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        btn3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        btn4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22)); 
        group.add(btn1);
        group.add(btn2);     
        group.add(btn3);                 
        group.add(btn4);                 
        contentPane.add(btn1);
        contentPane.add(btn2);
        contentPane.add(btn3);
        contentPane.add(btn4);

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
                        Q6 frame = new Q6(); 
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
        //kids
        btn1.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent event) {
                    JRadioButton source = (JRadioButton) event.getSource();
                    Scores scr = new Scores();
                    if (source==btn1) {
                        scr.addPointD0();
                        scr.addPointD1();
                        scr.addPointD3();
                        scr.addPointD14();
                        Q6 frame = new Q6();
                        frame.setVisible(true);
                    }
                    dispose();
                }

            });
        //seinors
        btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event) {
                    JRadioButton source = (JRadioButton) event.getSource();
                    Scores scr = new Scores();
                    if (source==btn2) {  
                        scr.addPointD3();
                        scr.addPointD4();  
                        scr.addPointD3();
                        scr.addPointD8();
                        scr.addPointD9();
                        scr.addPointD10();
                        Q6 frame = new Q6(); 
                        frame.setVisible(true);
                    }

                    dispose();
                }

            });
        //both
        btn3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event) {
                    JRadioButton source = (JRadioButton) event.getSource();
                    Scores scr = new Scores();
                    if (source==btn3) {  
                        scr.addPointD0();
                        scr.addPointD1();
                        scr.addPointD3();
                        scr.addPointD14();
                        scr.addPointD3();
                        scr.addPointD4();  
                        scr.addPointD3();
                        scr.addPointD8();
                        scr.addPointD9();
                        scr.addPointD10();
                        Q6 frame = new Q6(); 
                        frame.setVisible(true);
                    }

                    dispose();
                }

            });    
        //both
        btn4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event) {
                    JRadioButton source = (JRadioButton) event.getSource();
                    Scores scr = new Scores();
                    if (source==btn4) {  

                        Q6 frame = new Q6(); 
                        frame.setVisible(true);
                    }

                    dispose();
                }

            });   
    } 

}