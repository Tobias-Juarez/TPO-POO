package controller;

import model.Muestra;
import model.Practica;
import model.Resultado;

import java.util.ArrayList;

public class Laboratorio {
    private static Laboratorio instance;
    private ArrayList<Practica> practicas;
    private ArrayList<Resultado> resultados;
    private ArrayList<Muestra> muestras;
    private Laboratorio() {
        this.practicas = new ArrayList<>();
        this.resultados = new ArrayList<>();
        this.muestras = new ArrayList<>();
    }
    public static Laboratorio getInstance() {
        if (instance == null) {
            instance = new Laboratorio();
        }
        return instance;
    }
    public void altaPractica(Practica practica) {
        //TODO
    }
    public void cargarResultado(Resultado resultado) {
        //TODO
    }
    public void procesarMuestra(Muestra muestra) {
        //TODO
    }
}
