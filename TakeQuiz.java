import java.awt.EventQueue;
/**
 * Write a description of class TakeQuiz here.
 *
 * @author (Sarah Sullivan)
 * @version (3/23/2018)
 */
public class TakeQuiz
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
                        //Create object of Menu
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
