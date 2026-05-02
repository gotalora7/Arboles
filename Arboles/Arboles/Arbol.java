package Arboles;

import java.util.ArrayList;
import java.util.List;

class Nodo {
    public int valor;
    public List<Nodo> hijos;

    public Nodo(int valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }
}

public class Arbol {
    public Nodo raiz;

    public Nodo construirBalanceado(int[] arr, int inicio, int fin) {
        if (inicio > fin) return null;

        int medio = (inicio + fin) / 2;
        Nodo nuevo = new Nodo(arr[medio]);

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
}