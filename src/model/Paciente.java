package model;

import java.util.ArrayList;

public class Paciente {
    private int dni;
    private String nombre;
    private String domicilio;
    private String mail;
    private String sexo;
    private int edad;
    private ArrayList<Peticion> peticiones;

    public Paciente() {
      this.dni = dni;
      this.nombre = nombre;
      this.domicilio = domicilio;
      this.mail = mail;
      this.edad = edad;
      this.peticiones = new ArrayList<Peticion>();
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Paciente{" +
            "dni=" + dni +
            ", nombre='" + nombre + '\'' +
            ", domicilio='" + domicilio + '\'' +
            ", mail='" + mail + '\'' +
            ", sexo='" + sexo + '\'' +
            ", edad=" + edad +
            ", peticiones=" + peticiones +
            '}';
    }
}
