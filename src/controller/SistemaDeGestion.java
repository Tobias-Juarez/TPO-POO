package controller;

import model.Paciente;
import model.RolUsuario;
import model.Sucursal;
import model.Usuario;

import java.util.ArrayList;

public class SistemaDeGestion {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Paciente> pacientes;
    public SistemaDeGestion() {
        this.usuarios = new ArrayList<>();
        this.sucursales = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }
    public void altaUsuario(String nombre, String usuario, String password, RolUsuario rol) {
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setUsuario(usuario);
        nuevoUsuario.setPassword(password);
        nuevoUsuario.setRol(rol);
        this.usuarios.add(nuevoUsuario);
    }
    public void altaSucursal(Sucursal sucursal) {
        //TODO
    }
    public void eliminarSucursal(int sucursalId) {
        //TODO
    }
}
