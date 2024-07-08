package vista.menu.pacientes;

import controller.AtencionAlPublico;
import model.Paciente;
import utils.TablePaciente;

import javax.swing.*;
import java.awt.*;

public class FrmModificarPaciente extends JDialog {

  private Paciente p; //Lo recibe por parametro desde el llamado a ModificarPaciente tras buscar por DNI, ya se sabe a que paciente se quiere modificar
  private JPanel pnlPrincipal;
  private JTextField txtDni;
  private JLabel lblNombre;
  private JTextField txtNombre;
  private JLabel lblDomicilio;
  private JTextField txtDomicilio;
  private JTextField txtMail;
  private JLabel lblSexo;
  private JTextField txtSexo;
  private JLabel lblEdad;
  private JTextField txtEdad;
  private JButton modificarInformacionButton;
  private JLabel lblMail;
  private JLabel lblModificar;

  public FrmModificarPaciente(Window owner, String titulo, AtencionAlPublico atencionAlPublico,
      TablePaciente tableModel, Paciente p) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    asociarEventos(atencionAlPublico, tableModel);
  }

  private void asociarEventos(AtencionAlPublico atencionAlPublico, TablePaciente tableModel) {
    modificarInformacionButton.addActionListener(e -> {
      //String dniInput = txtDni.getText();
      String nombre = txtNombre.getText();
      String domicilio = txtDomicilio.getText();
      String mail = txtMail.getText();
      String sexo = txtSexo.getText();
      String edadInput = txtEdad.getText();
      try {
        //int dni=Integer.parseInt(dniInput);
        int edad=Integer.parseInt(edadInput);
        if (/**dniInput.isEmpty() || **/nombre.isEmpty() || domicilio.isEmpty() || mail.isEmpty() || sexo.isEmpty() || edadInput.isEmpty()) {
          JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        } /**else if (!atencionAlPublico.existePaciente(dni)) {
          JOptionPane.showMessageDialog(this, "No existe un paciente con ese DNI", "Error", JOptionPane.ERROR_MESSAGE);
        }**/
        else {
          //Paciente p = atencionAlPublico.buscarPaciente(dni);
          //tableModel.remove(dni);
          //p.setDni(dni);
          p.setNombre(nombre);
          p.setDomicilio(domicilio);
          p.setMail(mail);
          p.setSexo(sexo);
          p.setEdad(edad);
          tableModel.add(p.getDni(), nombre, domicilio, mail, sexo, edad); //1er parametro dni indicado en la pantalla anterior
          JOptionPane.showMessageDialog(this, "Paciente modificado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
          dispose();
        }
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "DNI y Edad deben ser números", "Error", JOptionPane.ERROR_MESSAGE);
      }
    });
  }
}
