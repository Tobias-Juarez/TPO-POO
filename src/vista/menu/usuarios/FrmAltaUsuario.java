package vista.menu.usuarios;

import java.awt.Window;
import javax.swing.*;

public class FrmAltaUsuario extends JDialog {


  private JPanel pnlPrincipal;
    private JTextField txtNombre;
  private JTextField txtEmail;
  private JTextField txtUsuario;
  private JTextField txtPassword;
  private JTextField txtDomicilio;
  private JTextField txtDni;
  private JTextField txtFechaNacimiento;
  private JComboBox cbRol;
  private JButton crearUsuarioButton;
  private JLabel lblNombre;
  private JLabel lblEmail;
  private JLabel lblUsuario;
  private JLabel lblPassword;
  private JLabel lblDomicilio;
  private JLabel lblDni;
  private JLabel lblFechaNacimiento;
  private JLabel lblRol;

  public FrmAltaUsuario(Window owner, String titulo) {
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
