package vista.menu.usuarios;

import java.awt.Window;
import javax.swing.*;

public class FrmBajaUsuario extends JDialog {


  private JPanel pnlPrincipal;
  private JLabel lblSucursal;
  private JTextField txtIdSucursal;
  private JButton darDeBajaButton;

  public FrmBajaUsuario(Window owner, String titulo) {
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
