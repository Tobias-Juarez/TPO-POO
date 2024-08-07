package model;

import java.util.ArrayList;

public class Practica {
    private String codigo;
    private String nombre;

    @Override
    public String toString() {
        return "Practica{" +
            "codigo='" + codigo + '\'' +
            ", nombre='" + nombre + '\'' +
            ", grupo='" + grupo + '\'' +
            ", demoraResultado=" + demoraResultado +
            ", valor=" + valor +
            ", valoresNumericos=" + valoresNumericos +
            ", valoresString=" + valoresString +
            '}';
    }

    private String grupo;
    private int demoraResultado;
    private TipoValor valor;
    private ArrayList<ValorNumerico> valoresNumericos;
    private ArrayList<ValorString> valoresString;
    public Practica(String codigo, String nombre, String grupo, int demoraResultado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.grupo = grupo;
        this.demoraResultado = demoraResultado;
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
