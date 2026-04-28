import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] datos = {80, 10, 40, 20, 60, 30, 70, 50};
        
        Arrays.sort(datos);
        System.out.println("Lista ordenada: " + Arrays.toString(datos));

        ArbolPro arbol = new ArbolPro();
        arbol.raiz = arbol.construirBalanceado(datos, 0, datos.length - 1);

        System.out.println("\n--- ESTRUCTURA DEL ÁRBOL (List<Nodo>) ---");
        arbol.imprimir(arbol.raiz, "");

        System.out.println("\n--- MÉTRICAS ---");
        System.out.println("Altura: " + arbol.getAltura(arbol.raiz));
        
        System.out.println("\nJustificación: Se usa un Árbol General con List<Nodo> " +
                           "limitado a 2 hijos para garantizar un balanceo óptimo.");
    }
}