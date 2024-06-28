package vista.menu.pacientes;

import model.RolUsuario;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrmPacientes extends JDialog {

  private JPanel pnlPrincipal;
  private JButton crearPacienteButton;
  private JButton modificarPacienteButton;
  private JButton eliminarPacienteButton;
  private FrmPacientes self;

  public FrmPacientes(Window owner, String titulo, RolUsuario rol) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    this.self = this;
    asociarEventos(rol);
  }

  private void asociarEventos(RolUsuario rol) {
    if (rol == RolUsuario.RECEPCIONISTA) {
      eliminarPacienteButton.setEnabled(false);
    }
    crearPacienteButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmAltaPaciente frame = new FrmAltaPaciente(self,"Alta Paciente");
        frame.setVisible(true);

      }
    });
    modificarPacienteButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmModificarPaciente frame = new FrmModificarPaciente(self,"Modificar Paciente");
        frame.setVisible(true);

      }
    });
    eliminarPacienteButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrmBajaPaciente frame = new FrmBajaPaciente(self,"Baja Paciente");
        frame.setVisible(true);

      }
    });
  }

}
