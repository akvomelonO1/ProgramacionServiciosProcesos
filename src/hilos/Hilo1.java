package hilos;

public class Hilo1  extends Thread
{
    @Override
    public void run()
    {
        for ( int i=0 ;i<=5 ;i++)
            {
                System.out.println("HILO 1");

            }
        
    }

}
