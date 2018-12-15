
package hilos;
public class Hilos 
{
    public static void main(String [] args)
    {
           Hilo1 hilo1 = new Hilo1(); // LLAMA AL HILO1 QUE UTILIZA 
           hilo1.start();
           
           Thread hilo2 =new Thread(new Hilo2()); //LLAMA AL HILO2 QUE UTILIZA EL MÉTODO IMPLEMENTS
           hilo2.start();

        
    }
 

    
}
