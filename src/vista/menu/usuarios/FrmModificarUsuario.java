package vista.menu.usuarios;

import java.awt.Window;
import javax.swing.*;

public class FrmModificarUsuario extends JDialog {


  private JPanel pnlPrincipal;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblUsuario;
    private JTextField txtUsuario;
    private JLabel lblPassword;
    private JTextField txtPassword;
    private JLabel lblDomicilio;
    private JTextField txtDomicilio;
    private JLabel lblDni;
    private JTextField txtDni;
    private JLabel lblFechaNacimiento;
    private JTextField txtFechaNacimiento;
    private JLabel lblRol;
    private JComboBox cbRol;
    private JButton modificarUsuarioButton;

    public FrmModificarUsuario(Window owner, String titulo) {
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
