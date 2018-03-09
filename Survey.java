import java.awt.EventQueue;
import java.awt.Dimension;
/**
 * Write a description of class Survey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Survey
{
    public static void main(String[] args)
    {
        /* It posts an event (Runnable)at the end of Swings event list and is
        processed after all other GUI events are processed.*/
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    //try - catch block
                    try 
                    {
                        //Create object of OldWindow
                        Menu frame = new Menu();
                        //set frame visible true
                        frame.setVisible(true); 
                     
                    } 
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }

                }
            });
    }
}
