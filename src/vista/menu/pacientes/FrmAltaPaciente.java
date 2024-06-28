package vista.menu.pacientes;

import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrmAltaPaciente extends JDialog {

  private JPanel pnlPrincipal;
  private JTextField txtDni;
  private JTextField txtNombre;
  private JTextField txtDomicilio;
  private JTextField txtMail;
  private JTextField txtSexo;
  private JLabel lblDni;
  private JLabel lblNombre;
  private JLabel lblDomicilio;
  private JLabel lblSexo;
  private JTextField txtEdad;
  private JLabel lblEdad;
  private JButton darDeAltaButton;

  public FrmAltaPaciente(Window owner, String titulo) {
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
