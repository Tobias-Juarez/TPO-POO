package controller;

import model.Paciente;
import model.Peticion;
import model.Usuario;

import java.util.ArrayList;

public class AtencionAlPublico {
    private ArrayList<Paciente> pacientes;
    private ArrayList<Peticion> peticiones;
    private ArrayList<Usuario> usuarios;

    public AtencionAlPublico() {
        this.pacientes = new ArrayList<>();
        this.peticiones = new ArrayList<>();
    }

    public void altaPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public void eliminarPaciente(int dni) {
        this.pacientes.removeIf(paciente -> paciente.getDni() == dni);
    }

    public void altaPeticion(Peticion peticion) {
        this.peticiones.add(peticion);
    }
    public void verResultados(Paciente paciente) {
        //TODO
    }
    public void listarPeticionesConValoresCriticos() {
        //TODO
    }
    public void consultarResultados(Peticion peticionId) {
        //TODO
    }
}
