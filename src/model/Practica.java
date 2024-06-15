package model;

import java.util.ArrayList;

public class Practica {
    private String codigo;
    private String nombre;
    private String grupo;
    private int demoraResultado;
    private TipoValor valor;
    private ArrayList<ValorNumerico> valoresNumericos;
    private ArrayList<ValorString> valoresString;
    public Practica() {
        this.valoresNumericos = new ArrayList<>();
        this.valoresString = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getDemoraResultado() {
        return demoraResultado;
    }

    public void setDemoraResultado(int demoraResultado) {
        this.demoraResultado = demoraResultado;
    }

    public TipoValor getValor() {
        return valor;
    }

    public void setValor(TipoValor valor) {
        this.valor = valor;
    }
}
