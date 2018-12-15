
package HilosConParametros;

public class Proceso extends Thread
{
    int num_int;
    
    public Proceso(String nombreHilo)
    {
        super(nombreHilo);
    }
    
    @Override
    public void run()
    {
        for ( int i=0 ;i<=num_int ;i++)
            {
                System.out.println(i+(this.getName()));

            }
        System.out.println("");
        
    }
    
    //MÉTODO QUE RECOGE EL VALOR QUE L
    public void ValorDeLaCondicion(int valor)
    {
        this.num_int=valor;
    }
    
    public static void main(String [] args)
    {
        Proceso hilo1 = new Proceso(" Hilo1 ");
        Proceso hilo2 = new Proceso(" Hilo2 ");
        Proceso hilo3 = new Proceso(" Hilo3 ");
        
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);
        hilo3.ValorDeLaCondicion(7);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }

}

