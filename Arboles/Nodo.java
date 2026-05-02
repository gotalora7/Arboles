package Arboles;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    public int valor;
    public List<Nodo> hijos;

    public Nodo(int valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }
}