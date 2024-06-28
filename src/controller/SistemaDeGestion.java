package controller;

import model.Paciente;
import model.RolUsuario;
import model.Sucursal;
import model.Usuario;

import java.util.ArrayList;

public class SistemaDeGestion {
    private static SistemaDeGestion instance;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Paciente> pacientes;
    private SistemaDeGestion() {
        this.usuarios = new ArrayList<>();
        this.sucursales = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }
    public static SistemaDeGestion getInstance() {
        if (instance == null) {
            instance = new SistemaDeGestion();
        }
        return instance;
    }
    public void altaUsuario(Usuario nuevoUsuario) {
        this.usuarios.add(nuevoUsuario);
    }
    public void altaSucursal(Sucursal sucursal) {
        //TODO
    }
    public void eliminarSucursal(int sucursalId) {
        //TODO
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }
}
