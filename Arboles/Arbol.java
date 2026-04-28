package Arboles;

public class Arbol {
    Nodo raiz;

   public Nodo construirBalanceado(int[] arr, int inicio, int fin) {
        if (inicio > fin) return null;

        int medio = (inicio + fin) / 2;
        Nodo nuevo = new Nodo(arr[medio]);

        // Guardamos los hijos en la lista
        Nodo izq = construirBalanceado(arr, inicio, medio - 1);
        Nodo der = construirBalanceado(arr, medio + 1, fin);

        if (izq != null) nuevo.hijos.add(izq);
        if (der != null) nuevo.hijos.add(der);

        return nuevo;
    }

    public void imprimir(Nodo n, String tab) {
        if (n == null) return;
        System.out.println(tab + "└── " + n.valor);
        for (Nodo h : n.hijos) {
            imprimir(h, tab + "    ");
        }
    }

    public int getAltura(Nodo n) {
        if (n == null) return 0;
        int max = 0;
        for (Nodo h : n.hijos) {
            max = Math.max(max, getAltura(h));
        }
        return 1 + max;
    }
}