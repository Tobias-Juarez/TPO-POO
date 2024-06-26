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

    public void altaPaciente(int dni, String nombre, String domicilio, String mail, String sexo, int edad) {
        Paciente paciente = new Paciente();
        paciente.setDni(dni);
        paciente.setNombre(nombre);
        paciente.setDomicilio(domicilio);
        paciente.setMail(mail);
        paciente.setSexo(sexo);
        paciente.setEdad(edad);
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

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
}
