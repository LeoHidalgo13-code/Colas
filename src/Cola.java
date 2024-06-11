public class Cola {
    private Nodo primero;
    private Nodo ultimo;
    private static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (colaVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        System.out.println("Se insertó el valor " + dato + " en la cola.");
    }
    public void borrar() {
        if (!colaVacia()) {
            int valorEliminado = primero.dato;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
            System.out.println("Se eliminó el valor " + valorEliminado + " de la cola.");
        } else {
            System.out.println("La cola está vacía. No se puede borrar.");
        }
    }
    public boolean colaVacia() {
        return primero == null;
    }
    public void mostrarCola() {
        Nodo nodoActual = primero;
        System.out.print("Contenido de la cola: ");
        while (nodoActual != null) {
            System.out.print(nodoActual.dato + " ");
            nodoActual = nodoActual.siguiente;
        }
        System.out.println();
    }
     public static void main(String[] args) {
        Cola cola = new Cola();
        //Insertar
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.mostrarCola();
        //Borrar
        cola.borrar();
        cola.borrar();
        cola.mostrarCola();
        //Insertar
        cola.insertar(6);
        cola.insertar(7);
        //Mostrar
        cola.mostrarCola();
    }
}

  

