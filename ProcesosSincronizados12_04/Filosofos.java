package ProcesosSincronizados12_04;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Filosofos implements Runnable{
    private Semaphore[] tenedores;
    private int id;
    private Random rand = new Random();

    public Filosofos() {
    }

    public Filosofos(int id, Semaphore[] tenedores) {
        this.id = id;
        this.tenedores = tenedores;
    }

    //Método para comer
    private void comer() throws InterruptedException{

        //Intenta adquirir tenedores
        tenedores[id].acquire();
        tenedores[(id + 1) % tenedores.length].acquire();

        //Come
        System.out.println("Filósofo "+id+" Comiendo");

        //Libera tenedores
        tenedores[id].release();
        tenedores[(id +1) % tenedores.length].release();

        //Espera tiempo aleatorio
        Thread.sleep(rand.nextInt(4000) + 1000);
    }

    //Método para pensar
    private void pensar() throws InterruptedException{

        //Piensa
        System.out.println("El filósofo "+id+" está pensando");

        //Espera un tiempo aleatorio
        Thread.sleep(rand.nextInt(4000) + 1000);
    }

    @Override
    public void run() {
        while (true){
            try{
                comer();
                pensar();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
