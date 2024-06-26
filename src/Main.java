import controller.AtencionAlPublico;
import java.util.ArrayList;
import model.Paciente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AtencionAlPublico controller= new AtencionAlPublico();
        controller.altaPaciente(424242, "toto", "garay 1", "mail", "masc", 21);
        ArrayList<Paciente> pacientes= controller.getPacientes();
        System.out.println(pacientes.get(0));
    }
}