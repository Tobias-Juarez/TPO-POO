package controller;

import model.Paciente;
import model.RolUsuario;
import model.Sucursal;
import model.Usuario;

import java.util.ArrayList;

public class SistemaDeGestion {
    private static SistemaDeGestion instance;
    private ArrayList<Usuario> usuarios;

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

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
    public void altaUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public void altaSucursal(int id, String direccion, int numero, boolean peticionesResultadosFinalizados) {
        Sucursal sucursal= new Sucursal(id, direccion, numero, peticionesResultadosFinalizados);
        this.sucursales.add(sucursal);}


    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    @Override
    public String toString() {
        return "SistemaDeGestion{" +
            "usuarios=" + usuarios +
            ", sucursales=" + sucursales +
            ", pacientes=" + pacientes +
            '}';
    }
    public boolean existeUsuario(String usuario) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }

    public Usuario buscarUsuario(String usuario) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                return u;
            }
        }
        return null;
    }

    public void bajaUsuario(String usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(usuario)) {
                usuarios.remove(i);
                return;
            }
        }
    }

  public boolean existeSucursal(int id) {
      for (Sucursal s : sucursales) {
          if (s.getId()== id) {
              return true;
          }
      }
      return false;
  }

    public Sucursal buscarSucursal(int id) {
        for (Sucursal s : sucursales) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void bajaSucursal(int id) {
        for (int i = 0; i < sucursales.size(); i++) {
            if (sucursales.get(i).getId() == id) {
                sucursales.remove(i);
                return;
            }
        }
    }
}
