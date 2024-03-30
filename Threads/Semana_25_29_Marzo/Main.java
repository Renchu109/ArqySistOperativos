package Threads.Semana_25_29_Marzo;

public class Main {
    public static void main(String[] args) {

        //Creación de instancias de "Proceso", cada una tiene asignada una tarea ficticia
        Proceso p1 = new Proceso("Llamar a impresora",1);
        Proceso p2 = new Proceso("Grabar el disco",2);
        Proceso p3 = new Proceso("Ejecutar programa suma",3);
        Proceso p4 = new Proceso("Tomar datos casilla 001",4);

        //Iniciación de cada hilo creado utilizando el método start()
        //El método start() es de la calse Thread y se utiliza para iniciar la ejecución del hilo
        //Una vez iniciado, cada hilo ejecutará su método run() en paralelo con los otros hilos.
        p1.start();
        p2.start();
        p3.start();
        p4.start();


        //En resumen, la clase Main se utiliza para iniciar varios hilos (Proceso) que ejecutan tareas simuladas de forma simultánea.
        //Cada hilo representa una tarea diferente y ejecutará su propio método run(),
        //que imprimirá un mensaje indicando el nombre del proceso y su identificador.
    }
}
