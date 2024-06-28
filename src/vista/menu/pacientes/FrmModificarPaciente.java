package vista.menu.pacientes;

import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmModificarPaciente extends JDialog {

  private JPanel pnlPrincipal;
  private JLabel lblDni;
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

  public FrmModificarPaciente(Window owner, String titulo) {
    super(owner, titulo);
    setContentPane(pnlPrincipal);
    setModal(true);
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    asociarEventos();
  }

  private void asociarEventos() {
  }

}
