package model;

import java.util.ArrayList;

public class Resultado {
    private ArrayList<Valor> datos;
    public Resultado() {
        this.datos = new ArrayList<>();
    }
    public void addDato(Valor dato) {
        this.datos.add(dato);
    }
}
