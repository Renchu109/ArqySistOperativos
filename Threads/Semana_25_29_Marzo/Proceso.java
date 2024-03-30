package Threads.Semana_25_29_Marzo;

public class Proceso extends Thread{
    //Al extender Thread, la clase Proceso hereda todas las funcionalidades proporcionadas por Thread y puede ser utilizada para crear hilos en Java.

    //Declaración de variable id
    public int id;

    public Proceso(String name, int id) {
        super(name);
        this.id = id;
    }
    //Constructor de la clase proceso.Este constructor invoca al constructor de la clase madre Thread pasando el nombre del hilo como argumento (name).

    //Este método run() es donde se define el comportamiento del hilo.
    //Cuando el hilo se inicia (usando el método start()),este método se ejecutará en paralelo con otros hilos.
    //En este caso, simplemente imprime un mensaje que indica el nombre del hilo y su identificador (id).
    public void run(){
        System.out.println("Soy un proceso "+this.getName()+" "+id);
    }


    //En resumen, esta clase Proceso define un hilo en Java que imprimirá un mensaje indicando su nombre y su identificador cuando se inicie.
    //Este hilo se puede iniciar mediante la creación de una instancia de Proceso y llamando al método start() en esa instancia.
}
