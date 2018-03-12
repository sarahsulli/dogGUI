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
        JLabel intro = new JLabel("This application helps determine what breed of dog you should get.");
        JLabel intro2 = new JLabel("another line of text");
        //set foreground color to the label
        intro.setForeground(Color.BLUE);
        //set font of that label
        intro.setFont(new Font("Times New Roman", Font.BOLD, 18));
        //set bound of the label
        intro.setBounds(327, 195, 78, 39);
        //add label to the contentPane 
        contentPane.add(intro);
        contentPane.add(intro2);
        //create object of JButton and set label on it
        JButton btnNewFrame = new JButton("Next");
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
        //set font of the Button
        btnNewFrame.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        //set bounds of the Button
        btnNewFrame.setBounds(280, 195, 78, 25);
        //add Button into contentPane
        contentPane.add(btnNewFrame);

    }

}
