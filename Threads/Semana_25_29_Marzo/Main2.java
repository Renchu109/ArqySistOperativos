package Threads.Semana_25_29_Marzo;

public class Main2 {
    public static void main(String[] args) {

        //Se crea un arreglo de tipo Proceso con capacidad para cinco elementos.
        //Este arreglo se utilizará para almacenar las instancias de la clase Proceso que se crearán a continuación.
        Proceso[] procesos = new Proceso[5];


        //Este bucle for itera cinco veces, creando una instancia de Proceso en cada iteración,
        //asignando un nombre único y un identificador único a cada proceso. Luego, cada proceso se inicia llamando al método start().
        for (int i=0;i < 5; i++){

            procesos[i] = new Proceso("Proceso" +i,i);

            procesos[i].start();

            //Bloque try-catch que intenta unir (mediante un método join()) el primer proceso en cada iteración.
            try {procesos[0].join();}
            catch(Exception E) {}

            //Es importante destacar que el join() se llama en cada iteración del bucle,
            //lo que significa que el hilo principal esperará por el primer proceso en terminar en cada iteración,
            //en lugar de esperar por todos los procesos al mismo tiempo.
        }

        //En resumen, la clase Main2 se utiliza para crear y ejecutar múltiples hilos (Proceso) de manera secuencial,
        //donde cada hilo espera a que el primer hilo creado finalice antes de continuar con la creación del siguiente hilo.
    }
}
