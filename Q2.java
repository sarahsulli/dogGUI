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

//create class and extend with JFrame
public class Q2 extends JFrame 
{
    //declare variable
    private JPanel contentPane;
    private JFrame theFrame;

    /**
     * Create the frame.
     */
    public Q2()//constructor 
    {

        //set frame title
        setTitle("Question 1");
        //set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //set bounds of the frame
        setBounds(100, 100, 550, 500);                           
        //create object of JPanel
        contentPane = new JPanel();

        //set border
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //set ContentPane
        setContentPane(contentPane);
        //contentPane.setLayout(new FlowLayout());
        contentPane.setSize(new Dimension(600,200));

        contentPane.setBounds(80, 95, 78, 25);
        
        
        //set Label in the frame
        JLabel intro = new JLabel("Question two");
        //set foreground color to the label
        intro.setForeground(Color.BLACK);
        //set font of that label
        intro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
        //set bound of the label
        intro.setBounds(327, 195, 78, 39);
        //add label to the contentPane
        contentPane.add(intro);
        
        
        //create object of JButton and set label on it
        JButton btnNewFrame = new JButton("Next");
        //add actionListener
        btnNewFrame.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                    //call the object of NewWindow and set visible true
                    Q2 frame = new Q2();  /**will become Q3*/
                    frame.setVisible(true);
                    //set default close operation
                    dispose();
                    //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            });
        //set font of the Button
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        //set bounds of the Button
        btnNewFrame.setBounds(280, 195, 78, 25);
        //add Button into contentPane
        contentPane.add(btnNewFrame);


    }
}